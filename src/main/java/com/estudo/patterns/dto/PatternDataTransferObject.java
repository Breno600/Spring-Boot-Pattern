package com.estudo.patterns.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class PatternDataTransferObject {

    @JsonProperty("Name")
    private String namePattern;
    @JsonProperty("Number")
    private Integer numberPatter;

    public PatternDataTransferObject() {
    }

    public PatternDataTransferObject(String namePattern, Integer numberPatter) {
        this.namePattern = namePattern;
        this.numberPatter = numberPatter;
    }

    public String getNamePattern() {
        return namePattern;
    }

    public void setNamePattern(String namePattern) {
        this.namePattern = namePattern;
    }

    public Integer getNumberPatter() {
        return numberPatter;
    }

    public void setNumberPatter(Integer numberPatter) {
        this.numberPatter = numberPatter;
    }
}
