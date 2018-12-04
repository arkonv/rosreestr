
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeocoderResponseMetaData implements Serializable
{

    @SerializedName("request")
    @Expose
    private String request;
    @SerializedName("found")
    @Expose
    private String found;
    @SerializedName("results")
    @Expose
    private String results;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy boundedBy;
    @SerializedName("Point")
    @Expose
    private Point point;
    @SerializedName("kind")
    @Expose
    private String kind;
    private final static long serialVersionUID = 4786787928665359430L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeocoderResponseMetaData() {
    }

    /**
     * 
     * @param request
     * @param found
     * @param kind
     * @param boundedBy
     * @param results
     * @param point
     */
    public GeocoderResponseMetaData(String request, String found, String results, BoundedBy boundedBy, Point point, String kind) {
        super();
        this.request = request;
        this.found = found;
        this.results = results;
        this.boundedBy = boundedBy;
        this.point = point;
        this.kind = kind;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getFound() {
        return found;
    }

    public void setFound(String found) {
        this.found = found;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public BoundedBy getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(BoundedBy boundedBy) {
        this.boundedBy = boundedBy;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeocoderResponseMetaData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("found");
        sb.append('=');
        sb.append(((this.found == null)?"<null>":this.found));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("boundedBy");
        sb.append('=');
        sb.append(((this.boundedBy == null)?"<null>":this.boundedBy));
        sb.append(',');
        sb.append("point");
        sb.append('=');
        sb.append(((this.point == null)?"<null>":this.point));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
