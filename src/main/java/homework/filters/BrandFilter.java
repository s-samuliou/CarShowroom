package homework.filters;

import homework.model.Car;
import homework.CarStorage;
import homework.enums.CarAttribute;
import homework.filterinterfaces.FilterByStringParam;
import homework.filterinterfaces.Filterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class BrandFilter implements FilterByStringParam, Filterable {

    @Autowired
    private CarStorage storage;

    @Override
    public List<Car> getCar(String filterParam) {
        List<Car> cars = new ArrayList<>();
        Map<String, Car> storage = this.storage.getStorage();

        storage.forEach((s, car) -> {
            if (car.getBrand().equalsIgnoreCase(filterParam)) {
                cars.add(car);
            }
        });

        return cars;
    }

    @Override
    public boolean canFilter(CarAttribute type) {
        return type == CarAttribute.BRAND;
    }
}
