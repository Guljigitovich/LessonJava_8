package Java8.Transport;

import Java8.Annoncement.Announcement;

import java.time.LocalDate;

public class Car extends Announcement {
    private String colour;
    private LocalDate yearOfIssue;
    public Car(String name, String image, double price, String description,String colour,LocalDate yearOfIssue) {
        super(name, image, price, description);
        this.colour=colour;
        this.yearOfIssue=yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{"+super.toString() +
                "colour='" + colour + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
