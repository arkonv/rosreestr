
package ru.smartsarov.rosreestr.json.object;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RosreestrObject implements Serializable {

    @SerializedName("feature")
    @Expose
    private Feature feature;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("total")
    @Expose
    private Integer total;
    private final static long serialVersionUID = 6368852111637178552L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RosreestrObject() {
    }

    /**
     * 
     * @param note
     * @param feature
     * @param status
     */
    public RosreestrObject(Feature feature, String note, Integer status) {
        super();
        this.feature = feature;
        this.note = note;
        this.status = status;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
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
}