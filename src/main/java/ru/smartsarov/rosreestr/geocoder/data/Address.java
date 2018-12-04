
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address implements Serializable
{

    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("formatted")
    @Expose
    private String formatted;
    @SerializedName("Components")
    @Expose
    private List<Component> components = new ArrayList<Component>();
    private final static long serialVersionUID = -5885109487286994986L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param components
     * @param countryCode
     * @param formatted
     * @param postalCode
     */
    public Address(String countryCode, String postalCode, String formatted, List<Component> components) {
        super();
        this.countryCode = countryCode;
        this.postalCode = postalCode;
        this.formatted = formatted;
        this.components = components;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("formatted");
        sb.append('=');
        sb.append(((this.formatted == null)?"<null>":this.formatted));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
