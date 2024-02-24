package homework;

import homework.model.Car;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CarStorage {

    private Map<String, Car> storage = new HashMap<>();

    @PostConstruct
    private void init() {
        List<Car> cars = List.of(
            new Car("Volvo", 2002, 4000),
            new Car("Audi", 2015, 13_000),
            new Car("Porsche", 2023, 170_000),
            new Car("Audi", 2016, 15_000),
            new Car("Mercedes", 2020, 27_000)
        );

        cars.forEach(car -> storage.put(car.getId(), car));
    }

    public Map<String, Car> getStorage() {
        return storage;
    }
}
