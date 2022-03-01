package com.trainingapps.emergencyvehicleapp.vehiclems.dto;

import com.trainingapps.emergencyvehicleapp.vehiclems.common.VehicleColor;

import javax.validation.constraints.Size;

public class AddEmergencyVehicleRequest {

    @Size(min=1,max=10)
    private String vehicleNumber;
    private VehicleColor vehicleColor;

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
