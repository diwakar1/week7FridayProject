package com.example.week7;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long fruitid;
    private String name;

    @OneToMany(mappedBy = "fruit",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    public Set<Weekday> weekdays;


    public long getFruitid() {
        return fruitid;
    }

    public void setFruitid(long fruitid) {
        this.fruitid = fruitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Weekday> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(Set<Weekday> weekdays) {
        this.weekdays = weekdays;
    }
}
