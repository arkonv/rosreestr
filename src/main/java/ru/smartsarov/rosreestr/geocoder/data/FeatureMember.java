
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeatureMember implements Serializable
{

    @SerializedName("GeoObject")
    @Expose
	public GeoObject geoObject;
    private final static long serialVersionUID = -663650316059515162L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FeatureMember() {
    }

    /**
     * 
     * @param geoObject
     */
    public FeatureMember(GeoObject geoObject) {
        super();
        this.geoObject = geoObject;
    }

    public GeoObject getGeoObject() {
        return geoObject;
    }

    public void setGeoObject(GeoObject geoObject) {
        this.geoObject = geoObject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeatureMember.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geoObject");
        sb.append('=');
        sb.append(((this.geoObject == null)?"<null>":this.geoObject));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
