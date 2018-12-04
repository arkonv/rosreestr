
package ru.smartsarov.rosreestr.json.object;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attrs implements Serializable {
    private final static long serialVersionUID = -2066763038941808022L;
    
    @SerializedName("adate")
    @Expose
    private String adate;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("anno_text")
    @Expose
    private String annoText;
    @SerializedName("area_type")
    @Expose
    private String areaType;
    @SerializedName("area_unit")
    @Expose
    private String areaUnit;
    @SerializedName("area_value")
    @Expose
    private Double areaValue;
    @SerializedName("cad_cost")
    @Expose
    private Double cadCost;
    @SerializedName("cad_eng_data")
    @Expose
    private CadEngData cadEngData;
    @SerializedName("cad_record_date")
    @Expose
    private String cadRecordDate;
    @SerializedName("cad_unit")
    @Expose
    private String cadUnit;
    @SerializedName("category_type")
    @Expose
    private String categoryType;
    @SerializedName("cn")
    @Expose
    private String cn;
    @SerializedName("date_cost")
    @Expose
    private String dateCost;
    @SerializedName("date_create")
    @Expose
    private String dateCreate;
    @SerializedName("fp")
    @Expose
    private String fp;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("kvartal")
    @Expose
    private String kvartal;
    @SerializedName("kvartal_cn")
    @Expose
    private String kvartalCn;
    @SerializedName("okrug")
    @Expose
    private String okrug;
    @SerializedName("okrug_cn")
    @Expose
    private String okrugCn;
    @SerializedName("pubdate")
    @Expose
    private String pubdate;
    @SerializedName("rayon")
    @Expose
    private String rayon;
    @SerializedName("rayon_cn")
    @Expose
    private String rayonCn;
    @SerializedName("reg")
    @Expose
    private Integer reg;
    @SerializedName("rifr")
    @Expose
    private String rifr;
    @SerializedName("rights_reg")
    @Expose
    private Integer rightsReg;
    @SerializedName("sale")
    @Expose
    private String sale;
    @SerializedName("statecd")
    @Expose
    private String statecd;
    @SerializedName("util_by_doc")
    @Expose
    private String utilByDoc;
    @SerializedName("util_code")
    @Expose
    private String utilCode;
    
    @SerializedName("util_code_desc")
    @Expose
    private String utilCodeDesc;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attrs() {
    }

    /**
     * 
     * @param areaUnit
     * @param annoText
     * @param cadCost
     * @param dateCost
     * @param adate
     * @param fp
     * @param dateCreate
     * @param cadUnit
     * @param okrugCn
     * @param reg
     * @param areaType
     * @param statecd
     * @param cadEngData
     * @param id
     * @param areaValue
     * @param utilByDoc
     * @param pubdate
     * @param kvartal
     * @param address
     * @param okrug
     * @param cn
     * @param cadRecordDate
     * @param categoryType
     * @param sale
     * @param kvartalCn
     * @param utilCode
     * @param rifr
     * @param rightsReg
     * @param rayon
     * @param rayonCn
     */
    public Attrs(String adate, String address, String annoText, String areaType, String areaUnit, Double areaValue, Double cadCost, CadEngData cadEngData, String cadRecordDate, String cadUnit, String categoryType, String cn, String dateCost, String dateCreate, String fp, String id, String kvartal, String kvartalCn, String okrug, String okrugCn, String pubdate, String rayon, String rayonCn, Integer reg, String rifr, Integer rightsReg, String sale, String statecd, String utilByDoc, String utilCode) {
        super();
        this.adate = adate;
        this.address = address;
        this.annoText = annoText;
        this.areaType = areaType;
        this.areaUnit = areaUnit;
        this.areaValue = areaValue;
        this.cadCost = cadCost;
        this.cadEngData = cadEngData;
        this.cadRecordDate = cadRecordDate;
        this.cadUnit = cadUnit;
        this.categoryType = categoryType;
        this.cn = cn;
        this.dateCost = dateCost;
        this.dateCreate = dateCreate;
        this.fp = fp;
        this.id = id;
        this.kvartal = kvartal;
        this.kvartalCn = kvartalCn;
        this.okrug = okrug;
        this.okrugCn = okrugCn;
        this.pubdate = pubdate;
        this.rayon = rayon;
        this.rayonCn = rayonCn;
        this.reg = reg;
        this.rifr = rifr;
        this.rightsReg = rightsReg;
        this.sale = sale;
        this.statecd = statecd;
        this.utilByDoc = utilByDoc;
        this.utilCode = utilCode;
    }

    public String getAdate() {
        return adate;
    }

    public void setAdate(String adate) {
        this.adate = adate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAnnoText() {
        return annoText;
    }

    public void setAnnoText(String annoText) {
        this.annoText = annoText;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    public Double getAreaValue() {
        return areaValue;
    }

    public void setAreaValue(Double areaValue) {
        this.areaValue = areaValue;
    }

    public Double getCadCost() {
        return cadCost;
    }

    public void setCadCost(Double cadCost) {
        this.cadCost = cadCost;
    }

    public CadEngData getCadEngData() {
        return cadEngData;
    }

    public void setCadEngData(CadEngData cadEngData) {
        this.cadEngData = cadEngData;
    }

    public String getCadRecordDate() {
        return cadRecordDate;
    }

    public void setCadRecordDate(String cadRecordDate) {
        this.cadRecordDate = cadRecordDate;
    }

    public String getCadUnit() {
        return cadUnit;
    }

    public void setCadUnit(String cadUnit) {
        this.cadUnit = cadUnit;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getDateCost() {
        return dateCost;
    }

    public void setDateCost(String dateCost) {
        this.dateCost = dateCost;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKvartal() {
        return kvartal;
    }

    public void setKvartal(String kvartal) {
        this.kvartal = kvartal;
    }

    public String getKvartalCn() {
        return kvartalCn;
    }

    public void setKvartalCn(String kvartalCn) {
        this.kvartalCn = kvartalCn;
    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public String getOkrugCn() {
        return okrugCn;
    }

    public void setOkrugCn(String okrugCn) {
        this.okrugCn = okrugCn;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public String getRayonCn() {
        return rayonCn;
    }

    public void setRayonCn(String rayonCn) {
        this.rayonCn = rayonCn;
    }

    public Integer getReg() {
        return reg;
    }

    public void setReg(Integer reg) {
        this.reg = reg;
    }

    public Object getRifr() {
        return rifr;
    }

    public void setRifr(String rifr) {
        this.rifr = rifr;
    }

    public Integer getRightsReg() {
        return rightsReg;
    }

    public void setRightsReg(Integer rightsReg) {
        this.rightsReg = rightsReg;
    }

    public Object getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getStatecd() {
        return statecd;
    }

    public void setStatecd(String statecd) {
        this.statecd = statecd;
    }

    public String getUtilByDoc() {
        return utilByDoc;
    }

    public void setUtilByDoc(String utilByDoc) {
        this.utilByDoc = utilByDoc;
    }

    public String getUtilCode() {
        return utilCode;
    }

    public void setUtilCode(String utilCode) {
        this.utilCode = utilCode;
    }

    public String getUtilCodeDesc() {
		return utilCodeDesc;
	}

	public void setUtilCodeDesc(String utilCodeDesc) {
		this.utilCodeDesc = utilCodeDesc;
	}
}