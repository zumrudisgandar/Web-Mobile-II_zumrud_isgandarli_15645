package com.jetbrains.marco.photos.clone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;

public class Photo {

    private String id;

    @NotEmpty
    private String fileName;

    @JsonIgnore
    private byte [] data;
    // raw data

    public Photo() {

    }
    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    // getter and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
