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
    private String dateRemove;
    @SerializedName("categoryType")
    @Expose
    private String categoryType;
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
    private String areaTypeValue;
    @SerializedName("areaUnitValue")
    @Expose
    private String areaUnitValue;
    @SerializedName("categoryTypeValue")
    @Expose
    private String categoryTypeValue;
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
    private String oksFloors;
    @SerializedName("oksUFloors")
    @Expose
    private String oksUFloors;
    @SerializedName("oksElementsConstruct")
    @Expose
    private String oksElementsConstruct;
    @SerializedName("oksYearUsed")
    @Expose
    private String oksYearUsed;
    @SerializedName("oksInventoryCost")
    @Expose
    private Double oksInventoryCost;
    @SerializedName("oksInn")
    @Expose
    private String oksInn;
    @SerializedName("oksExecutor")
    @Expose
    private String oksExecutor;
    @SerializedName("oksYearBuilt")
    @Expose
    private String oksYearBuilt;
    @SerializedName("oksCostDate")
    @Expose
    private String oksCostDate;
    @SerializedName("rcType")
    @Expose
    private String rcType;
    @SerializedName("rcDate")
    @Expose
    private String rcDate;
    @SerializedName("guidUl")
    @Expose
    private String guidUl;
    @SerializedName("guidFl")
    @Expose
    private String guidFl;
    @SerializedName("ciSurname")
    @Expose
    private String ciSurname;
    @SerializedName("ciFirst")
    @Expose
    private String ciFirst;
    @SerializedName("ciPatronymic")
    @Expose
    private String ciPatronymic;
    @SerializedName("ciNCertificate")
    @Expose
    private String ciNCertificate;
    @SerializedName("ciPhone")
    @Expose
    private String ciPhone;
    @SerializedName("ciEmail")
    @Expose
    private String ciEmail;
    @SerializedName("ciAddress")
    @Expose
    private String ciAddress;
    @SerializedName("coName")
    @Expose
    private String coName;
    @SerializedName("coInn")
    @Expose
    private String coInn;
    @SerializedName("utilCode")
    @Expose
    private String utilCode;
    @SerializedName("utilByDoc")
    @Expose
    private String utilByDoc;
    @SerializedName("cadastralBlockId")
    @Expose
    private String cadastralBlockId;
    @SerializedName("oksElementsConstructStr")
    @Expose
    private String oksElementsConstructStr;
    @SerializedName("utilCodeDesc")
    @Expose
    private String utilCodeDesc;
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
    public ParcelData(String id, Integer regionKey, String parcelCn, String parcelStatus, String dateCreate, String dateRemove, String categoryType, Double areaValue, String areaType, String areaUnit, String areaTypeValue, String areaUnitValue, String categoryTypeValue, Boolean rightsReg, Double cadCost, String cadUnit, String dateCost, Integer oksFlag, String oksType, String oksFloors, String oksUFloors, String oksElementsConstruct, String oksYearUsed, Double oksInventoryCost, String oksInn, String oksExecutor, String oksYearBuilt, String oksCostDate, String rcType, String rcDate, String guidUl, String guidFl, String ciSurname, String ciFirst, String ciPatronymic, String ciNCertificate, String ciPhone, String ciEmail, String ciAddress, String coName, String coInn, String utilCode, String utilByDoc, String cadastralBlockId, String oksElementsConstructStr, String utilCodeDesc, String parcelStatusStr) {
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

    public String getDateRemove() {
        return dateRemove;
    }

    public void setDateRemove(String dateRemove) {
        this.dateRemove = dateRemove;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
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

    public String getAreaTypeValue() {
        return areaTypeValue;
    }

    public void setAreaTypeValue(String areaTypeValue) {
        this.areaTypeValue = areaTypeValue;
    }

    public String getAreaUnitValue() {
        return areaUnitValue;
    }

    public void setAreaUnitValue(String areaUnitValue) {
        this.areaUnitValue = areaUnitValue;
    }

    public String getCategoryTypeValue() {
        return categoryTypeValue;
    }

    public void setCategoryTypeValue(String categoryTypeValue) {
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

    public String getOksFloors() {
        return oksFloors;
    }

    public void setOksFloors(String oksFloors) {
        this.oksFloors = oksFloors;
    }

    public String getOksUFloors() {
        return oksUFloors;
    }

    public void setOksUFloors(String oksUFloors) {
        this.oksUFloors = oksUFloors;
    }

    public String getOksElementsConstruct() {
        return oksElementsConstruct;
    }

    public void setOksElementsConstruct(String oksElementsConstruct) {
        this.oksElementsConstruct = oksElementsConstruct;
    }

    public String getOksYearUsed() {
        return oksYearUsed;
    }

    public void setOksYearUsed(String oksYearUsed) {
        this.oksYearUsed = oksYearUsed;
    }

    public Double getOksInventoryCost() {
        return oksInventoryCost;
    }

    public void setOksInventoryCost(Double oksInventoryCost) {
        this.oksInventoryCost = oksInventoryCost;
    }

    public String getOksInn() {
        return oksInn;
    }

    public void setOksInn(String oksInn) {
        this.oksInn = oksInn;
    }

    public String getOksExecutor() {
        return oksExecutor;
    }

    public void setOksExecutor(String oksExecutor) {
        this.oksExecutor = oksExecutor;
    }

    public String getOksYearBuilt() {
        return oksYearBuilt;
    }

    public void setOksYearBuilt(String oksYearBuilt) {
        this.oksYearBuilt = oksYearBuilt;
    }

    public String getOksCostDate() {
        return oksCostDate;
    }

    public void setOksCostDate(String oksCostDate) {
        this.oksCostDate = oksCostDate;
    }

    public String getRcType() {
        return rcType;
    }

    public void setRcType(String rcType) {
        this.rcType = rcType;
    }

    public String getRcDate() {
        return rcDate;
    }

    public void setRcDate(String rcDate) {
        this.rcDate = rcDate;
    }

    public String getGuidUl() {
        return guidUl;
    }

    public void setGuidUl(String guidUl) {
        this.guidUl = guidUl;
    }

    public String getGuidFl() {
        return guidFl;
    }

    public void setGuidFl(String guidFl) {
        this.guidFl = guidFl;
    }

    public String getCiSurname() {
        return ciSurname;
    }

    public void setCiSurname(String ciSurname) {
        this.ciSurname = ciSurname;
    }

    public String getCiFirst() {
        return ciFirst;
    }

    public void setCiFirst(String ciFirst) {
        this.ciFirst = ciFirst;
    }

    public String getCiPatronymic() {
        return ciPatronymic;
    }

    public void setCiPatronymic(String ciPatronymic) {
        this.ciPatronymic = ciPatronymic;
    }

    public String getCiNCertificate() {
        return ciNCertificate;
    }

    public void setCiNCertificate(String ciNCertificate) {
        this.ciNCertificate = ciNCertificate;
    }

    public String getCiPhone() {
        return ciPhone;
    }

    public void setCiPhone(String ciPhone) {
        this.ciPhone = ciPhone;
    }

    public String getCiEmail() {
        return ciEmail;
    }

    public void setCiEmail(String ciEmail) {
        this.ciEmail = ciEmail;
    }

    public String getCiAddress() {
        return ciAddress;
    }

    public void setCiAddress(String ciAddress) {
        this.ciAddress = ciAddress;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getCoInn() {
        return coInn;
    }

    public void setCoInn(String coInn) {
        this.coInn = coInn;
    }

    public String getUtilCode() {
        return utilCode;
    }

    public void setUtilCode(String utilCode) {
        this.utilCode = utilCode;
    }

    public String getUtilByDoc() {
        return utilByDoc;
    }

    public void setUtilByDoc(String utilByDoc) {
        this.utilByDoc = utilByDoc;
    }

    public String getCadastralBlockId() {
        return cadastralBlockId;
    }

    public void setCadastralBlockId(String cadastralBlockId) {
        this.cadastralBlockId = cadastralBlockId;
    }

    public String getOksElementsConstructStr() {
        return oksElementsConstructStr;
    }

    public void setOksElementsConstructStr(String oksElementsConstructStr) {
        this.oksElementsConstructStr = oksElementsConstructStr;
    }

    public String getUtilCodeDesc() {
        return utilCodeDesc;
    }

    public void setUtilCodeDesc(String utilCodeDesc) {
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
