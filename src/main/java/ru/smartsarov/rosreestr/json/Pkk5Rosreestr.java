
package ru.smartsarov.rosreestr.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pkk5Rosreestr implements Serializable
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
    private final static long serialVersionUID = 5091153008780184674L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pkk5Rosreestr() {
    }

    /**
     * 
     * @param features
     * @param note
     * @param total
     * @param status
     */
    public Pkk5Rosreestr(List<Feature> features, String note, Integer status, Integer total) {
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
        sb.append(Pkk5Rosreestr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pkk5Rosreestr) == false) {
            return false;
        }
        Pkk5Rosreestr rhs = ((Pkk5Rosreestr) other);
        return (((((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
