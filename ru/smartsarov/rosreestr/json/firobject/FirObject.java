
package ru.smartsarov.rosreestr.json.firobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirObject implements Serializable
{

    @SerializedName("objectId")
    @Expose
    private String objectId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("regionKey")
    @Expose
    private Integer regionKey;
    @SerializedName("source")
    @Expose
    private Integer source;
    @SerializedName("firActualDate")
    @Expose
    private String firActualDate;
    @SerializedName("objectData")
    @Expose
    private ObjectData objectData;
    @SerializedName("parcelData")
    @Expose
    private ParcelData parcelData;
    @SerializedName("realtyData")
    @Expose
    private Object realtyData;
    @SerializedName("premisesData")
    @Expose
    private Object premisesData;
    @SerializedName("rightEncumbranceObjects")
    @Expose
    private Object rightEncumbranceObjects;
    @SerializedName("oldNumbers")
    @Expose
    private List<Object> oldNumbers = new ArrayList<Object>();
    private final static long serialVersionUID = -5992557591351164513L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FirObject() {
    }

    /**
     * 
     * @param firActualDate
     * @param oldNumbers
     * @param regionKey
     * @param objectData
     * @param parcelData
     * @param source
     * @param type
     * @param objectId
     * @param realtyData
     * @param premisesData
     * @param rightEncumbranceObjects
     */
    public FirObject(String objectId, String type, Integer regionKey, Integer source, String firActualDate, ObjectData objectData, ParcelData parcelData, Object realtyData, Object premisesData, Object rightEncumbranceObjects, List<Object> oldNumbers) {
        super();
        this.objectId = objectId;
        this.type = type;
        this.regionKey = regionKey;
        this.source = source;
        this.firActualDate = firActualDate;
        this.objectData = objectData;
        this.parcelData = parcelData;
        this.realtyData = realtyData;
        this.premisesData = premisesData;
        this.rightEncumbranceObjects = rightEncumbranceObjects;
        this.oldNumbers = oldNumbers;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getFirActualDate() {
        return firActualDate;
    }

    public void setFirActualDate(String firActualDate) {
        this.firActualDate = firActualDate;
    }

    public ObjectData getObjectData() {
        return objectData;
    }

    public void setObjectData(ObjectData objectData) {
        this.objectData = objectData;
    }

    public ParcelData getParcelData() {
        return parcelData;
    }

    public void setParcelData(ParcelData parcelData) {
        this.parcelData = parcelData;
    }

    public Object getRealtyData() {
        return realtyData;
    }

    public void setRealtyData(Object realtyData) {
        this.realtyData = realtyData;
    }

    public Object getPremisesData() {
        return premisesData;
    }

    public void setPremisesData(Object premisesData) {
        this.premisesData = premisesData;
    }

    public Object getRightEncumbranceObjects() {
        return rightEncumbranceObjects;
    }

    public void setRightEncumbranceObjects(Object rightEncumbranceObjects) {
        this.rightEncumbranceObjects = rightEncumbranceObjects;
    }

    public List<Object> getOldNumbers() {
        return oldNumbers;
    }

    public void setOldNumbers(List<Object> oldNumbers) {
        this.oldNumbers = oldNumbers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FirObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("objectId");
        sb.append('=');
        sb.append(((this.objectId == null)?"<null>":this.objectId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("regionKey");
        sb.append('=');
        sb.append(((this.regionKey == null)?"<null>":this.regionKey));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("firActualDate");
        sb.append('=');
        sb.append(((this.firActualDate == null)?"<null>":this.firActualDate));
        sb.append(',');
        sb.append("objectData");
        sb.append('=');
        sb.append(((this.objectData == null)?"<null>":this.objectData));
        sb.append(',');
        sb.append("parcelData");
        sb.append('=');
        sb.append(((this.parcelData == null)?"<null>":this.parcelData));
        sb.append(',');
        sb.append("realtyData");
        sb.append('=');
        sb.append(((this.realtyData == null)?"<null>":this.realtyData));
        sb.append(',');
        sb.append("premisesData");
        sb.append('=');
        sb.append(((this.premisesData == null)?"<null>":this.premisesData));
        sb.append(',');
        sb.append("rightEncumbranceObjects");
        sb.append('=');
        sb.append(((this.rightEncumbranceObjects == null)?"<null>":this.rightEncumbranceObjects));
        sb.append(',');
        sb.append("oldNumbers");
        sb.append('=');
        sb.append(((this.oldNumbers == null)?"<null>":this.oldNumbers));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
