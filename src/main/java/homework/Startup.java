package homework;

import homework.model.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Startup {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        RecommendationCreator creator = context.getBean("recommendationCreator", RecommendationCreator.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print input filter type (1-brand, 2-price, 3-year)");
        int type = scanner.nextInt();

        System.out.println("Input value: ");
        String filter = new Scanner(System.in).nextLine();

        List<Car> cars = creator.getCar(filter, type);
        System.out.println("Cars list by filter");
        cars.forEach(System.out::println);

        context.close();
    }
}
