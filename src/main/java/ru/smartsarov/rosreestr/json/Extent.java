
package ru.smartsarov.rosreestr.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Extent implements Serializable
{

    @SerializedName("xmax")
    @Expose
    private Double xmax;
    @SerializedName("xmin")
    @Expose
    private Double xmin;
    @SerializedName("ymax")
    @Expose
    private Double ymax;
    @SerializedName("ymin")
    @Expose
    private Double ymin;
    private final static long serialVersionUID = 3524363094226617772L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Extent() {
    }

    /**
     * 
     * @param ymin
     * @param xmin
     * @param ymax
     * @param xmax
     */
    public Extent(Double xmax, Double xmin, Double ymax, Double ymin) {
        super();
        this.xmax = xmax;
        this.xmin = xmin;
        this.ymax = ymax;
        this.ymin = ymin;
    }

    public Double getXmax() {
        return xmax;
    }

    public void setXmax(Double xmax) {
        this.xmax = xmax;
    }

    public Double getXmin() {
        return xmin;
    }

    public void setXmin(Double xmin) {
        this.xmin = xmin;
    }

    public Double getYmax() {
        return ymax;
    }

    public void setYmax(Double ymax) {
        this.ymax = ymax;
    }

    public Double getYmin() {
        return ymin;
    }

    public void setYmin(Double ymin) {
        this.ymin = ymin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Extent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xmax");
        sb.append('=');
        sb.append(((this.xmax == null)?"<null>":this.xmax));
        sb.append(',');
        sb.append("xmin");
        sb.append('=');
        sb.append(((this.xmin == null)?"<null>":this.xmin));
        sb.append(',');
        sb.append("ymax");
        sb.append('=');
        sb.append(((this.ymax == null)?"<null>":this.ymax));
        sb.append(',');
        sb.append("ymin");
        sb.append('=');
        sb.append(((this.ymin == null)?"<null>":this.ymin));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
