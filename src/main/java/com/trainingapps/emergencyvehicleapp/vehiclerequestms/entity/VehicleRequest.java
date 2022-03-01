package com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.common.RequestStatus;
import javax.persistence.*;

@Table(name="vehiclerequest_date")
@Entity
public class VehicleRequest {
    @GeneratedValue
    @Id
    private Long id;

    @JoinColumn(name="house_address_id")
    @OneToOne(cascade = CascadeType.ALL)
    private HouseAddress houseAddress;

    private String pinCode;

    private String phoneNumber;

    private RequestStatus requestStatus;

    public HouseAddress getHouseAddress() {
        return houseAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HouseAddress getAddress() {
        return houseAddress;
    }

    public void setAddress(HouseAddress houseAddress) {
        this.houseAddress = houseAddress;
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
