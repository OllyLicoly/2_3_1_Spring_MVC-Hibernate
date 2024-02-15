//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import web.dao.CarDao;
//import web.dao.CarDaoImp;
//import web.model.Car;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CarServiceImp implements CarService {
//
//    @Autowired
//    private CarDao carDao = new CarDaoImp();
//
//    @Transactional
//    @Override
//    public List<Car> getNone() {
//        return new ArrayList<>();
//    }
//
//
//    @Transactional
//    @Override
//    public List<Car> getCars(int count) {
//        if (count >= 5) {
//            return carDao.getAllCars();
//        }
//        return carDao.getSomeCars(count);
//    }
//
//}
