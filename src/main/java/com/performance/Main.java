package com.performance;

public class Main {

    public static void main(String[] args) {

        PerformanceManager manager =
                new PerformanceManager();

        StudentPerformance student1 =
                new StudentPerformance(
                        101,
                        "Arun",
                        85,
                        78,
                        92
                );

        StudentPerformance student2 =
                new StudentPerformance(
                        102,
                        "Bala",
                        72,
                        68,
                        75
                );

        StudentPerformance student3 =
                new StudentPerformance(
                        103,
                        "Charan",
                        95,
                        91,
                        89
                );

        System.out.println("Academic Performance System");
        System.out.println("===========================");

        manager.displayPerformance(student1);
        manager.displayPerformance(student2);
        manager.displayPerformance(student3);
    }
}