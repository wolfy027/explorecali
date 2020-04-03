package com.example.ec.explorecali.service;

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

	public Tour createTour(String title, String description, String blurb, Integer price, String duration,
			String bullets, String keywords, String tourPackageName, Difficulty difficulty, Region region) {
		TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName);
		if (tourPackage == null) {
			throw new RuntimeException("Tour Package does not exist:  " + tourPackageName);
		}
		return tourRepository.save(new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage,
				difficulty, region));
	}

	public Iterable<Tour> lookup() {
		return tourRepository.findAll();
	}

	public long total() {
		return tourRepository.count();
	}
}
