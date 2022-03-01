package com.trainingapps.emergencyvehicleapp.vehiclerequestms.repository;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.HouseAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHouseAddressRepository extends JpaRepository<HouseAddress, Long> {
}
