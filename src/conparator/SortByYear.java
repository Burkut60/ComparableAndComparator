package conparator;

import java.util.Comparator;

public class SortByYear implements Comparator<CarComparator> {

    @Override
    public int compare(CarComparator car1, CarComparator car2) {

        if (car1.getYear() < car2.getYear()) {
            return -1;
        }

        if (car1.getYear() == car2.getYear()) {
            return 0;
        }

        return 1;
    }
}
