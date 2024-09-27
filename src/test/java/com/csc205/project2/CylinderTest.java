package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    private Cylinder cylinder;

    @BeforeEach
    public void setUp() {
        cylinder = new Cylinder(4.0, 1.0);
    }

    @Test
    public void testGetHeight() {
        assertEquals(1.0, cylinder.getHeight());
    }

    @Test
    public void testSetHeight() {
        cylinder.setHeight(5.0);
        assertEquals(5.0, cylinder.getHeight());
    }

    @Test
    public void testGetRadius() {
        assertEquals(4.0, cylinder.getRadius());
    }

    @Test
    public void testSetRadius() {
        cylinder.setRadius(2.0);
        assertEquals(2.0, cylinder.getRadius());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(125.66370614359172, cylinder.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(50.26548245743669, cylinder.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Cylinder {radius = 4.0, height = 1.0, surface area = 125.66370614359172, volume = 50.26548245743669}";
        assertEquals(expected, cylinder.toString());
    }
}