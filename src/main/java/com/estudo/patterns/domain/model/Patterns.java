package com.estudo.patterns.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PATTERN_TABLE")
public class Patterns extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 2311607522933786051L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_pattern")
    @JsonProperty("name")
    private String namePattern;

    @Column(name = "number_patter")
    @JsonProperty("number")
    private Integer numberPatter;

    @Column(name = "message_pattern")
    @JsonProperty("message")
    private String messagePattern;

    @Column(name = "property_pattern")
    @JsonProperty("property")
    private String propertyPattern;

    public Patterns() {
    }

    public Patterns(String namePattern, Integer numberPatter, String messagePattern, String propertyPattern) {
        this.namePattern = namePattern;
        this.numberPatter = numberPatter;
        this.messagePattern = messagePattern;
        this.propertyPattern = propertyPattern;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMessagePattern() {
        return messagePattern;
    }

    public void setMessagePattern(String messagePattern) {
        this.messagePattern = messagePattern;
    }

    public String getPropertyPattern() {
        return propertyPattern;
    }

    public void setPropertyPattern(String propertyPattern) {
        this.propertyPattern = propertyPattern;
    }
}
