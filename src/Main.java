import java.util.Scanner;


//Задача1/////////////////////////////////////////////////////////

interface Animal{
    void eat();
    void sleep();
}

abstract class Mammal implements Animal{
    public abstract void walk();
}

class Lion extends Mammal{
    @Override
    public void eat(){
        System.out.println("Lion eats meat");
    }
    @Override
    public void sleep(){
        System.out.println("Lion sleeps");
    }
    @Override
    public void walk(){
        System.out.println("Lion walks");
    }
}

class Elephant extends Mammal{
    @Override
    public void eat(){
        System.out.println("Elephant eats grass");
    }
    @Override
    public void sleep(){
        System.out.println("Elephant sleeps");
    }
    @Override
    public void walk(){
        System.out.println("Elephant walks");
    }
}


//Задача2/////////////////////////////////////////////////////////



interface Shape{
    double area();
    double perimeter();
}

abstract class Polygon implements Shape{
    public abstract int numberOfSides();
}

class Triangle extends Polygon {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}

class Rectangle extends Polygon {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

//Задача3/////////////////////////////////////////////////////////

interface Device {
    void turnOn();
    void turnOff();
}

abstract class ElectronicDevice implements Device {
    public abstract int getPowerConsumption();
}

class TV extends ElectronicDevice {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("TV ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("TV OFF");
    }

    @Override
    public int getPowerConsumption() {
        return 150;
    }
}

class Computer extends ElectronicDevice {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Компьютер ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Компьютер OFF");
    }

    @Override
    public int getPowerConsumption() {
        return 300; 
    }
}

//Задача4/////////////////////////////////////////////////////////

interface Product {
    double getPrice();
    String getName();
}

abstract class PhysicalProduct implements Product {
    public abstract double getWeight();
}

class Book extends PhysicalProduct {
    private String name;
    private double price;
    private double weight;

    public Book(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

class Software implements Product {
    private String name;
    private double price;

    public Software(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}

//Задача5/////////////////////////////////////////////////////////

interface Athlete {
    void train();
    void compete();
}

abstract class Runner implements Athlete {
    protected double bestTime; 

    public Runner(double bestTime) {
        this.bestTime = bestTime;
    }

    public abstract double getBestTime();
}
class Sprinter extends Runner {

    public Sprinter(double bestTime) {
        super(bestTime);
    }

    @Override
    public void train() {
        System.out.println("Спринтер тренируется");
    }

    @Override
    public void compete() {
        System.out.println("Спринтер соревнуется");
    }

    @Override
    public double getBestTime() {
        return bestTime; 
    }
}

class MarathonRunner extends Runner {

    public MarathonRunner(double bestTime) {
        super(bestTime);
    }

    @Override
    public void train() {
        System.out.println("Марафонец тренируется");
    }

    @Override
    public void compete() {
        System.out.println("Марафонец соревнуется");
     
    }

    @Override
    public double getBestTime() {
        return bestTime; 
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите режим работы:");
            System.out.println("1: Задача с животными");
            System.out.println("2: Задача с фигурами:");
            System.out.println("3: Задача с устройствами:");
            System.out.println("4: Задача с магазином:");
            System.out.println("5: Задача со спортсменами:");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {                   

//Задача1/////////////////////////////////////////////////////////
                 case 1:
                        Animal lion = new Lion();
                        Animal elephant = new Elephant();
                        lion.eat();
                        lion.sleep();
                        ((Mammal)lion).walk();
                        elephant.eat();
                        elephant.sleep();
                        ((Mammal)elephant).walk();

                  
//Задача2/////////////////////////////////////////////////////////
                  case 2:
                        
                        Shape triangle = new Triangle(3, 4, 5);
                        Shape rectangle = new Rectangle(5, 10);
                        Shape circle = new Circle(5);
                        
                        System.out.println("Triangle: Площадь = " + triangle.area() + ", Периметр = " + triangle.perimeter() + ", Стороны = " + ((Polygon) triangle).numberOfSides());
                        System.out.println("Rectangle: Площадь = " + rectangle.area() + ", Периметр = " + rectangle.perimeter() + ", Стороны = " + ((Polygon) rectangle).numberOfSides());
                        System.out.println("Circle: Площадь = " + circle.area() + ", Perimeter = " + circle.perimeter());
                   

//Задача3/////////////////////////////////////////////////////////
                 case 3:
                        ElectronicDevice tv = new TV();
                        ElectronicDevice computer = new Computer();

                        tv.turnOn();
                        System.out.println("Потребляемая мощность TV: " + tv.getPowerConsumption() + "W");
                        tv.turnOff();

                        computer.turnOn();
                        System.out.println("Потребляемая мощность компьютера: " + computer.getPowerConsumption() + "W");
                        computer.turnOff();                   

//Задача4/////////////////////////////////////////////////////////
                     case 4:
                        
                        Product book = new Book("Борис Годунов", 400, 0.35);
                        Product software = new Software("Благословение небожителей", 220);

                        System.out.println("Product: " + book.getName());
                        System.out.println("Price: $" + book.getPrice());
                        System.out.println("Weight: " + ((Book) book).getWeight() + " кг");

                        System.out.println("\nProduct: " + software.getName());
                        System.out.println("Price: $" + software.getPrice());                    

//Задача5/////////////////////////////////////////////////////////
                    case 5:
                        
                        Runner sprinter = new Sprinter(13);
                        Runner marathonRunner = new MarathonRunner(60.0);

                        sprinter.train();
                        sprinter.compete();
                        System.out.println("Лучшее время спринтера: " + sprinter.getBestTime() + " секунд");

                        marathonRunner.train();
                        marathonRunner.compete();
                        System.out.println("Лучшее время марафонца: " + marathonRunner.getBestTime() + " минут");

                    case 0:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                        scanner.next();



                }

            }

            else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.next();
            }
        }
    }
}


