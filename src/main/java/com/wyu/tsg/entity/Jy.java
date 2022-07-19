package com.wyu.tsg.entity;


import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Jy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String sh;

    private String sm;

    private Timestamp kstime;

    private Timestamp date;

    private Date jstime;

    @ManyToOne
    private Yh sjh;

    @OneToOne
    private Book qk;

    public Jy() {
        this.kstime = new Timestamp(System.currentTimeMillis());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public Timestamp getKstime() {
        return kstime;
    }

    public void setKstime(Timestamp kstime) {
        this.kstime = kstime;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Date getJstime() {
        return jstime;
    }

    public void setJstime(Date jstime) {
        this.jstime = jstime;
    }

    public Yh getSjh() {
        return sjh;
    }

    public void setSjh(Yh sjh) {
        this.sjh = sjh;
    }

    public Book getQk() {
        return qk;
    }

    public void setQk(Book qk) {
        this.qk = qk;
    }
}