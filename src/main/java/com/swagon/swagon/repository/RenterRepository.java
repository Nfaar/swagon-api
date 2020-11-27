package com.swagon.swagon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagon.swagon.Model.Renter;
@Repository
public interface RenterRepository extends JpaRepository<Renter, String> {

}
