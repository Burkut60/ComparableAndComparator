package conparator;

public class CarComparator {
    private String madel;
    private int year;

    public CarComparator(String madel, int year) {
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
}
