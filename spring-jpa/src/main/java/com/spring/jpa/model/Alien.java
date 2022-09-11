package com.spring.jpa.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int aid;
    private String color;
    private AlienName alienName;
    @OneToMany(mappedBy = "alien",fetch = FetchType.EAGER)
    private List<Laptop> laptop = new ArrayList<>();

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AlienName getAlienName() {
        return alienName;
    }

    public void setAlienName(AlienName alienName) {
        this.alienName = alienName;
    }
}
