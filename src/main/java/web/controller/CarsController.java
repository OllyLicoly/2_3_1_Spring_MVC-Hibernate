package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int num, ModelMap model) {
        model.addAttribute("cars", new CarServiceImp().getSomeCars(num));
        return "cars";
    }
}

