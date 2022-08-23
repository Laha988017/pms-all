package com.cognizant.pms.processpension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.pms.processpension.model.Pensioner;


@Repository
public interface PensionerRepository extends JpaRepository<Pensioner, String>{

}
