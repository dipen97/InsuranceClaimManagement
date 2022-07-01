package com.hexaware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim,Long> 
{

}
 