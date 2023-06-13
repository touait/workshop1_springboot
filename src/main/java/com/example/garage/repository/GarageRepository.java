package com.example.garage.repository;

import com.example.garage.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car,Long> {
}
