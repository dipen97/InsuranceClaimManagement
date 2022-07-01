package com.hexaware.service;

import java.util.List;

import com.hexaware.model.Claim;


public interface ClaimService 
{
	Claim create(Claim claim);
	
	List<Claim> findAll();
	List<Claim> filterClaim(String keywords);
	List<Claim> sortingClaim();
}
