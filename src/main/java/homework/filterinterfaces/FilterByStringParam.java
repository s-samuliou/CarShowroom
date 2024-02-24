package homework.filterinterfaces;

import homework.model.Car;

import java.util.List;

public interface FilterByStringParam {
    List<Car> getCar(String filterParam);
}
