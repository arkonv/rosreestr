
package ru.smartsarov.rosreestr.json.firobject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObjectData implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("regionKey")
    @Expose
    private Integer regionKey;
    @SerializedName("srcObject")
    @Expose
    private Integer srcObject;
    @SerializedName("objectType")
    @Expose
    private String objectType;
    @SerializedName("objectName")
    @Expose
    private String objectName;
    @SerializedName("removed")
    @Expose
    private Integer removed;
    @SerializedName("dateLoad")
    @Expose
    private String dateLoad;
    @SerializedName("addressNote")
    @Expose
    private Object addressNote;
    @SerializedName("objectCn")
    @Expose
    private String objectCn;
    @SerializedName("objectCon")
    @Expose
    private Object objectCon;
    @SerializedName("objectInv")
    @Expose
    private Object objectInv;
    @SerializedName("objectUn")
    @Expose
    private String objectUn;
    @SerializedName("rsCode")
    @Expose
    private String rsCode;
    @SerializedName("actualDate")
    @Expose
    private String actualDate;
    @SerializedName("brkStatus")
    @Expose
    private Integer brkStatus;
    @SerializedName("brkDate")
    @Expose
    private Object brkDate;
    @SerializedName("formRights")
    @Expose
    private Object formRights;
    @SerializedName("objectAddress")
    @Expose
    private ObjectAddress objectAddress;
    private final static long serialVersionUID = -8485677491521918264L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectData() {
    }

    /**
     * 
     * @param dateLoad
     * @param addressNote
     * @param objectInv
     * @param regionKey
     * @param brkDate
     * @param brkStatus
     * @param objectCn
     * @param objectType
     * @param srcObject
     * @param rsCode
     * @param removed
     * @param objectCon
     * @param actualDate
     * @param objectName
     * @param objectAddress
     * @param formRights
     * @param id
     * @param objectUn
     */
    public ObjectData(String id, Integer regionKey, Integer srcObject, String objectType, String objectName, Integer removed, String dateLoad, Object addressNote, String objectCn, Object objectCon, Object objectInv, String objectUn, String rsCode, String actualDate, Integer brkStatus, Object brkDate, Object formRights, ObjectAddress objectAddress) {
        super();
        this.id = id;
        this.regionKey = regionKey;
        this.srcObject = srcObject;
        this.objectType = objectType;
        this.objectName = objectName;
        this.removed = removed;
        this.dateLoad = dateLoad;
        this.addressNote = addressNote;
        this.objectCn = objectCn;
        this.objectCon = objectCon;
        this.objectInv = objectInv;
        this.objectUn = objectUn;
        this.rsCode = rsCode;
        this.actualDate = actualDate;
        this.brkStatus = brkStatus;
        this.brkDate = brkDate;
        this.formRights = formRights;
        this.objectAddress = objectAddress;
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

    public Integer getSrcObject() {
        return srcObject;
    }

    public void setSrcObject(Integer srcObject) {
        this.srcObject = srcObject;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Integer getRemoved() {
        return removed;
    }

    public void setRemoved(Integer removed) {
        this.removed = removed;
    }

    public String getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(String dateLoad) {
        this.dateLoad = dateLoad;
    }

    public Object getAddressNote() {
        return addressNote;
    }

    public void setAddressNote(Object addressNote) {
        this.addressNote = addressNote;
    }

    public String getObjectCn() {
        return objectCn;
    }

    public void setObjectCn(String objectCn) {
        this.objectCn = objectCn;
    }

    public Object getObjectCon() {
        return objectCon;
    }

    public void setObjectCon(Object objectCon) {
        this.objectCon = objectCon;
    }

    public Object getObjectInv() {
        return objectInv;
    }

    public void setObjectInv(Object objectInv) {
        this.objectInv = objectInv;
    }

    public String getObjectUn() {
        return objectUn;
    }

    public void setObjectUn(String objectUn) {
        this.objectUn = objectUn;
    }

    public String getRsCode() {
        return rsCode;
    }

    public void setRsCode(String rsCode) {
        this.rsCode = rsCode;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public Integer getBrkStatus() {
        return brkStatus;
    }

    public void setBrkStatus(Integer brkStatus) {
        this.brkStatus = brkStatus;
    }

    public Object getBrkDate() {
        return brkDate;
    }

    public void setBrkDate(Object brkDate) {
        this.brkDate = brkDate;
    }

    public Object getFormRights() {
        return formRights;
    }

    public void setFormRights(Object formRights) {
        this.formRights = formRights;
    }

    public ObjectAddress getObjectAddress() {
        return objectAddress;
    }

    public void setObjectAddress(ObjectAddress objectAddress) {
        this.objectAddress = objectAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObjectData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("regionKey");
        sb.append('=');
        sb.append(((this.regionKey == null)?"<null>":this.regionKey));
        sb.append(',');
        sb.append("srcObject");
        sb.append('=');
        sb.append(((this.srcObject == null)?"<null>":this.srcObject));
        sb.append(',');
        sb.append("objectType");
        sb.append('=');
        sb.append(((this.objectType == null)?"<null>":this.objectType));
        sb.append(',');
        sb.append("objectName");
        sb.append('=');
        sb.append(((this.objectName == null)?"<null>":this.objectName));
        sb.append(',');
        sb.append("removed");
        sb.append('=');
        sb.append(((this.removed == null)?"<null>":this.removed));
        sb.append(',');
        sb.append("dateLoad");
        sb.append('=');
        sb.append(((this.dateLoad == null)?"<null>":this.dateLoad));
        sb.append(',');
        sb.append("addressNote");
        sb.append('=');
        sb.append(((this.addressNote == null)?"<null>":this.addressNote));
        sb.append(',');
        sb.append("objectCn");
        sb.append('=');
        sb.append(((this.objectCn == null)?"<null>":this.objectCn));
        sb.append(',');
        sb.append("objectCon");
        sb.append('=');
        sb.append(((this.objectCon == null)?"<null>":this.objectCon));
        sb.append(',');
        sb.append("objectInv");
        sb.append('=');
        sb.append(((this.objectInv == null)?"<null>":this.objectInv));
        sb.append(',');
        sb.append("objectUn");
        sb.append('=');
        sb.append(((this.objectUn == null)?"<null>":this.objectUn));
        sb.append(',');
        sb.append("rsCode");
        sb.append('=');
        sb.append(((this.rsCode == null)?"<null>":this.rsCode));
        sb.append(',');
        sb.append("actualDate");
        sb.append('=');
        sb.append(((this.actualDate == null)?"<null>":this.actualDate));
        sb.append(',');
        sb.append("brkStatus");
        sb.append('=');
        sb.append(((this.brkStatus == null)?"<null>":this.brkStatus));
        sb.append(',');
        sb.append("brkDate");
        sb.append('=');
        sb.append(((this.brkDate == null)?"<null>":this.brkDate));
        sb.append(',');
        sb.append("formRights");
        sb.append('=');
        sb.append(((this.formRights == null)?"<null>":this.formRights));
        sb.append(',');
        sb.append("objectAddress");
        sb.append('=');
        sb.append(((this.objectAddress == null)?"<null>":this.objectAddress));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
