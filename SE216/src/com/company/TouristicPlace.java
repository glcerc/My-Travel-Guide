package com.company;

public class TouristicPlace {
   private String name;
   private String location;
   private String budget;

    public TouristicPlace(String name, String location, String budget) {
        this.name = name;
        this.location = location;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
