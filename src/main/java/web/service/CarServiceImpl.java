package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList; // Здесь храниться ваш список машин

    {
        carList = new ArrayList<>();
        carList.add(new Car("VW", "Golf", 2000));
        carList.add(new Car("VW", "Passat", 2005));
        carList.add(new Car("VW", "Tiguan", 2010));
        carList.add(new Car("VW", "Polo", 2015));
        carList.add(new Car("VW", "Jetta", 2020));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}