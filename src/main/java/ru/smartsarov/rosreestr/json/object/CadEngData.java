
package ru.smartsarov.rosreestr.json.object;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CadEngData implements Serializable
{

    @SerializedName("actual_date")
    @Expose
    private String actualDate;
    @SerializedName("co_name")
    @Expose
    private String coName;
    @SerializedName("lastmodified")
    @Expose
    private String lastmodified;
    @SerializedName("rc_type")
    @Expose
    private Integer rcType;
    private final static long serialVersionUID = -4834576221072777262L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CadEngData() {
    }

    /**
     * 
     * @param lastmodified
     * @param coName
     * @param actualDate
     * @param rcType
     */
    public CadEngData(String actualDate, String coName, String lastmodified, Integer rcType) {
        super();
        this.actualDate = actualDate;
        this.coName = coName;
        this.lastmodified = lastmodified;
        this.rcType = rcType;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(String lastmodified) {
        this.lastmodified = lastmodified;
    }

    public Integer getRcType() {
        return rcType;
    }

    public void setRcType(Integer rcType) {
        this.rcType = rcType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CadEngData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actualDate");
        sb.append('=');
        sb.append(((this.actualDate == null)?"<null>":this.actualDate));
        sb.append(',');
        sb.append("coName");
        sb.append('=');
        sb.append(((this.coName == null)?"<null>":this.coName));
        sb.append(',');
        sb.append("lastmodified");
        sb.append('=');
        sb.append(((this.lastmodified == null)?"<null>":this.lastmodified));
        sb.append(',');
        sb.append("rcType");
        sb.append('=');
        sb.append(((this.rcType == null)?"<null>":this.rcType));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
