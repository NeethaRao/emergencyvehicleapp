package com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="house_address")
@Entity
public class HouseAddress {

    @GeneratedValue
    @Id
    private Long id;

    private String city;

    private String street;

    private String houseHouse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseHouse() {
        return houseHouse;
    }

    public void setHouseHouse(String houseHouse) {
        this.houseHouse = houseHouse;
    }
}
