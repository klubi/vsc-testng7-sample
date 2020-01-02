package com.github.klubi.autintro;

import com.github.klubi.autintro.nested.HomeworkNestedBaseTest;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeworkOneTest extends HomeworkNestedBaseTest {

    @Test
    public void shouldFail(){
        assertTrue(dataSupplier.shouldFail());
    }

    @Test
    public void shouldPass() {
        assertFalse(dataSupplier.shouldPass());
    }

    @Test
    public void shouldSkip(){
        assertNull(dataSupplier.shouldSkip());
    }

    @Test
    public void shouldIgnore() {
        assertNotNull(dataSupplier.shouldIgnore());
    }

}