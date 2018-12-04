
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostalCode implements Serializable
{

    @SerializedName("PostalCodeNumber")
    @Expose
    private String postalCodeNumber;
    private final static long serialVersionUID = -753231880031181229L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PostalCode() {
    }

    /**
     * 
     * @param postalCodeNumber
     */
    public PostalCode(String postalCodeNumber) {
        super();
        this.postalCodeNumber = postalCodeNumber;
    }

    public String getPostalCodeNumber() {
        return postalCodeNumber;
    }

    public void setPostalCodeNumber(String postalCodeNumber) {
        this.postalCodeNumber = postalCodeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PostalCode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("postalCodeNumber");
        sb.append('=');
        sb.append(((this.postalCodeNumber == null)?"<null>":this.postalCodeNumber));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
