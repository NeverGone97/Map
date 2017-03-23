package com.example.nut_it.map.Model;


import com.google.gson.annotations.SerializedName;

public class Infomation {
    @SerializedName("id")
    public int id;
    @SerializedName("icon")
    public String icon;
    @SerializedName("latitude")
    public boolean latitude;
    @SerializedName("longitude")
    public boolean longitude;
    @SerializedName("name_vi")
    public  String name_vi;
    @SerializedName("category")
    public String category;
    @SerializedName("short_description_vi")
    public  String short_description_vi;
    @SerializedName("address_vi")
    public  String address_vi;
    @SerializedName("img_big")
    public String img_big;
    @SerializedName("img_small")
    public String img_small;


    public Infomation(int id, String icon, boolean latitude, boolean longitude, String name_vi, String category, String short_description_vi, String address_vi, String img_big, String img_small) {
        this.id = id;
        this.icon = icon;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name_vi = name_vi;
        this.category = category;
        this.short_description_vi = short_description_vi;
        this.address_vi = address_vi;
        this.img_big = img_big;
        this.img_small = img_small;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isLatitude() {
        return latitude;
    }

    public void setLatitude(boolean latitude) {
        this.latitude = latitude;
    }

    public boolean isLongitude() {
        return longitude;
    }

    public void setLongitude(boolean longitude) {
        this.longitude = longitude;
    }

    public String getName_vi() {
        return name_vi;
    }

    public void setName_vi(String name_vi) {
        this.name_vi = name_vi;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShort_description_vi() {
        return short_description_vi;
    }

    public void setShort_description_vi(String short_description_vi) {
        this.short_description_vi = short_description_vi;
    }

    public String getAddress_vi() {
        return address_vi;
    }

    public void setAddress_vi(String address_vi) {
        this.address_vi = address_vi;
    }

    public String getImg_big() {
        return img_big;
    }

    public void setImg_big(String img_big) {
        this.img_big = img_big;
    }

    public String getImg_small() {
        return img_small;
    }

    public void setImg_small(String img_small) {
        this.img_small = img_small;
    }

    @Override
    public String toString() {
        return "Infomation{" +
                "id=" + id +
                ", icon='" + icon + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", name_vi='" + name_vi + '\'' +
                ", category='" + category + '\'' +
                ", short_description_vi='" + short_description_vi + '\'' +
                ", address_vi='" + address_vi + '\'' +
                ", img_big='" + img_big + '\'' +
                ", img_small='" + img_small + '\'' +
                '}';
    }
}
