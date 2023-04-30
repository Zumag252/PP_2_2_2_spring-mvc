package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;

    private String series;

    private int yearOfManufacture;

    public Car(String model, String series, int yearOfManufacture) {
        this.model = model;
        this.series = series;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
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
