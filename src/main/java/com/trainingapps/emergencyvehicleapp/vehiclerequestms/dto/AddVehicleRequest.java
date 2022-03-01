package com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.common.RequestStatus;

public class AddVehicleRequest {
    private String pincode;
    private String phoneNumber;
    private RequestStatus requestStatus;
    private AddressRequest addressRequest;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public AddressRequest getAddressRequest() {
        return addressRequest;
    }

    public void setAddressRequest(AddressRequest addressRequest) {
        this.addressRequest = addressRequest;
    }
}
