package ru.smartsarov.rosreestr.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirObjects implements Serializable {

    @SerializedName("objectId")
    @Expose
    private String objectId;
    @SerializedName("srcObject")
    @Expose
    private Integer srcObject;
    @SerializedName("regionKey")
    @Expose
    private Integer regionKey;
    @SerializedName("objectType")
    @Expose
    private String objectType;
    @SerializedName("objectCn")
    @Expose
    private String objectCn;
    @SerializedName("objectCon")
    @Expose
    private String objectCon;
    @SerializedName("subjectId")
    @Expose
    private Long subjectId;
    @SerializedName("regionId")
    @Expose
    private Long regionId;
    @SerializedName("settlementId")
    @Expose
    private String settlementId;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("house")
    @Expose
    private String house;
    @SerializedName("addressNotes")
    @Expose
    private String addressNotes;
    @SerializedName("okato")
    @Expose
    private Object okato;
    @SerializedName("apartment")
    @Expose
    private String apartment;
    @SerializedName("nobjectCn")
    @Expose
    private String nobjectCn;
    @SerializedName("nobjectCon")
    @Expose
    private String nobjectCon;
    private final static long serialVersionUID = 7189482725903616603L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FirObjects() {
    }

    /**
     * 
     * @param addressNotes
     * @param regionKey
     * @param settlementId
     * @param house
     * @param objectCn
     * @param subjectId
     * @param okato
     * @param objectType
     * @param srcObject
     * @param nobjectCon
     * @param nobjectCn
     * @param objectCon
     * @param regionId
     * @param street
     * @param objectId
     * @param apartment
     */
    public FirObjects(String objectId, Integer srcObject, Integer regionKey, String objectType, String objectCn, String objectCon, Long subjectId, Long regionId, String settlementId, String street, String house, String addressNotes, Object okato, String apartment, String nobjectCn, String nobjectCon) {
        super();
        this.objectId = objectId;
        this.srcObject = srcObject;
        this.regionKey = regionKey;
        this.objectType = objectType;
        this.objectCn = objectCn;
        this.objectCon = objectCon;
        this.subjectId = subjectId;
        this.regionId = regionId;
        this.settlementId = settlementId;
        this.street = street;
        this.house = house;
        this.addressNotes = addressNotes;
        this.okato = okato;
        this.apartment = apartment;
        this.nobjectCn = nobjectCn;
        this.nobjectCon = nobjectCon;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Integer getSrcObject() {
        return srcObject;
    }

    public void setSrcObject(Integer srcObject) {
        this.srcObject = srcObject;
    }

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectCn() {
        return objectCn;
    }

    public void setObjectCn(String objectCn) {
        this.objectCn = objectCn;
    }

    public String getObjectCon() {
        return objectCon;
    }

    public void setObjectCon(String objectCon) {
        this.objectCon = objectCon;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAddressNotes() {
        return addressNotes;
    }

    public void setAddressNotes(String addressNotes) {
        this.addressNotes = addressNotes;
    }

    public Object getOkato() {
        return okato;
    }

    public void setOkato(Object okato) {
        this.okato = okato;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getNobjectCn() {
        return nobjectCn;
    }

    public void setNobjectCn(String nobjectCn) {
        this.nobjectCn = nobjectCn;
    }

    public String getNobjectCon() {
        return nobjectCon;
    }

    public void setNobjectCon(String nobjectCon) {
        this.nobjectCon = nobjectCon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FirObjects.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("objectId");
        sb.append('=');
        sb.append(((this.objectId == null)?"<null>":this.objectId));
        sb.append(',');
        sb.append("srcObject");
        sb.append('=');
        sb.append(((this.srcObject == null)?"<null>":this.srcObject));
        sb.append(',');
        sb.append("regionKey");
        sb.append('=');
        sb.append(((this.regionKey == null)?"<null>":this.regionKey));
        sb.append(',');
        sb.append("objectType");
        sb.append('=');
        sb.append(((this.objectType == null)?"<null>":this.objectType));
        sb.append(',');
        sb.append("objectCn");
        sb.append('=');
        sb.append(((this.objectCn == null)?"<null>":this.objectCn));
        sb.append(',');
        sb.append("objectCon");
        sb.append('=');
        sb.append(((this.objectCon == null)?"<null>":this.objectCon));
        sb.append(',');
        sb.append("subjectId");
        sb.append('=');
        sb.append(((this.subjectId == null)?"<null>":this.subjectId));
        sb.append(',');
        sb.append("regionId");
        sb.append('=');
        sb.append(((this.regionId == null)?"<null>":this.regionId));
        sb.append(',');
        sb.append("settlementId");
        sb.append('=');
        sb.append(((this.settlementId == null)?"<null>":this.settlementId));
        sb.append(',');
        sb.append("street");
        sb.append('=');
        sb.append(((this.street == null)?"<null>":this.street));
        sb.append(',');
        sb.append("house");
        sb.append('=');
        sb.append(((this.house == null)?"<null>":this.house));
        sb.append(',');
        sb.append("addressNotes");
        sb.append('=');
        sb.append(((this.addressNotes == null)?"<null>":this.addressNotes));
        sb.append(',');
        sb.append("okato");
        sb.append('=');
        sb.append(((this.okato == null)?"<null>":this.okato));
        sb.append(',');
        sb.append("apartment");
        sb.append('=');
        sb.append(((this.apartment == null)?"<null>":this.apartment));
        sb.append(',');
        sb.append("nobjectCn");
        sb.append('=');
        sb.append(((this.nobjectCn == null)?"<null>":this.nobjectCn));
        sb.append(',');
        sb.append("nobjectCon");
        sb.append('=');
        sb.append(((this.nobjectCon == null)?"<null>":this.nobjectCon));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
