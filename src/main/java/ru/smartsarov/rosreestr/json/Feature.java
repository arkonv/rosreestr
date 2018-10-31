
package ru.smartsarov.rosreestr.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import ru.smartsarov.rosreestr.json.type.Attrs;

public class Feature implements Serializable
{

    @SerializedName("attrs")
    @Expose
    private Attrs attrs;
    @SerializedName("center")
    @Expose
    private Center center;
    @SerializedName("extent")
    @Expose
    private Extent extent;
    @SerializedName("sort")
    @Expose
    private Long sort;
    @SerializedName("type")
    @Expose
    private Integer type;
    private final static long serialVersionUID = 7815296313915985454L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Feature() {
    }

    /**
     * 
     * @param extent
     * @param center
     * @param sort
     * @param type
     * @param attrs
     */
    public Feature(Attrs attrs, Center center, Extent extent, Long sort, Integer type) {
        super();
        this.attrs = attrs;
        this.center = center;
        this.extent = extent;
        this.sort = sort;
        this.type = type;
    }

    public Attrs getAttrs() {
        return attrs;
    }

    public void setAttrs(Attrs attrs) {
        this.attrs = attrs;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public Extent getExtent() {
        return extent;
    }

    public void setExtent(Extent extent) {
        this.extent = extent;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Feature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attrs");
        sb.append('=');
        sb.append(((this.attrs == null)?"<null>":this.attrs));
        sb.append(',');
        sb.append("center");
        sb.append('=');
        sb.append(((this.center == null)?"<null>":this.center));
        sb.append(',');
        sb.append("extent");
        sb.append('=');
        sb.append(((this.extent == null)?"<null>":this.extent));
        sb.append(',');
        sb.append("sort");
        sb.append('=');
        sb.append(((this.sort == null)?"<null>":this.sort));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
