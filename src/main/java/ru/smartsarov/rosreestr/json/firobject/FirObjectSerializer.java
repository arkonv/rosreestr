package ru.smartsarov.rosreestr.json.firobject;

import static ru.smartsarov.rosreestr.Constants.ROSREESTR_AREA_TYPES;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_UNITS;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public final class FirObjectSerializer implements JsonSerializer<FirObject> {
	Map<String, String> oksType = new HashMap<>();
	//TODO
	@Override
	public JsonElement serialize(FirObject src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject result = new JsonObject();
		JsonObject oks = new JsonObject();
		JsonObject util = new JsonObject();
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("ru", "RU"));
		nf.setGroupingUsed(true);
		nf.setMaximumFractionDigits(2);
		
		//DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		DateFormat formatIn = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat formatOut = new SimpleDateFormat("dd.MM.yyyy");

		result.addProperty("Кадастровый номер", src.getObjectData().getObjectCn());
		result.addProperty("Кадастровый квартал", src.getParcelData().getCadastralBlockId());
		result.addProperty("Полный номер права", src.getObjectData().getObjectCon());
		result.addProperty("Адрес", src.getObjectData().getAddressNote());
		result.addProperty("Тип объекта", src.getType().equals("parcel") ? "Земельный участок/Объект капитального строительства" : src.getType().equals("premises") ? "Квартира/помещение" : "Неизвестно");
		result.addProperty("Тип категории", src.getParcelData().getCategoryTypeValue());
		result.addProperty("Гуид", src.getParcelData().getGuidUl());
		
		//result.addProperty("Кадастровая стоимость", String.format("%,2f"/*"|%.2f|"*/, (double)src.getParcelData().getCadCost()) + " " + ROSREESTR_UNITS.get(src.getParcelData().getCadUnit()));
		String cadUnit = "";
		String areaType = "";
		String areaUnit = "";
		try {
			cadUnit = " " + ROSREESTR_UNITS.get(src.getParcelData().getCadUnit());
		} catch (NullPointerException e) {
			// В случае отсутствия данных не выводим эту информацию.
		}
		try {
			areaType = ROSREESTR_AREA_TYPES.get(src.getParcelData().getAreaType());
		} catch (NullPointerException e) {
			// В случае отсутствия данных не выводим эту информацию.
		}
		try {
			areaUnit = " " + ROSREESTR_UNITS.get(src.getParcelData().getAreaUnit());
		} catch (NullPointerException e) {
			// В случае отсутствия данных не выводим эту информацию.
		}
		/*if (src.getParcelData().getCadUnit() != null && src.getParcelData().getCadUnit() != "")
			cadUnit = " " + ROSREESTR_UNITS.get(src.getParcelData().getCadUnit());*/
		result.addProperty("Кадастровая стоимость", nf.format(src.getParcelData().getCadCost()) + cadUnit);
		result.addProperty(areaType, nf.format(src.getParcelData().getAreaValue()) + areaUnit);
		result.addProperty("Тип объекта", src.getObjectData().getObjectName());
		result.addProperty("Код ОКАТО", src.getObjectData().getObjectAddress().getOkato());
		result.addProperty("Код КЛАДР", src.getObjectData().getObjectAddress().getKladr());
		result.addProperty("Действующие права зарегистрированы в ЕГРН", src.getParcelData().getRightsReg().equals(Boolean.TRUE) ? "Да" : src.getParcelData().getRightsReg().equals(Boolean.FALSE) ? "Нет" : "Неизвестно");
		try {
			result.addProperty("Дата обновления атрибутов", src.getFirActualDate() == null ? null : formatOut.format(formatIn.parse(src.getFirActualDate())));
			result.addProperty("Дата постановки на учёт", src.getParcelData().getDateCreate() == null ? null : formatOut.format(formatIn.parse(src.getParcelData().getDateCreate())));
			result.addProperty("Дата снятия с учёта", src.getParcelData().getDateRemove() == null ? null : formatOut.format(formatIn.parse(src.getParcelData().getDateRemove())));
			result.addProperty("Дата внесения кадастровой стоимости", src.getParcelData().getDateCost() == null ? null : formatOut.format(formatIn.parse(src.getParcelData().getDateCost())));
			//result.addProperty("Дата изменения сведений в ГКН", src.getParcelData().get());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		result.addProperty("Номер регионального подразделения Росреестра", src.getRegionKey());
		result.addProperty("Статус объекта недвижимости", src.getParcelData().getParcelStatusStr());
		
		util.addProperty("Описание", src.getParcelData().getUtilCodeDesc());
		util.addProperty("Список разрешённых использований", src.getParcelData().getUtilByDoc());
		if (util.entrySet().stream().anyMatch(k -> !k.getValue().isJsonNull())) {
			result.add("Разрешенное использование", util);
		}

		oks.addProperty("Является ОКС", src.getParcelData().getOksFlag().equals(1) ? "Да" : "Нет");
		if (src.getParcelData().getOksType() != null) {
			oks.addProperty("Тип ОКС", src.getParcelData().getOksType().equals("building") ? "Здание" : src.getParcelData().getOksType().equals("flat") ? "Квартира" : src.getParcelData().getOksType());
		}
		oks.addProperty("Общая этажность", src.getParcelData().getOksFloors());
		oks.addProperty("Подземная этажность", src.getParcelData().getOksUFloors());
		oks.addProperty("Инвентарная стоимость", src.getParcelData().getOksInventoryCost());
		oks.addProperty("Материал стен", src.getParcelData().getOksElementsConstructStr());
		oks.addProperty("Год постройки", src.getParcelData().getOksYearBuilt());
		oks.addProperty("Год ввода в эксплуатацию", src.getParcelData().getOksYearUsed());
		oks.addProperty("Кадастровая организация", src.getParcelData().getOksExecutor() == null ? src.getParcelData().getCoName() : src.getParcelData().getOksExecutor());
		oks.addProperty("ИНН кадастровой организации", src.getParcelData().getOksInn() == null ?  src.getParcelData().getCoInn() : src.getParcelData().getOksInn());
		result.add("ОКС", oks);
		
		// TODO Сведения о предыдущих номерах объекта
		// TODO plan.html
		//ldNumbers
		
		//result.add("facialHair", context.serialize(src.getFacialHair()));

		return result;
	}
}