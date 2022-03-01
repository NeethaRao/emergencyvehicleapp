package com.trainingapps.emergencyvehicleapp.vehiclems.services;

import com.trainingapps.emergencyvehicleapp.vehiclems.repository.IEmergencyVehicleRepository;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.AddEmergencyVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.entity.EmergencyVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.exception.EmergencyVehicleNotFoundException;
import com.trainingapps.emergencyvehicleapp.vehiclems.utility.EmergencyVehicleUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmergencyVehicleService implements IEmergencyVehicleService {

    @Autowired
    IEmergencyVehicleRepository emergencyVehicleRepository;

    @Autowired
    EmergencyVehicleUtility emergencyVehicleUtility;

    @Override
    public EmergencyVehicleDetails add(AddEmergencyVehicleRequest request) {
        EmergencyVehicle emergencyVehicle = emergencyVehicleUtility.mapToEmergencyVehicle(request);
        return emergencyVehicleUtility.mapToEmergencyVehicleDetails(emergencyVehicleRepository.save(emergencyVehicle));
    }

    @Override
    public EmergencyVehicleDetails findVehicleDetailsByVehicleNumber(String vehicleNumber) throws EmergencyVehicleNotFoundException {
        Optional<EmergencyVehicle> emergencyVehicle = Optional.of(emergencyVehicleRepository.findVehicleDetailsByVehicleNumber(vehicleNumber));
        if (!emergencyVehicle.isPresent())
            throw new EmergencyVehicleNotFoundException("Emergency Vehicle Not Found");
        return emergencyVehicleUtility.mapToEmergencyVehicleDetails(emergencyVehicle.get());
    }

    @Override
    public EmergencyVehicleDetails update(UpdateVehicle request) throws EmergencyVehicleNotFoundException {
        if (!emergencyVehicleRepository.findById(request.getId()).isPresent())
            throw new EmergencyVehicleNotFoundException("Emergency Vehicle Not Found");
        EmergencyVehicle emergencyVehicle = emergencyVehicleUtility.mapToEmergencyVehicle(request);
        return emergencyVehicleUtility.mapToEmergencyVehicleDetails(emergencyVehicleRepository.save(emergencyVehicle));
    }


}
