import comporable.CarComparable;
import conparator.CarComparator;
import conparator.SortByModel;
import conparator.SortByYear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarComparable> listCar = new ArrayList<>();
        listCar.add(new CarComparable("vw", 1990));
        listCar.add(new CarComparable("re", 2020));
        listCar.add(new CarComparable("volvo", 1850));
        listCar.add(new CarComparable("mers", 2002));
        listCar.add(new CarComparable("lada", 2015));

        List<CarComparator> listCar1 = new ArrayList<>();
        listCar1.add(new CarComparator("vw", 1990));
        listCar1.add(new CarComparator("re", 2020));
        listCar1.add(new CarComparator("volvo", 1850));
        listCar1.add(new CarComparator("mers", 2002));
        listCar1.add(new CarComparator("lada", 2015));

       // Collections.sort(listCar1, new SortByYear());
        Collections.sort(listCar);
        Collections.sort(listCar1, new SortByModel());

        for (CarComparator carComparator : listCar1) {
            System.out.println(carComparator.getMadel() + "  " + carComparator.getYear());
        }

        System.out.println(" \n");

        for (CarComparable car : listCar) {
            System.out.println(car.getMadel() + "  " + car.getYear());
        }
    }
}
