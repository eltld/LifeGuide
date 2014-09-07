package com.example.LifeGuide.entitys;

/**
 * Created by 刚 on 2014/8/30.
 */
public class TvCategory {
    private String  category;
    private String imgDisplay;

    public TvCategory(String category, String imgDisplay) {
        this.category = category;
        this.imgDisplay = imgDisplay;
    }

    public TvCategory() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImgDisplay() {
        return imgDisplay;
    }

    public void setImgDisplay(String imgDisplay) {
        this.imgDisplay = imgDisplay;
    }
}
