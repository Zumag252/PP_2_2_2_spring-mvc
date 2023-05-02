package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsServiceImpl implements CarsService {

    private List<Car> carsList = getCars();

    @Override
    public List<Car> getCarsByCount(int count) {
        int carsToShow = (count > 0 ? (count < 5 ? count : 5) : 0);
        return carsList.subList(0, carsToShow);
    }

    public static List<Car> getCars() {
        List<Car> result = new ArrayList<>();
        result.add(new Car("BMW", "X5", 2010));
        result.add(new Car("Mitsubishi", "Pajero", 2008));
        result.add(new Car("Ford", "Focus", 2000));
        result.add(new Car("Kia", "Rio", 2003));
        result.add(new Car("Skoda", "Octavia", 2020));
        return result;
    }
}
