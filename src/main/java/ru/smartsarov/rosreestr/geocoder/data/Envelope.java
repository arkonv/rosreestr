
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Envelope implements Serializable
{

    @SerializedName("lowerCorner")
    @Expose
    private String lowerCorner;
    @SerializedName("upperCorner")
    @Expose
    private String upperCorner;
    private final static long serialVersionUID = -3721841013932837326L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Envelope() {
    }

    /**
     * 
     * @param lowerCorner
     * @param upperCorner
     */
    public Envelope(String lowerCorner, String upperCorner) {
        super();
        this.lowerCorner = lowerCorner;
        this.upperCorner = upperCorner;
    }

    public String getLowerCorner() {
        return lowerCorner;
    }

    public void setLowerCorner(String lowerCorner) {
        this.lowerCorner = lowerCorner;
    }

    public String getUpperCorner() {
        return upperCorner;
    }

    public void setUpperCorner(String upperCorner) {
        this.upperCorner = upperCorner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Envelope.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lowerCorner");
        sb.append('=');
        sb.append(((this.lowerCorner == null)?"<null>":this.lowerCorner));
        sb.append(',');
        sb.append("upperCorner");
        sb.append('=');
        sb.append(((this.upperCorner == null)?"<null>":this.upperCorner));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
