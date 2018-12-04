
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetaDataProperty__1 implements Serializable
{

    @SerializedName("GeocoderMetaData")
    @Expose
	public GeocoderMetaData geocoderMetaData;
    private final static long serialVersionUID = -3265500356667340957L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetaDataProperty__1() {
    }

    /**
     * 
     * @param geocoderMetaData
     */
    public MetaDataProperty__1(GeocoderMetaData geocoderMetaData) {
        super();
        this.geocoderMetaData = geocoderMetaData;
    }

    public GeocoderMetaData getGeocoderMetaData() {
        return geocoderMetaData;
    }

    public void setGeocoderMetaData(GeocoderMetaData geocoderMetaData) {
        this.geocoderMetaData = geocoderMetaData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetaDataProperty__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geocoderMetaData");
        sb.append('=');
        sb.append(((this.geocoderMetaData == null)?"<null>":this.geocoderMetaData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
