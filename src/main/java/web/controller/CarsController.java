package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        int carsToShow = (count > 0 ? (count < 5 ? count : 5) : 0);
        List<Car> listShowingCars = Car.getCars().subList(0, carsToShow);
        model.addAttribute("carsList", listShowingCars);
        return "cars";
    }
}
