package com.trainingapps.emergencyvehicleapp.vehiclerequestms.controller;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.exception.VehicleRequestNotFound;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.services.IVehicleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/vehiclerequest")
@RestController
public class VehicleRequestController {

    @Autowired
    IVehicleRequestService vehicleRequestService;

    @PostMapping("/add")
    public VehicleRequestDetails add(@RequestBody AddVehicleRequest addVehicleRequest)
    {
        return vehicleRequestService.add(addVehicleRequest);
    }

    @GetMapping("/findbyid/{id}")
    public VehicleRequestDetails findById(@PathVariable long id) throws VehicleRequestNotFound
    {
        return vehicleRequestService.findRequestDetailsById(id);
    }

    @PutMapping("/update/")
    public VehicleRequestDetails changeStatus(@RequestBody ChangeStatus changeStatus) throws VehicleRequestNotFound {
        return vehicleRequestService.changeStatus(changeStatus);
    }
}
