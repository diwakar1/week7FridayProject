package com.example.week7;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Weekday {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long weekdayid;
    private String day;
    private String time;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "fruitid")
    private Fruit fruit;


    public long getWeekdayid() {
        return weekdayid;
    }

    public void setWeekdayid(long weekdayid) {
        this.weekdayid = weekdayid;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}