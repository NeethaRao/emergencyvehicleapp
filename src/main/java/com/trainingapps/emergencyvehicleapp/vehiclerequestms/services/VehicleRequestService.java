package com.trainingapps.emergencyvehicleapp.vehiclerequestms.services;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.exception.VehicleRequestNotFound;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.repository.IHouseAddressRepository;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.repository.IVehicleRequestRepository;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.utility.VehicleRequestUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleRequestService implements IVehicleRequestService {

    @Autowired
    VehicleRequestUtility vehicleRequestUtility;

    @Autowired
    IVehicleRequestRepository vehicleRequestRepository;

    @Autowired
    IHouseAddressRepository houseAddressRepository;

    @Override
    public VehicleRequestDetails add(AddVehicleRequest request) {
        VehicleRequest vehicleRequest = vehicleRequestUtility.mapToVehicleRequest(request);
        VehicleRequestDetails vehicleRequestDetails = vehicleRequestUtility.mapToVehicleRequestDetails(vehicleRequestRepository.save(vehicleRequest));
        return vehicleRequestDetails;
    }

    @Override
    public VehicleRequestDetails findRequestDetailsById(Long id) throws VehicleRequestNotFound {
        Optional<VehicleRequest> optional = findById(id);
        if(!optional.isPresent())
            throw new VehicleRequestNotFound("Vehicle Request Not Found");
        return vehicleRequestUtility.mapToVehicleRequestDetails(optional.get());
    }

    @Override
    public VehicleRequestDetails changeStatus(ChangeStatus changeStatus) throws VehicleRequestNotFound {
        Optional<VehicleRequest> optional = findById(changeStatus.getId());
        if(!optional.isPresent())
            throw new VehicleRequestNotFound("Vehicle Request Not Found");
        VehicleRequest vehicleRequest = optional.get();
        vehicleRequest.setRequestStatus(changeStatus.getRequestStatus());
        return vehicleRequestUtility.mapToVehicleRequestDetails(vehicleRequestRepository.save(vehicleRequest));
    }

    private Optional<VehicleRequest> findById(long id)
    {
        return vehicleRequestRepository.findById(id);
    }
}
