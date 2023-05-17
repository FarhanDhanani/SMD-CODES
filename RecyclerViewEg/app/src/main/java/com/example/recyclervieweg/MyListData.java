package com.example.recyclervieweg;

public class MyListData {

    private String description;
    private int imgId;
    private String usama;
    public MyListData(String description, int imgId,String usama) {
        this.description = description;
        this.imgId = imgId;
        this.usama=usama;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getusama() {
        return usama;
    }
    public void setusama(String usama) {
        this.usama = usama;
    }
}
