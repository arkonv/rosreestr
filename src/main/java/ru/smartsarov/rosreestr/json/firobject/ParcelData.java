
package ru.smartsarov.rosreestr.json.firobject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParcelData implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("regionKey")
    @Expose
    private Integer regionKey;
    @SerializedName("parcelCn")
    @Expose
    private String parcelCn;
    @SerializedName("parcelStatus")
    @Expose
    private String parcelStatus;
    @SerializedName("dateCreate")
    @Expose
    private String dateCreate;
    @SerializedName("dateRemove")
    @Expose
    private Object dateRemove;
    @SerializedName("categoryType")
    @Expose
    private Object categoryType;
    @SerializedName("areaValue")
    @Expose
    private Double areaValue;
    @SerializedName("areaType")
    @Expose
    private String areaType;
    @SerializedName("areaUnit")
    @Expose
    private String areaUnit;
    @SerializedName("areaTypeValue")
    @Expose
    private Object areaTypeValue;
    @SerializedName("areaUnitValue")
    @Expose
    private Object areaUnitValue;
    @SerializedName("categoryTypeValue")
    @Expose
    private Object categoryTypeValue;
    @SerializedName("rightsReg")
    @Expose
    private Boolean rightsReg;
    @SerializedName("cadCost")
    @Expose
    private Double cadCost;
    @SerializedName("cadUnit")
    @Expose
    private String cadUnit;
    @SerializedName("dateCost")
    @Expose
    private String dateCost;
    @SerializedName("oksFlag")
    @Expose
    private Integer oksFlag;
    @SerializedName("oksType")
    @Expose
    private String oksType;
    @SerializedName("oksFloors")
    @Expose
    private Object oksFloors;
    @SerializedName("oksUFloors")
    @Expose
    private Object oksUFloors;
    @SerializedName("oksElementsConstruct")
    @Expose
    private Object oksElementsConstruct;
    @SerializedName("oksYearUsed")
    @Expose
    private Object oksYearUsed;
    @SerializedName("oksInventoryCost")
    @Expose
    private Double oksInventoryCost;
    @SerializedName("oksInn")
    @Expose
    private Object oksInn;
    @SerializedName("oksExecutor")
    @Expose
    private String oksExecutor;
    @SerializedName("oksYearBuilt")
    @Expose
    private Object oksYearBuilt;
    @SerializedName("oksCostDate")
    @Expose
    private Object oksCostDate;
    @SerializedName("rcType")
    @Expose
    private Object rcType;
    @SerializedName("rcDate")
    @Expose
    private Object rcDate;
    @SerializedName("guidUl")
    @Expose
    private Object guidUl;
    @SerializedName("guidFl")
    @Expose
    private Object guidFl;
    @SerializedName("ciSurname")
    @Expose
    private Object ciSurname;
    @SerializedName("ciFirst")
    @Expose
    private Object ciFirst;
    @SerializedName("ciPatronymic")
    @Expose
    private Object ciPatronymic;
    @SerializedName("ciNCertificate")
    @Expose
    private Object ciNCertificate;
    @SerializedName("ciPhone")
    @Expose
    private Object ciPhone;
    @SerializedName("ciEmail")
    @Expose
    private Object ciEmail;
    @SerializedName("ciAddress")
    @Expose
    private Object ciAddress;
    @SerializedName("coName")
    @Expose
    private Object coName;
    @SerializedName("coInn")
    @Expose
    private Object coInn;
    @SerializedName("utilCode")
    @Expose
    private Object utilCode;
    @SerializedName("utilByDoc")
    @Expose
    private Object utilByDoc;
    @SerializedName("cadastralBlockId")
    @Expose
    private Object cadastralBlockId;
    @SerializedName("oksElementsConstructStr")
    @Expose
    private Object oksElementsConstructStr;
    @SerializedName("utilCodeDesc")
    @Expose
    private Object utilCodeDesc;
    @SerializedName("parcelStatusStr")
    @Expose
    private String parcelStatusStr;
    private final static long serialVersionUID = 9094961207805606638L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ParcelData() {
    }

    /**
     * 
     * @param areaUnit
     * @param oksUFloors
     * @param parcelStatusStr
     * @param cadCost
     * @param oksFlag
     * @param dateCost
     * @param guidFl
     * @param dateCreate
     * @param ciAddress
     * @param ciSurname
     * @param oksCostDate
     * @param oksFloors
     * @param oksInn
     * @param cadUnit
     * @param areaUnitValue
     * @param areaType
     * @param oksType
     * @param id
     * @param areaValue
     * @param utilByDoc
     * @param ciPatronymic
     * @param ciEmail
     * @param rcDate
     * @param ciNCertificate
     * @param regionKey
     * @param areaTypeValue
     * @param guidUl
     * @param ciPhone
     * @param utilCodeDesc
     * @param coName
     * @param rcType
     * @param oksElementsConstructStr
     * @param ciFirst
     * @param parcelStatus
     * @param categoryType
     * @param oksExecutor
     * @param oksYearBuilt
     * @param cadastralBlockId
     * @param oksInventoryCost
     * @param utilCode
     * @param categoryTypeValue
     * @param oksElementsConstruct
     * @param dateRemove
     * @param rightsReg
     * @param coInn
     * @param oksYearUsed
     * @param parcelCn
     */
    public ParcelData(String id, Integer regionKey, String parcelCn, String parcelStatus, String dateCreate, Object dateRemove, Object categoryType, Double areaValue, String areaType, String areaUnit, Object areaTypeValue, Object areaUnitValue, Object categoryTypeValue, Boolean rightsReg, Double cadCost, String cadUnit, String dateCost, Integer oksFlag, String oksType, Object oksFloors, Object oksUFloors, Object oksElementsConstruct, Object oksYearUsed, Double oksInventoryCost, Object oksInn, String oksExecutor, Object oksYearBuilt, Object oksCostDate, Object rcType, Object rcDate, Object guidUl, Object guidFl, Object ciSurname, Object ciFirst, Object ciPatronymic, Object ciNCertificate, Object ciPhone, Object ciEmail, Object ciAddress, Object coName, Object coInn, Object utilCode, Object utilByDoc, Object cadastralBlockId, Object oksElementsConstructStr, Object utilCodeDesc, String parcelStatusStr) {
        super();
        this.id = id;
        this.regionKey = regionKey;
        this.parcelCn = parcelCn;
        this.parcelStatus = parcelStatus;
        this.dateCreate = dateCreate;
        this.dateRemove = dateRemove;
        this.categoryType = categoryType;
        this.areaValue = areaValue;
        this.areaType = areaType;
        this.areaUnit = areaUnit;
        this.areaTypeValue = areaTypeValue;
        this.areaUnitValue = areaUnitValue;
        this.categoryTypeValue = categoryTypeValue;
        this.rightsReg = rightsReg;
        this.cadCost = cadCost;
        this.cadUnit = cadUnit;
        this.dateCost = dateCost;
        this.oksFlag = oksFlag;
        this.oksType = oksType;
        this.oksFloors = oksFloors;
        this.oksUFloors = oksUFloors;
        this.oksElementsConstruct = oksElementsConstruct;
        this.oksYearUsed = oksYearUsed;
        this.oksInventoryCost = oksInventoryCost;
        this.oksInn = oksInn;
        this.oksExecutor = oksExecutor;
        this.oksYearBuilt = oksYearBuilt;
        this.oksCostDate = oksCostDate;
        this.rcType = rcType;
        this.rcDate = rcDate;
        this.guidUl = guidUl;
        this.guidFl = guidFl;
        this.ciSurname = ciSurname;
        this.ciFirst = ciFirst;
        this.ciPatronymic = ciPatronymic;
        this.ciNCertificate = ciNCertificate;
        this.ciPhone = ciPhone;
        this.ciEmail = ciEmail;
        this.ciAddress = ciAddress;
        this.coName = coName;
        this.coInn = coInn;
        this.utilCode = utilCode;
        this.utilByDoc = utilByDoc;
        this.cadastralBlockId = cadastralBlockId;
        this.oksElementsConstructStr = oksElementsConstructStr;
        this.utilCodeDesc = utilCodeDesc;
        this.parcelStatusStr = parcelStatusStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public String getParcelCn() {
        return parcelCn;
    }

    public void setParcelCn(String parcelCn) {
        this.parcelCn = parcelCn;
    }

    public String getParcelStatus() {
        return parcelStatus;
    }

    public void setParcelStatus(String parcelStatus) {
        this.parcelStatus = parcelStatus;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Object getDateRemove() {
        return dateRemove;
    }

    public void setDateRemove(Object dateRemove) {
        this.dateRemove = dateRemove;
    }

    public Object getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Object categoryType) {
        this.categoryType = categoryType;
    }

    public Double getAreaValue() {
        return areaValue;
    }

    public void setAreaValue(Double areaValue) {
        this.areaValue = areaValue;
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

    public Object getAreaTypeValue() {
        return areaTypeValue;
    }

    public void setAreaTypeValue(Object areaTypeValue) {
        this.areaTypeValue = areaTypeValue;
    }

    public Object getAreaUnitValue() {
        return areaUnitValue;
    }

    public void setAreaUnitValue(Object areaUnitValue) {
        this.areaUnitValue = areaUnitValue;
    }

    public Object getCategoryTypeValue() {
        return categoryTypeValue;
    }

    public void setCategoryTypeValue(Object categoryTypeValue) {
        this.categoryTypeValue = categoryTypeValue;
    }

    public Boolean getRightsReg() {
        return rightsReg;
    }

    public void setRightsReg(Boolean rightsReg) {
        this.rightsReg = rightsReg;
    }

    public Double getCadCost() {
        return cadCost;
    }

    public void setCadCost(Double cadCost) {
        this.cadCost = cadCost;
    }

    public String getCadUnit() {
        return cadUnit;
    }

    public void setCadUnit(String cadUnit) {
        this.cadUnit = cadUnit;
    }

    public String getDateCost() {
        return dateCost;
    }

    public void setDateCost(String dateCost) {
        this.dateCost = dateCost;
    }

    public Integer getOksFlag() {
        return oksFlag;
    }

    public void setOksFlag(Integer oksFlag) {
        this.oksFlag = oksFlag;
    }

    public String getOksType() {
        return oksType;
    }

    public void setOksType(String oksType) {
        this.oksType = oksType;
    }

    public Object getOksFloors() {
        return oksFloors;
    }

    public void setOksFloors(Object oksFloors) {
        this.oksFloors = oksFloors;
    }

    public Object getOksUFloors() {
        return oksUFloors;
    }

    public void setOksUFloors(Object oksUFloors) {
        this.oksUFloors = oksUFloors;
    }

    public Object getOksElementsConstruct() {
        return oksElementsConstruct;
    }

    public void setOksElementsConstruct(Object oksElementsConstruct) {
        this.oksElementsConstruct = oksElementsConstruct;
    }

    public Object getOksYearUsed() {
        return oksYearUsed;
    }

    public void setOksYearUsed(Object oksYearUsed) {
        this.oksYearUsed = oksYearUsed;
    }

    public Double getOksInventoryCost() {
        return oksInventoryCost;
    }

    public void setOksInventoryCost(Double oksInventoryCost) {
        this.oksInventoryCost = oksInventoryCost;
    }

    public Object getOksInn() {
        return oksInn;
    }

    public void setOksInn(Object oksInn) {
        this.oksInn = oksInn;
    }

    public String getOksExecutor() {
        return oksExecutor;
    }

    public void setOksExecutor(String oksExecutor) {
        this.oksExecutor = oksExecutor;
    }

    public Object getOksYearBuilt() {
        return oksYearBuilt;
    }

    public void setOksYearBuilt(Object oksYearBuilt) {
        this.oksYearBuilt = oksYearBuilt;
    }

    public Object getOksCostDate() {
        return oksCostDate;
    }

    public void setOksCostDate(Object oksCostDate) {
        this.oksCostDate = oksCostDate;
    }

    public Object getRcType() {
        return rcType;
    }

    public void setRcType(Object rcType) {
        this.rcType = rcType;
    }

    public Object getRcDate() {
        return rcDate;
    }

    public void setRcDate(Object rcDate) {
        this.rcDate = rcDate;
    }

    public Object getGuidUl() {
        return guidUl;
    }

    public void setGuidUl(Object guidUl) {
        this.guidUl = guidUl;
    }

    public Object getGuidFl() {
        return guidFl;
    }

    public void setGuidFl(Object guidFl) {
        this.guidFl = guidFl;
    }

    public Object getCiSurname() {
        return ciSurname;
    }

    public void setCiSurname(Object ciSurname) {
        this.ciSurname = ciSurname;
    }

    public Object getCiFirst() {
        return ciFirst;
    }

    public void setCiFirst(Object ciFirst) {
        this.ciFirst = ciFirst;
    }

    public Object getCiPatronymic() {
        return ciPatronymic;
    }

    public void setCiPatronymic(Object ciPatronymic) {
        this.ciPatronymic = ciPatronymic;
    }

    public Object getCiNCertificate() {
        return ciNCertificate;
    }

    public void setCiNCertificate(Object ciNCertificate) {
        this.ciNCertificate = ciNCertificate;
    }

    public Object getCiPhone() {
        return ciPhone;
    }

    public void setCiPhone(Object ciPhone) {
        this.ciPhone = ciPhone;
    }

    public Object getCiEmail() {
        return ciEmail;
    }

    public void setCiEmail(Object ciEmail) {
        this.ciEmail = ciEmail;
    }

    public Object getCiAddress() {
        return ciAddress;
    }

    public void setCiAddress(Object ciAddress) {
        this.ciAddress = ciAddress;
    }

    public Object getCoName() {
        return coName;
    }

    public void setCoName(Object coName) {
        this.coName = coName;
    }

    public Object getCoInn() {
        return coInn;
    }

    public void setCoInn(Object coInn) {
        this.coInn = coInn;
    }

    public Object getUtilCode() {
        return utilCode;
    }

    public void setUtilCode(Object utilCode) {
        this.utilCode = utilCode;
    }

    public Object getUtilByDoc() {
        return utilByDoc;
    }

    public void setUtilByDoc(Object utilByDoc) {
        this.utilByDoc = utilByDoc;
    }

    public Object getCadastralBlockId() {
        return cadastralBlockId;
    }

    public void setCadastralBlockId(Object cadastralBlockId) {
        this.cadastralBlockId = cadastralBlockId;
    }

    public Object getOksElementsConstructStr() {
        return oksElementsConstructStr;
    }

    public void setOksElementsConstructStr(Object oksElementsConstructStr) {
        this.oksElementsConstructStr = oksElementsConstructStr;
    }

    public Object getUtilCodeDesc() {
        return utilCodeDesc;
    }

    public void setUtilCodeDesc(Object utilCodeDesc) {
        this.utilCodeDesc = utilCodeDesc;
    }

    public String getParcelStatusStr() {
        return parcelStatusStr;
    }

    public void setParcelStatusStr(String parcelStatusStr) {
        this.parcelStatusStr = parcelStatusStr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParcelData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("regionKey");
        sb.append('=');
        sb.append(((this.regionKey == null)?"<null>":this.regionKey));
        sb.append(',');
        sb.append("parcelCn");
        sb.append('=');
        sb.append(((this.parcelCn == null)?"<null>":this.parcelCn));
        sb.append(',');
        sb.append("parcelStatus");
        sb.append('=');
        sb.append(((this.parcelStatus == null)?"<null>":this.parcelStatus));
        sb.append(',');
        sb.append("dateCreate");
        sb.append('=');
        sb.append(((this.dateCreate == null)?"<null>":this.dateCreate));
        sb.append(',');
        sb.append("dateRemove");
        sb.append('=');
        sb.append(((this.dateRemove == null)?"<null>":this.dateRemove));
        sb.append(',');
        sb.append("categoryType");
        sb.append('=');
        sb.append(((this.categoryType == null)?"<null>":this.categoryType));
        sb.append(',');
        sb.append("areaValue");
        sb.append('=');
        sb.append(((this.areaValue == null)?"<null>":this.areaValue));
        sb.append(',');
        sb.append("areaType");
        sb.append('=');
        sb.append(((this.areaType == null)?"<null>":this.areaType));
        sb.append(',');
        sb.append("areaUnit");
        sb.append('=');
        sb.append(((this.areaUnit == null)?"<null>":this.areaUnit));
        sb.append(',');
        sb.append("areaTypeValue");
        sb.append('=');
        sb.append(((this.areaTypeValue == null)?"<null>":this.areaTypeValue));
        sb.append(',');
        sb.append("areaUnitValue");
        sb.append('=');
        sb.append(((this.areaUnitValue == null)?"<null>":this.areaUnitValue));
        sb.append(',');
        sb.append("categoryTypeValue");
        sb.append('=');
        sb.append(((this.categoryTypeValue == null)?"<null>":this.categoryTypeValue));
        sb.append(',');
        sb.append("rightsReg");
        sb.append('=');
        sb.append(((this.rightsReg == null)?"<null>":this.rightsReg));
        sb.append(',');
        sb.append("cadCost");
        sb.append('=');
        sb.append(((this.cadCost == null)?"<null>":this.cadCost));
        sb.append(',');
        sb.append("cadUnit");
        sb.append('=');
        sb.append(((this.cadUnit == null)?"<null>":this.cadUnit));
        sb.append(',');
        sb.append("dateCost");
        sb.append('=');
        sb.append(((this.dateCost == null)?"<null>":this.dateCost));
        sb.append(',');
        sb.append("oksFlag");
        sb.append('=');
        sb.append(((this.oksFlag == null)?"<null>":this.oksFlag));
        sb.append(',');
        sb.append("oksType");
        sb.append('=');
        sb.append(((this.oksType == null)?"<null>":this.oksType));
        sb.append(',');
        sb.append("oksFloors");
        sb.append('=');
        sb.append(((this.oksFloors == null)?"<null>":this.oksFloors));
        sb.append(',');
        sb.append("oksUFloors");
        sb.append('=');
        sb.append(((this.oksUFloors == null)?"<null>":this.oksUFloors));
        sb.append(',');
        sb.append("oksElementsConstruct");
        sb.append('=');
        sb.append(((this.oksElementsConstruct == null)?"<null>":this.oksElementsConstruct));
        sb.append(',');
        sb.append("oksYearUsed");
        sb.append('=');
        sb.append(((this.oksYearUsed == null)?"<null>":this.oksYearUsed));
        sb.append(',');
        sb.append("oksInventoryCost");
        sb.append('=');
        sb.append(((this.oksInventoryCost == null)?"<null>":this.oksInventoryCost));
        sb.append(',');
        sb.append("oksInn");
        sb.append('=');
        sb.append(((this.oksInn == null)?"<null>":this.oksInn));
        sb.append(',');
        sb.append("oksExecutor");
        sb.append('=');
        sb.append(((this.oksExecutor == null)?"<null>":this.oksExecutor));
        sb.append(',');
        sb.append("oksYearBuilt");
        sb.append('=');
        sb.append(((this.oksYearBuilt == null)?"<null>":this.oksYearBuilt));
        sb.append(',');
        sb.append("oksCostDate");
        sb.append('=');
        sb.append(((this.oksCostDate == null)?"<null>":this.oksCostDate));
        sb.append(',');
        sb.append("rcType");
        sb.append('=');
        sb.append(((this.rcType == null)?"<null>":this.rcType));
        sb.append(',');
        sb.append("rcDate");
        sb.append('=');
        sb.append(((this.rcDate == null)?"<null>":this.rcDate));
        sb.append(',');
        sb.append("guidUl");
        sb.append('=');
        sb.append(((this.guidUl == null)?"<null>":this.guidUl));
        sb.append(',');
        sb.append("guidFl");
        sb.append('=');
        sb.append(((this.guidFl == null)?"<null>":this.guidFl));
        sb.append(',');
        sb.append("ciSurname");
        sb.append('=');
        sb.append(((this.ciSurname == null)?"<null>":this.ciSurname));
        sb.append(',');
        sb.append("ciFirst");
        sb.append('=');
        sb.append(((this.ciFirst == null)?"<null>":this.ciFirst));
        sb.append(',');
        sb.append("ciPatronymic");
        sb.append('=');
        sb.append(((this.ciPatronymic == null)?"<null>":this.ciPatronymic));
        sb.append(',');
        sb.append("ciNCertificate");
        sb.append('=');
        sb.append(((this.ciNCertificate == null)?"<null>":this.ciNCertificate));
        sb.append(',');
        sb.append("ciPhone");
        sb.append('=');
        sb.append(((this.ciPhone == null)?"<null>":this.ciPhone));
        sb.append(',');
        sb.append("ciEmail");
        sb.append('=');
        sb.append(((this.ciEmail == null)?"<null>":this.ciEmail));
        sb.append(',');
        sb.append("ciAddress");
        sb.append('=');
        sb.append(((this.ciAddress == null)?"<null>":this.ciAddress));
        sb.append(',');
        sb.append("coName");
        sb.append('=');
        sb.append(((this.coName == null)?"<null>":this.coName));
        sb.append(',');
        sb.append("coInn");
        sb.append('=');
        sb.append(((this.coInn == null)?"<null>":this.coInn));
        sb.append(',');
        sb.append("utilCode");
        sb.append('=');
        sb.append(((this.utilCode == null)?"<null>":this.utilCode));
        sb.append(',');
        sb.append("utilByDoc");
        sb.append('=');
        sb.append(((this.utilByDoc == null)?"<null>":this.utilByDoc));
        sb.append(',');
        sb.append("cadastralBlockId");
        sb.append('=');
        sb.append(((this.cadastralBlockId == null)?"<null>":this.cadastralBlockId));
        sb.append(',');
        sb.append("oksElementsConstructStr");
        sb.append('=');
        sb.append(((this.oksElementsConstructStr == null)?"<null>":this.oksElementsConstructStr));
        sb.append(',');
        sb.append("utilCodeDesc");
        sb.append('=');
        sb.append(((this.utilCodeDesc == null)?"<null>":this.utilCodeDesc));
        sb.append(',');
        sb.append("parcelStatusStr");
        sb.append('=');
        sb.append(((this.parcelStatusStr == null)?"<null>":this.parcelStatusStr));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
