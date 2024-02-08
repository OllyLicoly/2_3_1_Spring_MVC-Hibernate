package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars;

    public void getAllCars() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 5, "black"));
        cars.add(new Car("Audi", 8, "silver"));
        cars.add(new Car("Mercedes", 6, "red"));
        cars.add(new Car("Mazda", 3, "royal blue"));
        cars.add(new Car("Porsche", 7, "yellow"));
    }
    @Transactional
    @Override
    public List<Car> getSomeCars(int num) {
        getAllCars();
        if (num >= 5) return cars;
        return cars.subList(0, num);
    }


}
