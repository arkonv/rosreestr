
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoundedBy__1 implements Serializable
{

    @SerializedName("Envelope")
    @Expose
    private Envelope__1 envelope;
    private final static long serialVersionUID = -7814080739918627822L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BoundedBy__1() {
    }

    /**
     * 
     * @param envelope
     */
    public BoundedBy__1(Envelope__1 envelope) {
        super();
        this.envelope = envelope;
    }

    public Envelope__1 getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope__1 envelope) {
        this.envelope = envelope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BoundedBy__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("envelope");
        sb.append('=');
        sb.append(((this.envelope == null)?"<null>":this.envelope));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
