
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thoroughfare implements Serializable
{

    @SerializedName("ThoroughfareName")
    @Expose
    public String thoroughfareName;
    @SerializedName("Premise")
    @Expose
    public Premise premise;
    private final static long serialVersionUID = 7392709007677362680L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Thoroughfare() {
    }

    /**
     * 
     * @param thoroughfareName
     * @param premise
     */
    public Thoroughfare(String thoroughfareName, Premise premise) {
        super();
        this.thoroughfareName = thoroughfareName;
        this.premise = premise;
    }

    public String getThoroughfareName() {
        return thoroughfareName;
    }

    public void setThoroughfareName(String thoroughfareName) {
        this.thoroughfareName = thoroughfareName;
    }

    public Premise getPremise() {
        return premise;
    }

    public void setPremise(Premise premise) {
        this.premise = premise;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Thoroughfare.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("thoroughfareName");
        sb.append('=');
        sb.append(((this.thoroughfareName == null)?"<null>":this.thoroughfareName));
        sb.append(',');
        sb.append("premise");
        sb.append('=');
        sb.append(((this.premise == null)?"<null>":this.premise));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
