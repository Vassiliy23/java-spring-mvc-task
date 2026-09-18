package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;


    public CarServiceImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "Black", 2022));
        cars.add(new Car("Audi", "Green", 2016));
        cars.add(new Car("Toyota", "Orange", 1995));
        cars.add(new Car("Honda", "Gray", 2000));
        cars.add(new Car("Lada", "White", 2020));
    }


    @Override
    public List<Car> getCars(int carsCount) {
        int count = carsCount > cars.size() ? cars.size() :carsCount;
        return cars.subList(0, count);
    }
}
