
package ru.smartsarov.rosreestr.json.type;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attrs implements Serializable
{

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("cn")
    @Expose
    private String cn;
    @SerializedName("id")
    @Expose
    private String id;
    private final static long serialVersionUID = -1517016387047844938L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attrs() {
    }

    /**
     * 
     * @param address
     * @param cn
     * @param id
     */
    public Attrs(String address, String cn, String id) {
        super();
        this.address = address;
        this.cn = cn;
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attrs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("cn");
        sb.append('=');
        sb.append(((this.cn == null)?"<null>":this.cn));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
