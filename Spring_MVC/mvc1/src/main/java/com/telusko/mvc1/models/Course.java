package com.telusko.mvc1.models;

public class Course {

    private Integer cid;
    private String cname;
    private Double cost;

    public Integer getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Course() {
        super();
    }

    public Course(Integer cid, String cname, Double cost) {
        this.cid = cid;
        this.cname = cname;
        this.cost = cost;
    }
}
