package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

//    @Transactional(readOnly = true)
//    @Override
//    public List<Car> getAllCars() { return carDao.getAllCars();
//    }
//    @Transactional
//    @Override
//    public List<Car> getSomeCars(int num) {
//        return carDao.getAllCars().subList(0, num);
//    }

//    @Transactional
//    @Override
//    public List<Car> getCars(int num) {
//        if (num >= 5) {
//            return carDao.getAllCars();
//        }
//        return carDao.getAllCars().subList(0, num);
//    }
//
//    @Transactional
//    @Override
//    public List<Car> getNone() {
//        return new ArrayList<>();
//    }


//    public List<Car> getSomeCarsOrNon(int num) {
//        return carDao.getAllCars().subList(0, num)
//                .orElse(new Person(-1L, "anon", "anon", "anon"));
//    }

    @Transactional
    @Override
    public List<Car> getSomeCars(int num) {
        carDao.getAllCars();
        if (num >= 5) return carDao.getAllCars();
        return carDao.getAllCars().subList(0, num);
    }


}
