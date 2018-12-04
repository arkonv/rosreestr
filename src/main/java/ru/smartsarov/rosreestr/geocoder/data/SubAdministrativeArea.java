
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubAdministrativeArea implements Serializable
{

    @SerializedName("SubAdministrativeAreaName")
    @Expose
    private String subAdministrativeAreaName;
    @SerializedName("Locality")
    @Expose
	public Locality locality;
    private final static long serialVersionUID = -8033074326632623321L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubAdministrativeArea() {
    }

    /**
     * 
     * @param locality
     * @param subAdministrativeAreaName
     */
    public SubAdministrativeArea(String subAdministrativeAreaName, Locality locality) {
        super();
        this.subAdministrativeAreaName = subAdministrativeAreaName;
        this.locality = locality;
    }

    public String getSubAdministrativeAreaName() {
        return subAdministrativeAreaName;
    }

    public void setSubAdministrativeAreaName(String subAdministrativeAreaName) {
        this.subAdministrativeAreaName = subAdministrativeAreaName;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubAdministrativeArea.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("subAdministrativeAreaName");
        sb.append('=');
        sb.append(((this.subAdministrativeAreaName == null)?"<null>":this.subAdministrativeAreaName));
        sb.append(',');
        sb.append("locality");
        sb.append('=');
        sb.append(((this.locality == null)?"<null>":this.locality));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
