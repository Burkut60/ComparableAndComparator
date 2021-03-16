package conparator;

import java.util.Comparator;

public class SortByModel implements Comparator<CarComparator> {
    @Override
    public int compare(CarComparator car1, CarComparator car2) {

        return car1.getMadel().compareTo(car2.getMadel());
    }
}
