/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.employee;

/**
 *
 * @author 
 */
class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Memimpin tim");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("membuat aplikasi");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Membuat desain");
    }
}

public class MainUAS02 {

    public static void main(String[] args) {
        Manager manajer = new Manager("Syahrul Izzazi");
        Developer pengembang = new Developer("Syahrul Izzazi");
        Designer desainer = new Designer("Syahrul Izzazi");

        manajer.work();
        pengembang.work();
        desainer.work();
    }
}