package gof.design.patterns.gof.bridge.application;

import gof.design.patterns.gof.bridge.courses.*;
import gof.design.patterns.gof.bridge.cafe.Cuisine;
import gof.design.patterns.gof.bridge.cafe.CuisineFactory;
import gof.design.patterns.gof.bridge.cafe.CuisineType;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
        Printer printer = new XmlPrinter();
        Report monthlyReport = new MonthlyReport(printer);
        monthlyReport.printReport();
         */

        var americanCuisine = CuisineFactory.getCuisine(CuisineType.AMERICAN);
        var japaneseCuisine = CuisineFactory.getCuisine(CuisineType.JAPANESE);
        var ukrainianCuisine = CuisineFactory.getCuisine(CuisineType.UKRAINIAN);

        cookComboMeal(americanCuisine);
        cookComboMeal(japaneseCuisine);
        cookComboMeal(ukrainianCuisine);
    }

    private static void cookComboMeal(Cuisine cuisine) {
        List<Course> comboMeal = List.of(
                new Starter(cuisine),
                new MainCourse(cuisine),
                new ThirdCourse(cuisine),
                new Dessert(cuisine));
        comboMeal.forEach(Cookable::cook);

        System.out.println();
    }

}
