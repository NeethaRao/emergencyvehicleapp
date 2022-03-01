package com.trainingapps.emergencyvehicleapp.vehiclerequestms.utility;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddressRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.HouseAddress;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleRequestUtility {

    @Autowired
    ModelMapper mapper;

    public VehicleRequest mapToVehicleRequest(AddVehicleRequest addVehicleRequest)
    {
        return mapper.map(addVehicleRequest, VehicleRequest.class);
    }

    public VehicleRequestDetails mapToVehicleRequestDetails(VehicleRequest vehicleRequest)
    {
        return mapper.map(vehicleRequest,VehicleRequestDetails.class);
    }

    public HouseAddress mapToHouseAddress(AddressRequest addressRequest)
    {
        return mapper.map(addressRequest, HouseAddress.class);
    }

    public AddressRequest mapToAddressRequest(HouseAddress houseAddress)
    {
        return mapper.map(houseAddress,AddressRequest.class);
    }
}
