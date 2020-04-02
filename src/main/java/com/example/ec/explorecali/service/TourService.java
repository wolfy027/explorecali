package com.example.ec.explorecali.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ec.explorecali.model.Difficulty;
import com.example.ec.explorecali.model.Region;
import com.example.ec.explorecali.model.Tour;
import com.example.ec.explorecali.model.TourPackage;
import com.example.ec.explorecali.repo.TourPackageRepository;
import com.example.ec.explorecali.repo.TourRepository;

@Service
public class TourService {
	private TourPackageRepository tourPackageRepository;

	private TourRepository tourRepository;

	@Autowired
	public TourService(TourPackageRepository tourPackageRepository, TourRepository tourRepository) {
		super();
		this.tourPackageRepository = tourPackageRepository;
		this.tourRepository = tourRepository;
	}

	public Tour createTour(Integer id, String title, String description, String blurb, Integer price, String duration,
			String bullets, String keywords, String tourPackageCode, Difficulty difficulty, Region region) {
		Optional<TourPackage> tourPackage = tourPackageRepository.findById(tourPackageCode);
		if (!tourPackage.isPresent()) {
			throw new RuntimeException("Tour Package does not exist:  " + tourPackageCode);
		}
		return tourRepository.save(new Tour(id, title, description, blurb, price, duration, bullets, keywords,
				tourPackage.get(), difficulty, region));
	}
	
	public Iterable<Tour> lookup() {
		return tourRepository.findAll();
	}

	public long total() {
		return tourRepository.count();
	}
}
