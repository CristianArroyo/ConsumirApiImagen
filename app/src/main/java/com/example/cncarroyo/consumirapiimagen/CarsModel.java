
package com.example.cncarroyo.consumirapiimagen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarsModel {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("image")
    @Expose
    private String image;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CarsModel() {
    }

    /**
     * 
     * @param id
     * @param desc
     * @param name
     * @param image
     */
    public CarsModel(String id, String name, String desc, String image) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
