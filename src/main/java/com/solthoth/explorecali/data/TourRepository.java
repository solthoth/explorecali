package com.solthoth.explorecali.data;

import com.solthoth.explorecali.models.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}
