package com.generactive;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int parentId;
    private int id;
    private String  title;
    private String imageURL;
    private List<Group> subGroups;
    private List<Item> items;

    public Group(int id, String title) {
        this.parentId = 0;
        this.id = id;
        this.title = title;
        this.subGroups = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public Group(int parentId, int id, String title) {
        this.parentId = parentId;
        this.id = id;
        this.title = title;
        this.subGroups = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public Group(int parentId, int id, String title, String imageURL) {
        this.parentId = parentId;
        this.id = id;
        this.title = title;
        this.imageURL = imageURL;
        this.subGroups = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public int getParentId() {
        return parentId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public List<Group> getSubGroups() {
        return subGroups;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Group{" +
                "parentId=" + parentId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", subGroups=" + subGroups +
                ", items=" + items +
                '}';
    }

    public String toStringSubGroups(){
        StringBuilder s = new StringBuilder();
        for (Group subGroup : subGroups) {
            s.append("     ").append(subGroup.getTitle()).append("\n");
        }
        return s.toString();
    }

    public String toStringItems(){
        StringBuilder s = new StringBuilder();
        for (Item item : items) {
            s.append("     ").append(item.getTitle()).append("\n");
        }
        return s.toString();
    }
}
