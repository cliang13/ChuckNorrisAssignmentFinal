package com.example.chucknorrisassignment;

import com.google.gson.annotations.SerializedName;

public class JokesModel {

@SerializedName("icon_url")
String icon_url;
@SerializedName("id")
String id;

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @SerializedName("url")
String url;
@SerializedName("value")
String value;
@SerializedName("created_at")
    String createdAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
