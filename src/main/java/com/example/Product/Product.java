package com.example.Product;

public class Product {
    String name;
    Integer sellIn;
    Integer quality;
    String type;

    public Product(String name, Integer sellIn, Integer quality, String type) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getSellIn() {
        return sellIn;
    }
    public void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }
    public Integer getQuality() {
        return quality;
    }
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public void lowerQuality(Integer amount) {
        this.quality -= amount;
    }

    public void increaseQuality(Integer amount) {
        this.quality += amount;
    }
}
