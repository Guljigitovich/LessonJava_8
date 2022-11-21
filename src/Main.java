import Java8.Annoncement.Announcement;
import Java8.Device.Laptop;
import Java8.Device.Phone;
import Java8.Home.Home;
import Java8.Transport.Airplane;
import Java8.Transport.Car;
import Java8.Transport.Helicopter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Phone phone1 = new Phone("Iphone", "\uD83D\uDE0E", 147000, "Amazing phone", "14 PRO Max", 256);
        Phone phone2 = new Phone("Samsung", "\uD83E\uDD29", 5000, "Great phone", "S21", 128);
        Phone[] phones = {phone1, phone2};

        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D", 129000, "Wonderful laptop", "Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16", 6500, "Productive laptop", "Windows");
        Laptop[] laptops = {laptop1, laptop2};

        Home home1 = new Home("Ihlas", "\uD83C\uDFE2", 35000, "Great Home", "Multi-storey", 10);
        Home home2 = new Home("Chaos", "\uD83C\uDFE0", 150000, "Amazing Home", "House", 25);
        Home[] homes = {home1, home2};

        Car car1 = new Car("Mercedes-Benz", "\uD83D\uDE98", 7400, "Wonderful Car", "Black", LocalDate.of(2010, 3, 6));
        Car car2 = new Car("BMW", "\uD83D\uDE99", 120000, "Fast Car", "Purple", LocalDate.of(2020, 8, 28));
        Car[] cars = {car1, car2};

        Airplane airplane1 = new Airplane("Supermarine Spitfire", "\uD83D\uDEE9", 125000, "Fast Airplane", "White", LocalDate.of(2015, 1, 14));
        Airplane airplane2 = new Airplane("Airbus A320", "✈️", 6000, "Large Airplane", "Blue", LocalDate.of(2004, 11, 16));
        Airplane[] airplanes = {airplane1, airplane2};

        Helicopter helicopter1 = new Helicopter("MD 500 Defender", "\uD83D\uDE81", 13500, "Fast Helicopter", "Brown", LocalDate.of(2012, 12, 23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache", "\uD83D\uDE81", 7000, "Large Helicopter", "Red", LocalDate.of(1999, 7, 9));
        Helicopter[] helicopters = {helicopter1, helicopter2};

        Announcement[] announcements={phone1,phone2,car1,car2,laptop1,laptop2,airplane1,airplane2,helicopter1,helicopter2
                ,home1,home2};


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        switch (number){
            case 1:
                findByPrice(5000,announcements);
                break;
            case 2:
                sortPrice(announcements);
                break;
            case 3:
                getSearch(scanner.nextLine(), phones,laptops,homes,cars,airplanes,helicopters);
            case 4:
                maxMinPrice(announcements);
        }


    }
public static void findByPrice(double price, Phone[]phones, Laptop[]laptops, Home[]homes, Car[]cars, Airplane[]airplanes,
                                    Helicopter[]helicopters){
        for (Phone phone:phones) {
            if(phone.getPrice()==price){
                System.out.println(phone);
            }
        }
        for (Laptop laptop:laptops) {
            if(laptop.getPrice()==price){
                System.out.println(laptop);
            }
        }
        for (Home home:homes) {
            if(home.getPrice()==price){
                System.out.println(home);
            }
        }
        for (Car car:cars) {
            if(car.getPrice()==price){
                System.out.println(car);
            }
        }
        for (Airplane airplane:airplanes) {
            if(airplane.getPrice()==price){
                System.out.println(airplane);
            }
        }
        for (Helicopter helicopter:helicopters) {
          if(helicopter.getPrice()==price){
              System.out.println(helicopter);
          }
        }
    }public static void findByPrice(double price, Announcement[] announcements){
        for (Announcement announcement1 : announcements) {
            if(announcement1.getPrice()==price){
                System.out.println(announcement1);
            }
        }
    }public static void sortPrice (Announcement [] announcements){
        double[] array = new double[announcements.length];
        int index = 0;
        for (Announcement announcement:announcements) {
            array[index] = announcement.getPrice();
            index++;

        }
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < announcements.length; i1++) {
                if (array[i] == announcements[i1].getPrice()){
                    System.out.println(announcements[i1]);
                }
            }

        }
    }public static void getSearch(String world, Phone[]phones, Laptop[]laptops, Home[]homes, Car[]cars, Airplane[]airplanes,
                                  Helicopter[]helicopters){
        for (Phone phone:phones) {
            if(world.equals("Description phone")){
                System.out.println(phone.getDescription()+" "+phone.getName());
            }
        }
        for (Laptop laptop:laptops) {
            if(world.equals("Description laptop")){
                System.out.println(laptop.getDescription()+" "+laptop.getName());
            }
        }
        for (Home home:homes) {
            if(world.equals("Description home")){
                System.out.println(home.getDescription()+" "+home.getName());
            }
        }
        for (Car car:cars) {
            if(world.equals("Description car")){
                System.out.println(car.getDescription()+" "+car.getName());
            }
        }
        for (Airplane airplane:airplanes) {
            if(world.equals("Description airplane")){
                System.out.println(airplane.getDescription()+" "+airplane.getName());
            }
        }
        for (Helicopter helicopter:helicopters) {
            if(world.equals("Description helicopter")){
                System.out.println(helicopter.getDescription()+" "+helicopter.getName());
            }
        }
    }public static  void maxMinPrice(Announcement [] announcements){
        double max = announcements [0].getPrice();
        double min = announcements [0].getPrice();
        for (Announcement announcement:announcements) {
          max = Math.max(max,announcement.getPrice());
          min = Math.min(min,announcement.getPrice());
        }
        System.out.println(max);
        System.out.println(min);
        for (Announcement announcement:announcements) {
            if(announcement.getPrice()==max){
                System.out.println(announcement.toString());
            } else if (announcement.getPrice()==min) {
                System.out.println(announcement.toString());
            }
        }
    }
}