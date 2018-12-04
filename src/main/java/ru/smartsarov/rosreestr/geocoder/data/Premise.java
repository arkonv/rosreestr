
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Premise implements Serializable
{

    @SerializedName("PremiseNumber")
    @Expose
    public String premiseNumber;
    @SerializedName("PostalCode")
    @Expose
    public PostalCode postalCode;
    private final static long serialVersionUID = 5698987728082032519L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Premise() {
    }

    /**
     * 
     * @param premiseNumber
     * @param postalCode
     */
    public Premise(String premiseNumber, PostalCode postalCode) {
        super();
        this.premiseNumber = premiseNumber;
        this.postalCode = postalCode;
    }

    public String getPremiseNumber() {
        return premiseNumber;
    }

    public void setPremiseNumber(String premiseNumber) {
        this.premiseNumber = premiseNumber;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Premise.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("premiseNumber");
        sb.append('=');
        sb.append(((this.premiseNumber == null)?"<null>":this.premiseNumber));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
