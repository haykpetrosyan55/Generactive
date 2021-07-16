package com.generactive;

public class Item {
    private int parentId;
    private int id;
    private String title;
    private String imageURL;
    private double price;
    private Currency currency;

    public Item(int parentId, int id, String title, String imageURL, double price, Currency currency) {
        this.parentId = parentId;
        this.id = id;
        this.title = title;
        this.imageURL = imageURL;
        this.price = price;
        this.currency = currency;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Item{" +
                "parentId=" + parentId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
}
