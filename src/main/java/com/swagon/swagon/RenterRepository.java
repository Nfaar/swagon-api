package com.swagon.swagon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagon.swagon.Model.Renter;

public interface RenterRepository extends JpaRepository<Renter, String> {

}
