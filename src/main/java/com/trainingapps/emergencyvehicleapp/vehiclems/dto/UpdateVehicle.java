package com.trainingapps.emergencyvehicleapp.vehiclems.dto;

import com.trainingapps.emergencyvehicleapp.vehiclems.common.VehicleColor;

public class UpdateVehicle {

    private long id;
    private String vehicleNumber;
    private VehicleColor vehicleColor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
