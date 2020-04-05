package com.example.ec.explorecali.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ec.explorecali.model.TourPackage;

public interface TourPackageRepository extends PagingAndSortingRepository<TourPackage, String> {
	TourPackage findByName(String name);


}
