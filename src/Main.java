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
        return 300; // Пример потребления мощности в ваттах
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
    protected double bestTime; // лучшее время бегуна в секундах

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
        System.out.println("Sprinter is training for short distances.");
        // Логика тренировки спринтера
    }

    @Override
    public void compete() {
        System.out.println("Sprinter is competing in a sprint race.");
        // Логика соревнования спринтера
    }

    @Override
    public double getBestTime() {
        return bestTime; // возвращаем лучшее время спринтера
    }
}

// Класс MarathonRunner
class MarathonRunner extends Runner {

    public MarathonRunner(double bestTime) {
        super(bestTime);
    }

    @Override
    public void train() {
        System.out.println("Marathon runner is training for long distances.");
        // Логика тренировки марафонца
    }

    @Override
    public void compete() {
        System.out.println("Marathon runner is competing in a marathon.");
        // Логика соревнования марафонца
    }

    @Override
    public double getBestTime() {
        return bestTime; // возвращаем лучшее время марафонца
    }
}


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите режим работы:");
            System.out.println("Задача с животными:");
            System.out.println("Задача с фигурами:");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:

//Задача1/////////////////////////////////////////////////////////

                        Animal lion = new Lion();
                        Animal elephant = new Elephant();
                        lion.eat();
                        lion.sleep();
                        ((Mammal)lion).walk();
                        elephant.eat();
                        elephant.sleep();
                        ((Mammal)elephant).walk();

                    case 2:
//Задача2/////////////////////////////////////////////////////////

                        Shape triangle = new Triangle(3, 4, 5);
                        Shape rectangle = new Rectangle(5, 10);
                        Shape circle = new Circle(7);

                        System.out.println("Triangle: Площадь = " + triangle.area() + ", Периметр = " + triangle.perimeter() + ", Стороны = " + ((Polygon) triangle).numberOfSides());
                        System.out.println("Rectangle: Площадь = " + rectangle.area() + ", Периметр = " + rectangle.perimeter() + ", Стороны = " + ((Polygon) rectangle).numberOfSides());
                        System.out.println("Circle: Площадь = " + circle.area() + ", Perimeter = " + circle.perimeter());

                    case 3:

//Задача3/////////////////////////////////////////////////////////

                        ElectronicDevice tv = new TV();
                        ElectronicDevice computer = new Computer();

                        tv.turnOn();
                        System.out.println("Потребляемая мощность TV: " + tv.getPowerConsumption() + "W");
                        tv.turnOff();

                        computer.turnOn();
                        System.out.println("Потребляемая мощность компьютера: " + computer.getPowerConsumption() + "W");
                        computer.turnOff();

                    case 4:

//Задача4/////////////////////////////////////////////////////////

                        Product book = new Book("Effective Java", 29.99, 0.5);
                        Product software = new Software("IntelliJ IDEA", 149.99);

                        System.out.println("Product: " + book.getName());
                        System.out.println("Price: $" + book.getPrice());
                        System.out.println("Weight: " + ((Book) book).getWeight() + " kg");

                        System.out.println("\nProduct: " + software.getName());
                        System.out.println("Price: $" + software.getPrice());
                    case 5:

//Задача5/////////////////////////////////////////////////////////
                        Runner sprinter = new Sprinter(9.58);
                        Runner marathonRunner = new MarathonRunner(120.0);

                        sprinter.train();
                        sprinter.compete();
                        System.out.println("Best time for sprinter: " + sprinter.getBestTime() + " seconds");

                        marathonRunner.train();
                        marathonRunner.compete();
                        System.out.println("Best time for marathon runner: " + marathonRunner.getBestTime() + " minutes");

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


