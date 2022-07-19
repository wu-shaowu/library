package com.wyu.tsg.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Yh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private Integer sjh;

    private String username;

    private String password;

    private Integer bz;

    public Integer getBz() {
        return bz;
    }

    public void setBz(Integer bz) {
        this.bz = bz;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSjh() {
        return sjh;
    }

    public void setSjh(Integer sjh) {
        this.sjh = sjh;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
