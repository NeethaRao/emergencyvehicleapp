package com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.common.RequestStatus;

public class ChangeStatus {
    private long id;
    private RequestStatus requestStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}
