package com.trainingapps.emergencyvehicleapp.vehiclems.entity;

import com.trainingapps.emergencyvehicleapp.vehiclems.common.VehicleColor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "emergencyvehicle_data")
@Entity
public class EmergencyVehicle {

    @GeneratedValue
    @Id
    private Long id;
    private String vehicleNumber;
    private VehicleColor vehicleColor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleColor getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(VehicleColor vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
