package com.trainingapps.emergencyvehicleapp.vehiclerequestms.repository;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehicleRequestRepository extends JpaRepository<VehicleRequest, Long> {
}
