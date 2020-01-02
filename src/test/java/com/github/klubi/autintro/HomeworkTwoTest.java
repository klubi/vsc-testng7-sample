package com.github.klubi.autintro;

import com.github.klubi.autintro.nested.HomeworkNestedBaseTest;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeworkTwoTest extends HomeworkNestedBaseTest {

    @Test
    public void testOne(){
        assertEquals(dataSupplier.testOne(), 1);
    }

    @Test
    public void testTwo() {
        assertNotEquals(dataSupplier.testTwo(), 2);
    }

    @Test
    public void testThree(){
        var number = dataSupplier.testThree();
        assertTrue(0 < number && number < 15);
    }

    @Test
    public void testFour() {
        var number = dataSupplier.testFour();
        assertTrue(15 < number && number < 40);
    }
}