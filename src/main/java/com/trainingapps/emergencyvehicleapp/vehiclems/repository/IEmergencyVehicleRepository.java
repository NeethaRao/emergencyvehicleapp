package com.trainingapps.emergencyvehicleapp.vehiclems.repository;

import com.trainingapps.emergencyvehicleapp.vehiclems.entity.EmergencyVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEmergencyVehicleRepository extends JpaRepository<EmergencyVehicle, Long> {
    @Query(value = "select * from emergencyvehicle_data where vehicle_number=?1", nativeQuery = true)
    EmergencyVehicle findVehicleDetailsByVehicleNumber(String vehicleNumber);
}
