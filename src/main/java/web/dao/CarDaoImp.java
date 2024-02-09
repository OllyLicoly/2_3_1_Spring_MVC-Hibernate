package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 5, "black"));
        cars.add(new Car("Audi", 8, "silver"));
        cars.add(new Car("Mercedes", 6, "red"));
        cars.add(new Car("Mazda", 3, "royal blue"));
        cars.add(new Car("Porsche", 7, "yellow"));
    }

//    public CarDaoImp(List<Car> cars) {
//        this.cars = cars;
//    }


    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeCars(int num) {
        return cars.subList(0, num);
    }

}
