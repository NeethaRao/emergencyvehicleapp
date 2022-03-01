package com.trainingapps.emergencyvehicleapp.vehiclems.utility;

import com.trainingapps.emergencyvehicleapp.vehiclems.dto.AddEmergencyVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.entity.EmergencyVehicle;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmergencyVehicleUtility {

    @Autowired
    ModelMapper mapper;

    public EmergencyVehicle mapToEmergencyVehicle(AddEmergencyVehicleRequest addEmergencyVehicleRequest) {
        return mapper.map(addEmergencyVehicleRequest, EmergencyVehicle.class);
    }

    public EmergencyVehicle mapToEmergencyVehicle(UpdateVehicle updateVehicle)
    {
        return  mapper.map(updateVehicle, EmergencyVehicle.class);
    }

    public EmergencyVehicleDetails mapToEmergencyVehicleDetails(EmergencyVehicle emergencyVehicle)
    {
        return  mapper.map(emergencyVehicle, EmergencyVehicleDetails.class);
    }

}
