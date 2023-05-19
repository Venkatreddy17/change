import java.util.Scanner;

import models.Car;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 

        Car[] cars=new Car[]{
            new Car("  ",-5000),
            new Car("  ",1200),
        };
        cars[1].setMake("  ");
        cars[1].setPrice(-8500);
    }
    
}
