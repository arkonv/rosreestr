
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoundedBy implements Serializable
{

    @SerializedName("Envelope")
    @Expose
    private Envelope envelope;
    private final static long serialVersionUID = 8534780871218855050L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BoundedBy() {
    }

    /**
     * 
     * @param envelope
     */
    public BoundedBy(Envelope envelope) {
        super();
        this.envelope = envelope;
    }

    public Envelope getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope envelope) {
        this.envelope = envelope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BoundedBy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
