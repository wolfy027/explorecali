package com.example.ec.explorecali.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.explorecali.model.TourPackage;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends PagingAndSortingRepository<TourPackage, String> {
	TourPackage findByName(String name);

	@Override
	@RestResource(exported = false)
	default <S extends TourPackage> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RestResource(exported = false)
	default <S extends TourPackage> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RestResource(exported = false)
	default void deleteById(String id) {
		// TODO Auto-generated method stub
	}

	@Override
	@RestResource(exported = false)
	default void delete(TourPackage entity) {
		// TODO Auto-generated method stub
	}

	@Override
	@RestResource(exported = false)
	default void deleteAll(Iterable<? extends TourPackage> entities) {
		// TODO Auto-generated method stub
	}

	@Override
	@RestResource(exported = false)
	default void deleteAll() {
		// TODO Auto-generated method stub
	}
}
