
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Locality implements Serializable
{

    @SerializedName("LocalityName")
    @Expose
    private String localityName;
    @SerializedName("Thoroughfare")
    @Expose
	public Thoroughfare thoroughfare;
    private final static long serialVersionUID = 6068318314599560627L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Locality() {
    }

    /**
     * 
     * @param localityName
     * @param thoroughfare
     */
    public Locality(String localityName, Thoroughfare thoroughfare) {
        super();
        this.localityName = localityName;
        this.thoroughfare = thoroughfare;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public Thoroughfare getThoroughfare() {
        return thoroughfare;
    }

    public void setThoroughfare(Thoroughfare thoroughfare) {
        this.thoroughfare = thoroughfare;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Locality.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("localityName");
        sb.append('=');
        sb.append(((this.localityName == null)?"<null>":this.localityName));
        sb.append(',');
        sb.append("thoroughfare");
        sb.append('=');
        sb.append(((this.thoroughfare == null)?"<null>":this.thoroughfare));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
