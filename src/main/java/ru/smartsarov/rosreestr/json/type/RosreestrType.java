
package ru.smartsarov.rosreestr.json.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import ru.smartsarov.rosreestr.json.Feature;

public class RosreestrType implements Serializable
{

    @SerializedName("features")
    @Expose
    private List<Feature> features = new ArrayList<Feature>();
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("total")
    @Expose
    private Integer total;
    private final static long serialVersionUID = 6123183132493818595L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RosreestrType() {
    }

    /**
     * 
     * @param features
     * @param note
     * @param total
     * @param status
     */
    public RosreestrType(List<Feature> features, String note, Integer status, Integer total) {
        super();
        this.features = features;
        this.note = note;
        this.status = status;
        this.total = total;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RosreestrType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
