package com.performance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceManagerTest {

    @Test
    public void testCalculateTotal() {

        PerformanceManager manager =
                new PerformanceManager();

        StudentPerformance student =
                new StudentPerformance(
                        101,
                        "Arun",
                        85,
                        78,
                        92
                );

        assertEquals(
                255,
                manager.calculateTotal(student),
                0.01
        );
    }

    @Test
    public void testCalculateAverage() {

        PerformanceManager manager =
                new PerformanceManager();

        StudentPerformance student =
                new StudentPerformance(
                        101,
                        "Arun",
                        85,
                        78,
                        92
                );

        assertEquals(
                85,
                manager.calculateAverage(student),
                0.01
        );
    }

    @Test
    public void testCalculateGrade() {

        PerformanceManager manager =
                new PerformanceManager();

        StudentPerformance student =
                new StudentPerformance(
                        101,
                        "Arun",
                        85,
                        78,
                        92
                );

        assertEquals(
                "A",
                manager.calculateGrade(student)
        );
    }

    @Test
    public void testFailGrade() {

        PerformanceManager manager =
                new PerformanceManager();

        StudentPerformance student =
                new StudentPerformance(
                        102,
                        "Bala",
                        40,
                        35,
                        42
                );

        assertEquals(
                "F",
                manager.calculateGrade(student)
        );
    }
}