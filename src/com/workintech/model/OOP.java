package com.workintech.model;

public class OOP {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe",15);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println(person);

        Person person1 = new Person("Ali", "Veli", 30);
        person1.salary= 40000;
        System.out.println(person1);

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());

        Wall wall1= new Wall(3,2);
        wall1.setWidth(4);
        wall1.setHeight(3);
        System.out.println(wall1.getArea());
        System.out.println(wall1.getWidth() * wall1.getHeight());
        wall1.width = -3;
        System.out.println(wall1.getArea());
    }
}
