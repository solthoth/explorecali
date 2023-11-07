package com.solthoth.explorecali.data;

import com.solthoth.explorecali.models.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface TourRepository extends PagingAndSortingRepository<Tour, Integer>, CrudRepository<Tour, Integer> {
    Page<Tour> findByTourPackageCode(String code, Pageable pageable);

    @Override
    @RestResource(exported = false)
    <S extends Tour> S save(S entity);

    @Override
    @RestResource(exported = false)
    <S extends Tour> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    Iterable<Tour> findAll();

    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Tour entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Integer> integers);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Tour> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    Iterable<Tour> findAll(Sort sort);

    @Override
    @RestResource(exported = false)
    Page<Tour> findAll(Pageable pageable);
}
