
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetaDataProperty implements Serializable
{

    @SerializedName("GeocoderResponseMetaData")
    @Expose
    private GeocoderResponseMetaData geocoderResponseMetaData;
    private final static long serialVersionUID = -7412352513439232213L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetaDataProperty() {
    }

    /**
     * 
     * @param geocoderResponseMetaData
     */
    public MetaDataProperty(GeocoderResponseMetaData geocoderResponseMetaData) {
        super();
        this.geocoderResponseMetaData = geocoderResponseMetaData;
    }

    public GeocoderResponseMetaData getGeocoderResponseMetaData() {
        return geocoderResponseMetaData;
    }

    public void setGeocoderResponseMetaData(GeocoderResponseMetaData geocoderResponseMetaData) {
        this.geocoderResponseMetaData = geocoderResponseMetaData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetaDataProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geocoderResponseMetaData");
        sb.append('=');
        sb.append(((this.geocoderResponseMetaData == null)?"<null>":this.geocoderResponseMetaData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
