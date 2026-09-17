package com.performance;

public class PerformanceManager {

    public double calculateTotal(StudentPerformance student) {

        return student.getMaths()
                + student.getPhysics()
                + student.getComputer();
    }

    public double calculateAverage(StudentPerformance student) {

        return calculateTotal(student) / 3;
    }

    public String calculateGrade(StudentPerformance student) {

        double average = calculateAverage(student);

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayPerformance(StudentPerformance student) {

        double total = calculateTotal(student);
        double average = calculateAverage(student);
        String grade = calculateGrade(student);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Maths: " + student.getMaths());
        System.out.println("Physics: " + student.getPhysics());
        System.out.println("Computer: " + student.getComputer());
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}