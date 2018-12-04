
package ru.smartsarov.rosreestr.geocoder.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeocoderMetaData implements Serializable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("precision")
    @Expose
    private String precision;
    @SerializedName("Address")
    @Expose
    private Address address;
    @SerializedName("AddressDetails")
    @Expose
	public AddressDetails addressDetails;
    private final static long serialVersionUID = -3044898970374815268L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeocoderMetaData() {
    }

    /**
     * 
     * @param address
     * @param kind
     * @param precision
     * @param addressDetails
     * @param text
     */
    public GeocoderMetaData(String kind, String text, String precision, Address address, AddressDetails addressDetails) {
        super();
        this.kind = kind;
        this.text = text;
        this.precision = precision;
        this.address = address;
        this.addressDetails = addressDetails;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeocoderMetaData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("addressDetails");
        sb.append('=');
        sb.append(((this.addressDetails == null)?"<null>":this.addressDetails));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
