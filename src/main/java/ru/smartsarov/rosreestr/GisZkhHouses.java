package ru.smartsarov.rosreestr;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GisZkhHouses implements Serializable {
	private final static long serialVersionUID = 4857814666040165323L;
	
    @SerializedName("uid")
    @Expose
    private String uid;
    
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    
    @SerializedName("address")
    @Expose
    private String address;
    
    @SerializedName("cadastral")
    @Expose
    private String cadastral;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GisZkhHouses() {
    }

    /**
     * 
     * @param uid
     * @param address
     * @param latitude
     * @param longitude
     * @param cadastral
     */
    public GisZkhHouses(String uid, Double latitude, Double longitude, String address, String cadastral) {
        super();
        this.uid = uid;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.cadastral = cadastral;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCadastral() {
		return cadastral;
	}

	public void setCadastral(String cadastral) {
		this.cadastral = cadastral;
	}

	@Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GisZkhHouses) == false) {
            return false;
        }
        GisZkhHouses rhs = ((GisZkhHouses) other);
        return (((((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

}
