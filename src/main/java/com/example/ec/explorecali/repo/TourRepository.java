package com.example.ec.explorecali.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.explorecali.model.Tour;

@RepositoryRestResource(collectionResourceRel = "tours", path = "tours")
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
	Page<Tour> findByTourPackageCode(String code, Pageable pageable);

//	@Override
//	@RestResource(exported = false)
//	default <S extends Tour> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@RestResource(exported = false)
//	default <S extends Tour> Iterable<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@RestResource(exported = false)
//	default void deleteById(Integer id) {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	@RestResource(exported = false)
//	default void delete(Tour entity) {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	@RestResource(exported = false)
//	default void deleteAll(Iterable<? extends Tour> entities) {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	@RestResource(exported = false)
//	default void deleteAll() {
//		// TODO Auto-generated method stub
//	}
}
