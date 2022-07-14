package com.bezkoder.springjwt.models;

import javax.persistence.*;


@Entity
@Table(name = "datastring")
public class DataString {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 1000)
    private String dataString;

    @Column(length = 1000)
    private String userId;

    public DataString(){

    }

    public DataString(Integer id, String dataString, String userId) {
        this.id = id;
        this.dataString = dataString;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
