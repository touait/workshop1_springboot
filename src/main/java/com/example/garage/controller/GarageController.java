package com.example.garage.controller;


import com.example.garage.model.Car;
import com.example.garage.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;
    @RequestMapping("/cars")
   public List<Car> getCar(){
        return garageService.getCars();
   }

   @RequestMapping("/car/{id}")
   public Car getCar(@PathVariable long id){
        return garageService.getCar(id);
    }

    @RequestMapping(method= RequestMethod.DELETE , value="/car/{id}")
    public void deleteCar(@PathVariable long id){
        garageService.deletecar(id);
    }

   @RequestMapping(method=RequestMethod.POST , value="/cars")
    public void addCar(@RequestBody Car car){
        garageService.addCar(car);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/car/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable long id){
        garageService.updateCar(car , id);
    }
}
