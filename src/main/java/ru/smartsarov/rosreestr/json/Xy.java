
package ru.smartsarov.rosreestr.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Xy implements Serializable {

    @SerializedName("y")
    @Expose
    private String y;
    @SerializedName("x")
    @Expose
    private String x;
    
    private final static long serialVersionUID = 8485034419045155672L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Xy() {
    }

    /**
     * 
     * @param x
     * @param y
     */
    public Xy(String y, String x) {
        super();
        this.y = y;
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
    
    public String getXy() {
    	return x + "," + y;
    }
}