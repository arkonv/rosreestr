
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdministrativeArea implements Serializable
{

    @SerializedName("AdministrativeAreaName")
    @Expose
    private String administrativeAreaName;
    @SerializedName("SubAdministrativeArea")
    @Expose
	public SubAdministrativeArea subAdministrativeArea;
    private final static long serialVersionUID = -5514262396232941724L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdministrativeArea() {
    }

    /**
     * 
     * @param subAdministrativeArea
     * @param administrativeAreaName
     */
    public AdministrativeArea(String administrativeAreaName, SubAdministrativeArea subAdministrativeArea) {
        super();
        this.administrativeAreaName = administrativeAreaName;
        this.subAdministrativeArea = subAdministrativeArea;
    }

    public String getAdministrativeAreaName() {
        return administrativeAreaName;
    }

    public void setAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
    }

    public SubAdministrativeArea getSubAdministrativeArea() {
        return subAdministrativeArea;
    }

    public void setSubAdministrativeArea(SubAdministrativeArea subAdministrativeArea) {
        this.subAdministrativeArea = subAdministrativeArea;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdministrativeArea.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("administrativeAreaName");
        sb.append('=');
        sb.append(((this.administrativeAreaName == null)?"<null>":this.administrativeAreaName));
        sb.append(',');
        sb.append("subAdministrativeArea");
        sb.append('=');
        sb.append(((this.subAdministrativeArea == null)?"<null>":this.subAdministrativeArea));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
