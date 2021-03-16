package comporable;

public class CarComparable implements Comparable<CarComparable> {
    private String madel;
    private int year;

    public CarComparable(String madel, int year) {
        this.madel = madel;
        this.year = year;
    }

    public String getMadel() {
        return madel;
    }

    public void setMadel(String madel) {
        this.madel = madel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(CarComparable car) {

        if (year == car.getYear()) {
            return 0;
        }

        if (year < car.getYear()) {
            return -1;
        }

        return 1;
    }
}