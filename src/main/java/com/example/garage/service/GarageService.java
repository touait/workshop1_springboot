package com.example.garage.service;

import com.example.garage.model.Car;
import com.example.garage.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;

    //static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
       //new Car(1, "laguna", "renault", 2004, Car.Color.BLUE),
            //new Car(2, "5008", "peugeat", 2013, Car.Color.YELLOW),
            //new Car(3, "c4", "citroen", 2006, Car.Color.RED),
           // new Car(4, "laguna", "peugeat", 2014, Car.Color.GREEN),
           // new Car(5, "c5", "peugeat", 2010, Car.Color.GREEN)
            //));
    public List<Car> getCars(){
        List<Car> cars=new ArrayList<>();
        garageRepository.findAll().forEach(car -> {
            cars.add(car);
        });
        return cars;
    }

    public Car getCar(long id) {
        return garageRepository.findById(id).orElse(null);
    }

    public void deletecar(long id) {
      garageRepository.deleteById(id);
    }

    public void addCar(Car car) {
        garageRepository.save(car);
    }

    public void updateCar(Car car, long id) {
       garageRepository.save(car);
    }
}
