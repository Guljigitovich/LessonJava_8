package Java8.Device;

import Java8.Annoncement.Announcement;

public class Laptop extends Announcement {
    private String operationSystem;

    public Laptop(String name, String image, double price, String description,String operationSystem) {
        super(name, image, price, description);
        this.operationSystem=operationSystem;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" +super.toString()+
                "operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
