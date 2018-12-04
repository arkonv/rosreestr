
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoObjectCollection implements Serializable
{

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty metaDataProperty;
    @SerializedName("featureMember")
    @Expose
	public List<FeatureMember> featureMember = new ArrayList<FeatureMember>();
    private final static long serialVersionUID = -6995814727841611765L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeoObjectCollection() {
    }

    /**
     * 
     * @param metaDataProperty
     * @param featureMember
     */
    public GeoObjectCollection(MetaDataProperty metaDataProperty, List<FeatureMember> featureMember) {
        super();
        this.metaDataProperty = metaDataProperty;
        this.featureMember = featureMember;
    }

    public MetaDataProperty getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public List<FeatureMember> getFeatureMember() {
        return featureMember;
    }

    public void setFeatureMember(List<FeatureMember> featureMember) {
        this.featureMember = featureMember;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeoObjectCollection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metaDataProperty");
        sb.append('=');
        sb.append(((this.metaDataProperty == null)?"<null>":this.metaDataProperty));
        sb.append(',');
        sb.append("featureMember");
        sb.append('=');
        sb.append(((this.featureMember == null)?"<null>":this.featureMember));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
