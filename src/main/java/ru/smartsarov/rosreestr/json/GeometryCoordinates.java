
package ru.smartsarov.rosreestr.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeometryCoordinates implements Serializable {

    @SerializedName("geometries")
    @Expose
    private List<Geometry> geometries = new ArrayList<Geometry>();
    private final static long serialVersionUID = 3301027761580451327L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeometryCoordinates() {
    }

    /**
     * 
     * @param geometries
     */
    public GeometryCoordinates(List<Geometry> geometries) {
        super();
        this.geometries = geometries;
    }

    public List<Geometry> getGeometries() {
        return geometries;
    }

    public void setGeometries(List<Geometry> geometries) {
        this.geometries = geometries;
    }

    public String getGeometryCoordinates() {
    	StringBuilder ret = new StringBuilder(100);
    	geometries.stream().forEachOrdered(g -> ret.append(g.getGeometry()).append(","));
    	return ret.toString().substring(0, ret.length() - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeometryCoordinates.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geometries");
        sb.append('=');
        sb.append(((this.geometries == null)?"<null>":this.geometries));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
