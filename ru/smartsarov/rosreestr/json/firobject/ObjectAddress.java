
package ru.smartsarov.rosreestr.json.firobject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObjectAddress implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("regionKey")
    @Expose
    private Integer regionKey;
    @SerializedName("okato")
    @Expose
    private String okato;
    @SerializedName("kladr")
    @Expose
    private String kladr;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("district")
    @Expose
    private Object district;
    @SerializedName("districtType")
    @Expose
    private String districtType;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("placeType")
    @Expose
    private String placeType;
    @SerializedName("locality")
    @Expose
    private Object locality;
    @SerializedName("localityType")
    @Expose
    private String localityType;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("streetType")
    @Expose
    private String streetType;
    @SerializedName("house")
    @Expose
    private String house;
    @SerializedName("building")
    @Expose
    private Object building;
    @SerializedName("structure")
    @Expose
    private Object structure;
    @SerializedName("apartment")
    @Expose
    private String apartment;
    @SerializedName("addressNotes")
    @Expose
    private Object addressNotes;
    @SerializedName("mergedAddress")
    @Expose
    private String mergedAddress;
    private final static long serialVersionUID = 7446689324825678838L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectAddress() {
    }

    /**
     * 
     * @param mergedAddress
     * @param streetType
     * @param addressNotes
     * @param regionKey
     * @param districtType
     * @param locality
     * @param house
     * @param okato
     * @param building
     * @param structure
     * @param placeType
     * @param street
     * @param district
     * @param kladr
     * @param id
     * @param place
     * @param region
     * @param localityType
     * @param apartment
     */
    public ObjectAddress(String id, Integer regionKey, String okato, String kladr, String region, Object district, String districtType, String place, String placeType, Object locality, String localityType, String street, String streetType, String house, Object building, Object structure, String apartment, Object addressNotes, String mergedAddress) {
        super();
        this.id = id;
        this.regionKey = regionKey;
        this.okato = okato;
        this.kladr = kladr;
        this.region = region;
        this.district = district;
        this.districtType = districtType;
        this.place = place;
        this.placeType = placeType;
        this.locality = locality;
        this.localityType = localityType;
        this.street = street;
        this.streetType = streetType;
        this.house = house;
        this.building = building;
        this.structure = structure;
        this.apartment = apartment;
        this.addressNotes = addressNotes;
        this.mergedAddress = mergedAddress;
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

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public String getKladr() {
        return kladr;
    }

    public void setKladr(String kladr) {
        this.kladr = kladr;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Object getDistrict() {
        return district;
    }

    public void setDistrict(Object district) {
        this.district = district;
    }

    public String getDistrictType() {
        return districtType;
    }

    public void setDistrictType(String districtType) {
        this.districtType = districtType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public Object getLocality() {
        return locality;
    }

    public void setLocality(Object locality) {
        this.locality = locality;
    }

    public String getLocalityType() {
        return localityType;
    }

    public void setLocalityType(String localityType) {
        this.localityType = localityType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Object getBuilding() {
        return building;
    }

    public void setBuilding(Object building) {
        this.building = building;
    }

    public Object getStructure() {
        return structure;
    }

    public void setStructure(Object structure) {
        this.structure = structure;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public Object getAddressNotes() {
        return addressNotes;
    }

    public void setAddressNotes(Object addressNotes) {
        this.addressNotes = addressNotes;
    }

    public String getMergedAddress() {
        return mergedAddress;
    }

    public void setMergedAddress(String mergedAddress) {
        this.mergedAddress = mergedAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObjectAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("regionKey");
        sb.append('=');
        sb.append(((this.regionKey == null)?"<null>":this.regionKey));
        sb.append(',');
        sb.append("okato");
        sb.append('=');
        sb.append(((this.okato == null)?"<null>":this.okato));
        sb.append(',');
        sb.append("kladr");
        sb.append('=');
        sb.append(((this.kladr == null)?"<null>":this.kladr));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("district");
        sb.append('=');
        sb.append(((this.district == null)?"<null>":this.district));
        sb.append(',');
        sb.append("districtType");
        sb.append('=');
        sb.append(((this.districtType == null)?"<null>":this.districtType));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("placeType");
        sb.append('=');
        sb.append(((this.placeType == null)?"<null>":this.placeType));
        sb.append(',');
        sb.append("locality");
        sb.append('=');
        sb.append(((this.locality == null)?"<null>":this.locality));
        sb.append(',');
        sb.append("localityType");
        sb.append('=');
        sb.append(((this.localityType == null)?"<null>":this.localityType));
        sb.append(',');
        sb.append("street");
        sb.append('=');
        sb.append(((this.street == null)?"<null>":this.street));
        sb.append(',');
        sb.append("streetType");
        sb.append('=');
        sb.append(((this.streetType == null)?"<null>":this.streetType));
        sb.append(',');
        sb.append("house");
        sb.append('=');
        sb.append(((this.house == null)?"<null>":this.house));
        sb.append(',');
        sb.append("building");
        sb.append('=');
        sb.append(((this.building == null)?"<null>":this.building));
        sb.append(',');
        sb.append("structure");
        sb.append('=');
        sb.append(((this.structure == null)?"<null>":this.structure));
        sb.append(',');
        sb.append("apartment");
        sb.append('=');
        sb.append(((this.apartment == null)?"<null>":this.apartment));
        sb.append(',');
        sb.append("addressNotes");
        sb.append('=');
        sb.append(((this.addressNotes == null)?"<null>":this.addressNotes));
        sb.append(',');
        sb.append("mergedAddress");
        sb.append('=');
        sb.append(((this.mergedAddress == null)?"<null>":this.mergedAddress));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
