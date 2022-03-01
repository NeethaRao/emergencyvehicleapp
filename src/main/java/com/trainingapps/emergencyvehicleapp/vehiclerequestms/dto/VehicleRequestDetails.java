package com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.common.RequestStatus;

public class VehicleRequestDetails {
    private String pinCode;

    private String phoneNumber;

    private RequestStatus requestStatus;

    private AddressRequest addressRequest;

    public AddressRequest getAddressRequest() {
        return addressRequest;
    }

    public void setAddressRequest(AddressRequest addressRequest) {
        this.addressRequest = addressRequest;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
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
}
