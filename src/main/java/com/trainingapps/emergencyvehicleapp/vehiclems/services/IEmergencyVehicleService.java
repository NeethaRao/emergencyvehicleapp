package com.trainingapps.emergencyvehicleapp.vehiclems.services;

import com.trainingapps.emergencyvehicleapp.vehiclems.dto.AddEmergencyVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.exception.EmergencyVehicleNotFoundException;

public interface IEmergencyVehicleService {
    EmergencyVehicleDetails add(AddEmergencyVehicleRequest request);
    EmergencyVehicleDetails findVehicleDetailsByVehicleNumber(String vehicleNumber) throws EmergencyVehicleNotFoundException;
    EmergencyVehicleDetails update(UpdateVehicle request) throws EmergencyVehicleNotFoundException;
}
