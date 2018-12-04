
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoObject implements Serializable
{

    @SerializedName("metaDataProperty")
    @Expose
	public MetaDataProperty__1 metaDataProperty;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy__1 boundedBy;
    @SerializedName("Point")
    @Expose
    private Point__1 point;
    private final static long serialVersionUID = 4976871650938785725L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeoObject() {
    }

    /**
     * 
     * @param metaDataProperty
     * @param boundedBy
     * @param name
     * @param description
     * @param point
     */
    public GeoObject(MetaDataProperty__1 metaDataProperty, String description, String name, BoundedBy__1 boundedBy, Point__1 point) {
        super();
        this.metaDataProperty = metaDataProperty;
        this.description = description;
        this.name = name;
        this.boundedBy = boundedBy;
        this.point = point;
    }

    public MetaDataProperty__1 getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty__1 metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoundedBy__1 getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(BoundedBy__1 boundedBy) {
        this.boundedBy = boundedBy;
    }

    public Point__1 getPoint() {
        return point;
    }

    public void setPoint(Point__1 point) {
        this.point = point;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeoObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metaDataProperty");
        sb.append('=');
        sb.append(((this.metaDataProperty == null)?"<null>":this.metaDataProperty));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("boundedBy");
        sb.append('=');
        sb.append(((this.boundedBy == null)?"<null>":this.boundedBy));
        sb.append(',');
        sb.append("point");
        sb.append('=');
        sb.append(((this.point == null)?"<null>":this.point));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
