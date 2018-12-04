package ru.smartsarov.rosreestr;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static java.util.Map.entry;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public final class Constants {
	/** PKK5 Rosreestr API */
	public static final String PKK5_API_URL = "http://pkk5.rosreestr.ru/api/features/";

	/****** Rosreestr API ******/
	
	/* 1. Получение региональной информации */
	/** <b>1.1 Получение списка макро-регионов</b>
	 */
	public static final String ROSREESTR_API_MACRO_REGIONS_URL = "http://rosreestr.ru/api/online/macro_regions";
	
	/** <b>1.2 Получение дочерних регионов по идентификатору родителя</b>
	 * <br>Пример: http://rosreestr.ru/api/online/regions/104201000000
	 */
	public static final String ROSREESTR_API_REGIONS_URL = "http://rosreestr.ru/api/online/regions/";
	
	/** <b>1.3 Получение списка типов дочерних регионов</b>
	 * <br>Пример: http://rosreestr.ru/api/online/region_types/104201000000
	 */
	public static final String ROSREESTR_API_REGION_TYPES_URL = "http://rosreestr.ru/api/online/region_types/";


	/** <b>2. Получение информации о земельном участке или объекте недвижимости по идентификатору</b>
	 *	<b>http://rosreestr.ru/api/online/fir_object/{object-id}. {object-id} - идентификатор объекта из {@link ROSREESTR_API_NUMBER_URL}</b>
	 * 	<br>Пример: http://rosreestr.ru/api/online/fir_object/2:56:30302:639
	 */
	public static final String ROSREESTR_API_OBJECT_ID_URL = "http://rosreestr.ru/api/online/fir_object/";
	
	/* Поиск объекта недвижимости */
	/** <b>2.1 Поиск объекта недвижимости по номеру (кадастровому, условному, устаревшему, номеру права и ограничения)</b>
	 *	<br>Результатом поиска будет 0 или множество (не больше 200) объектов, удовлетворяющих маске номера.
	 *	<br>Пример: http://rosreestr.ru/api/online/fir_objects/02:56:030302:639
	 */
	public static final String ROSREESTR_API_NUMBER_URL = "http://rosreestr.ru/api/online/fir_objects/";
	
	/** <b>2.2 Поиск объекта недвижимости по адресу</b>
	 * 	<br>Пример: http://rosreestr.ru/api/online/address/fir_objects?macroRegionId=140000000000&RegionId=140281000000&street=Полевая&house=1
	 */
	public static final String ROSREESTR_API_ADDRESS_URL = "http://rosreestr.ru/api/online/address/fir_objects";
	/****** Rosreestr API ******/
	
	
	public static final Map<String, Integer> ROSREESTR_OBJECT_TYPES = Map.ofEntries(
	        entry("Земельные участки", 1),
	        entry("Кварталы", 2),
	        entry("Районы", 3),
	        entry("Округи", 4),
	        entry("ОКС", 5),
	        entry("Тер.зоны", 6),
	        entry("Границы", 7),
	        entry("ОМС", 9),
	        entry("ЗОУИТ", 10),
	        entry("Лесничества и лесопарки", 12),
	        entry("Красные линии", 13),
	        entry("Схемы расположения ЗУ", 15),
	        entry("Свободные экономические зоны", 16)
			); 

	public static final Map<String, String> ROSREESTR_UNITS = Map.ofEntries(
	        entry("003", "мм"),
	        entry("004", "см"),
	        entry("005", "дм"),
	        entry("006", "м"),
	        entry("008", "км"),
	        entry("009", "Мм"),
	        entry("047", "морск. м."),
	        entry("050", "кв. мм"),
	        entry("051", "кв. см"),
	        entry("053", "кв. дм"),
	        entry("055", "кв. м"),
	        entry("058", "тыс. кв. м"),
	        entry("059", "га"),
	        entry("061", "кв. км"),
	        entry("109", "а"),
	        entry("359", "сут."),
	        entry("360", "нед."),
	        entry("361", "дек."),
	        entry("362", "мес."),
	        entry("364", "кварт."),
	        entry("365", "полугод."),
	        entry("366", "г."),
	        entry("383", "руб."),
	        entry("384", "тыс. руб."),
	        entry("385", "млн. руб."),
	        entry("386", "млрд. руб."),
	        entry("1000", "неопр."),
	        entry("1001", "отсутств."),
	        entry("1002", "руб. за кв. м"),
	        entry("1003", "руб. за а"),
	        entry("1004", "руб. за га"),
	        entry("1005", "иные")
			);
	
	public static final Map<String, String> ROSREESTR_AREA_TYPES = Map.ofEntries(
	        entry("001", "Площадь застройки"),
	        entry("002", "Общая площадь"),
	        entry("003", "Общая площадь без лоджии"),
	        entry("004", "Общая площадь с лоджией"),
	        entry("005", "Жилая площадь"),
	        entry("007", "Основная площадь"),
	        entry("008", "Декларированная площадь"),
	        entry("009", "Уточненная площадь"),
	        entry("010", "Фактическая площадь"),
	        entry("011", "Вспомогательная площадь"),
	        entry("012", "Площадь помещений общего пользования без лоджии"),
	        entry("013", "Площадь помещений общего пользования с лоджией"),
	        entry("014", "Прочие технические помещения без лоджии"),
	        entry("015", "Прочие технические помещения с лоджией"),
	        entry("020", "Застроенная площадь"),
	        entry("021", "Незастроенная площадь"),
	        entry("022", "Значение площади отсутствует")
			);
	
	public static final Map<String, String> UTIL_NAMES = getUtilNames();
	
	public static final Map<String, String> getUtilNames() {
		Map<String, String> utilNames = new HashMap<>();
		Properties props = new Properties();
		
		try {
			props.load(new InputStreamReader(Constants.class.getResourceAsStream("/usage_clsf"), Charset.forName("UTF-8")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		props.keySet().stream().forEach(key -> utilNames.put(key.toString(), props.getProperty(key.toString())));
		
		return utilNames;
	}
	
	public static final String GIS_ZHKH_KRSN_URL = "https://api.dom.tcsarov.ru:9443/houses";
	
	private Constants() throws IOException {
	}
}