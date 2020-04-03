package com.example.ec.explorecali.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.ec.explorecali.model.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
	TourPackage findByName(String name);
}
