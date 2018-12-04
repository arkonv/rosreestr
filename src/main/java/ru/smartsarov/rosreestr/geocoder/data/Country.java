
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country implements Serializable
{

    @SerializedName("AddressLine")
    @Expose
    private String addressLine;
    @SerializedName("CountryNameCode")
    @Expose
    private String countryNameCode;
    @SerializedName("CountryName")
    @Expose
    private String countryName;
    @SerializedName("AdministrativeArea")
    @Expose
	public AdministrativeArea administrativeArea;
    private final static long serialVersionUID = -8726544642747205190L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Country() {
    }

    /**
     * 
     * @param countryName
     * @param addressLine
     * @param administrativeArea
     * @param countryNameCode
     */
    public Country(String addressLine, String countryNameCode, String countryName, AdministrativeArea administrativeArea) {
        super();
        this.addressLine = addressLine;
        this.countryNameCode = countryNameCode;
        this.countryName = countryName;
        this.administrativeArea = administrativeArea;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCountryNameCode() {
        return countryNameCode;
    }

    public void setCountryNameCode(String countryNameCode) {
        this.countryNameCode = countryNameCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Country.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressLine");
        sb.append('=');
        sb.append(((this.addressLine == null)?"<null>":this.addressLine));
        sb.append(',');
        sb.append("countryNameCode");
        sb.append('=');
        sb.append(((this.countryNameCode == null)?"<null>":this.countryNameCode));
        sb.append(',');
        sb.append("countryName");
        sb.append('=');
        sb.append(((this.countryName == null)?"<null>":this.countryName));
        sb.append(',');
        sb.append("administrativeArea");
        sb.append('=');
        sb.append(((this.administrativeArea == null)?"<null>":this.administrativeArea));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
