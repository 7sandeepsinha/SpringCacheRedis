package dev.sandeep.SpringRedisCache.service;

import dev.sandeep.SpringRedisCache.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CarService {
    Car getCar(int id);
    List<Car> getAllCars();
    Car saveCar(Car car);
}
