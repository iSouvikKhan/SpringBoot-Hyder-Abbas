package com.telusko.hateoas.models;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel {
    public int id;
    public String name;
    public double price;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Course(Link initialLink, int id, String name, double price) {
        super(initialLink);
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Course(Iterable initialLinks, int id, String name, double price) {
        super(initialLinks);
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
