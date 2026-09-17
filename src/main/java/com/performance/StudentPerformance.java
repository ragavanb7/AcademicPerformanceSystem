package com.performance;

public class StudentPerformance {

    private int id;
    private String name;
    private double maths;
    private double physics;
    private double computer;

    public StudentPerformance(int id, String name,
                              double maths,
                              double physics,
                              double computer) {

        this.id = id;
        this.name = name;
        this.maths = maths;
        this.physics = physics;
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMaths() {
        return maths;
    }

    public double getPhysics() {
        return physics;
    }

    public double getComputer() {
        return computer;
    }
}