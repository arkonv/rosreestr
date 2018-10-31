
package ru.smartsarov.rosreestr.json.object;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attrs implements Serializable
{

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
    private Object rifr;
    @SerializedName("rights_reg")
    @Expose
    private Integer rightsReg;
    @SerializedName("sale")
    @Expose
    private Object sale;
    @SerializedName("statecd")
    @Expose
    private String statecd;
    @SerializedName("util_by_doc")
    @Expose
    private String utilByDoc;
    @SerializedName("util_code")
    @Expose
    private Object utilCode;
    private final static long serialVersionUID = -2066763038941808022L;

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
    public Attrs(String adate, String address, String annoText, String areaType, String areaUnit, Double areaValue, Double cadCost, CadEngData cadEngData, String cadRecordDate, String cadUnit, String categoryType, String cn, String dateCost, String dateCreate, String fp, String id, String kvartal, String kvartalCn, String okrug, String okrugCn, String pubdate, String rayon, String rayonCn, Integer reg, Object rifr, Integer rightsReg, Object sale, String statecd, String utilByDoc, Object utilCode) {
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

    public void setRifr(Object rifr) {
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

    public void setSale(Object sale) {
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

    public Object getUtilCode() {
        return utilCode;
    }

    public void setUtilCode(Object utilCode) {
        this.utilCode = utilCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attrs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adate");
        sb.append('=');
        sb.append(((this.adate == null)?"<null>":this.adate));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("annoText");
        sb.append('=');
        sb.append(((this.annoText == null)?"<null>":this.annoText));
        sb.append(',');
        sb.append("areaType");
        sb.append('=');
        sb.append(((this.areaType == null)?"<null>":this.areaType));
        sb.append(',');
        sb.append("areaUnit");
        sb.append('=');
        sb.append(((this.areaUnit == null)?"<null>":this.areaUnit));
        sb.append(',');
        sb.append("areaValue");
        sb.append('=');
        sb.append(((this.areaValue == null)?"<null>":this.areaValue));
        sb.append(',');
        sb.append("cadCost");
        sb.append('=');
        sb.append(((this.cadCost == null)?"<null>":this.cadCost));
        sb.append(',');
        sb.append("cadEngData");
        sb.append('=');
        sb.append(((this.cadEngData == null)?"<null>":this.cadEngData));
        sb.append(',');
        sb.append("cadRecordDate");
        sb.append('=');
        sb.append(((this.cadRecordDate == null)?"<null>":this.cadRecordDate));
        sb.append(',');
        sb.append("cadUnit");
        sb.append('=');
        sb.append(((this.cadUnit == null)?"<null>":this.cadUnit));
        sb.append(',');
        sb.append("categoryType");
        sb.append('=');
        sb.append(((this.categoryType == null)?"<null>":this.categoryType));
        sb.append(',');
        sb.append("cn");
        sb.append('=');
        sb.append(((this.cn == null)?"<null>":this.cn));
        sb.append(',');
        sb.append("dateCost");
        sb.append('=');
        sb.append(((this.dateCost == null)?"<null>":this.dateCost));
        sb.append(',');
        sb.append("dateCreate");
        sb.append('=');
        sb.append(((this.dateCreate == null)?"<null>":this.dateCreate));
        sb.append(',');
        sb.append("fp");
        sb.append('=');
        sb.append(((this.fp == null)?"<null>":this.fp));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("kvartal");
        sb.append('=');
        sb.append(((this.kvartal == null)?"<null>":this.kvartal));
        sb.append(',');
        sb.append("kvartalCn");
        sb.append('=');
        sb.append(((this.kvartalCn == null)?"<null>":this.kvartalCn));
        sb.append(',');
        sb.append("okrug");
        sb.append('=');
        sb.append(((this.okrug == null)?"<null>":this.okrug));
        sb.append(',');
        sb.append("okrugCn");
        sb.append('=');
        sb.append(((this.okrugCn == null)?"<null>":this.okrugCn));
        sb.append(',');
        sb.append("pubdate");
        sb.append('=');
        sb.append(((this.pubdate == null)?"<null>":this.pubdate));
        sb.append(',');
        sb.append("rayon");
        sb.append('=');
        sb.append(((this.rayon == null)?"<null>":this.rayon));
        sb.append(',');
        sb.append("rayonCn");
        sb.append('=');
        sb.append(((this.rayonCn == null)?"<null>":this.rayonCn));
        sb.append(',');
        sb.append("reg");
        sb.append('=');
        sb.append(((this.reg == null)?"<null>":this.reg));
        sb.append(',');
        sb.append("rifr");
        sb.append('=');
        sb.append(((this.rifr == null)?"<null>":this.rifr));
        sb.append(',');
        sb.append("rightsReg");
        sb.append('=');
        sb.append(((this.rightsReg == null)?"<null>":this.rightsReg));
        sb.append(',');
        sb.append("sale");
        sb.append('=');
        sb.append(((this.sale == null)?"<null>":this.sale));
        sb.append(',');
        sb.append("statecd");
        sb.append('=');
        sb.append(((this.statecd == null)?"<null>":this.statecd));
        sb.append(',');
        sb.append("utilByDoc");
        sb.append('=');
        sb.append(((this.utilByDoc == null)?"<null>":this.utilByDoc));
        sb.append(',');
        sb.append("utilCode");
        sb.append('=');
        sb.append(((this.utilCode == null)?"<null>":this.utilCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
