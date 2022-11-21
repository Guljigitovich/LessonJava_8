package Java8.Annoncement;

public class Announcement {
    private String name;
    private String image;
    private double price;
    private String description;

    public Announcement(String name, String image, double price, String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
    }public Announcement (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
