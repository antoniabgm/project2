package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConeTest {

    /* what i asked copilot :
    can you write a unit test for Cone class
    utilizing junit5. also add multiple test
    cases for each method to include common edge cases.*/

    private Cone cone;

    @BeforeEach
    public void setUp() {
        cone = new Cone(3.0, 4.0);
    }

    @Test
    public void testGetRadius() {
        assertEquals(3.0, cone.getRadius());
    }

    @Test
    public void testSetRadius() {
        cone.setRadius(5.0);
        assertEquals(5.0, cone.getRadius());
    }

    @Test
    public void testGetHeight() {
        assertEquals(4.0, cone.getHeight());
    }

    @Test
    public void testSetHeight() {
        cone.setHeight(6.0);
        assertEquals(6.0, cone.getHeight());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(75.39822368615503, cone.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(37.69911184307752, cone.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Cone {radius = 3.0, height = 4.0, surface area = 75.39822368615503, volume = 37.69911184307752}";
        assertEquals(expected, cone.toString());
    }

}