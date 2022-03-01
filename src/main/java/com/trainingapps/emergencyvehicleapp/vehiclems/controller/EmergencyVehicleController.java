package com.trainingapps.emergencyvehicleapp.vehiclems.controller;

import com.trainingapps.emergencyvehicleapp.vehiclems.dto.AddEmergencyVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.exception.EmergencyVehicleNotFoundException;
import com.trainingapps.emergencyvehicleapp.vehiclems.services.IEmergencyVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RequestMapping("/emergencyvehicle")
@Validated
@RestController
public class EmergencyVehicleController {

    @Autowired
    IEmergencyVehicleService emergencyVehicleService;

    @PostMapping("/add")
    public EmergencyVehicleDetails add(@RequestBody @Valid AddEmergencyVehicleRequest addEmergencyVehicleRequest)
    {
        return emergencyVehicleService.add(addEmergencyVehicleRequest);
    }

    @GetMapping("/findbynumber/{vehicleNumber}")
    public EmergencyVehicleDetails findByNumber(@PathVariable String vehicleNumber) throws EmergencyVehicleNotFoundException
    {
        return emergencyVehicleService.findVehicleDetailsByVehicleNumber(vehicleNumber);
    }

    @PutMapping("update")
    public EmergencyVehicleDetails update(@RequestBody UpdateVehicle updateVehicle)throws EmergencyVehicleNotFoundException
    {
        return emergencyVehicleService.update(updateVehicle);
    }
}
