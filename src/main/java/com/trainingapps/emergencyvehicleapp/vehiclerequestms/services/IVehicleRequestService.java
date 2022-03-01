package com.trainingapps.emergencyvehicleapp.vehiclerequestms.services;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.exception.VehicleRequestNotFound;

public interface IVehicleRequestService {

    VehicleRequestDetails add(AddVehicleRequest request);

    VehicleRequestDetails findRequestDetailsById(Long id) throws VehicleRequestNotFound;

    VehicleRequestDetails changeStatus(ChangeStatus changeStatus) throws VehicleRequestNotFound;
}
