package homework;

import homework.enums.CarAttribute;
import homework.filterinterfaces.FilterByIntegerParam;
import homework.filterinterfaces.FilterByStringParam;
import homework.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class RecommendationCreator {

    @Autowired
    private FilterByIntegerParam priceFilter;

    @Autowired
    private FilterByStringParam brandFilter;

    @Autowired
    private FilterByIntegerParam yearFilter;

    public List<Car> getCar(String filterParam, int number) {

        if (CarAttribute.BRAND.getValue() == number) {
            return applyFilter(brandFilter, filterParam);
        }

        if (CarAttribute.PRICE.getValue() == number) {
            return applyFilter(priceFilter, filterParam);
        }

        if (CarAttribute.YEAR.getValue() == number) {
            return applyFilter(yearFilter, filterParam);
        }

        return Collections.emptyList();
    }

    private List<Car> applyFilter(FilterByStringParam filter, String filterParam) {
        return filter.getCar(filterParam);
    }

    private List<Car> applyFilter(FilterByIntegerParam filter, String filterParam) {
        return filter.getCar(Integer.parseInt(filterParam));
    }
}
