package com.github.klubi.autintro;

import java.security.SecureRandom;
import java.util.Random;

public class AssertionDataSupplier {

    /**
     * Method to be used with HomeworkOneTest.shouldFail() method.
     * @return always true
     */
    public boolean shouldFail() {
        return true;
    }

    /**
     * Method to be used with HomeworkOneTest.shouldPass() method.
     * @return always false
     */
	public boolean shouldPass() {
		return false;
	}

    /**
     * Method to be used with HomeworkOneTest.shouldSkip() method.
     * @return always null
     */
	public Boolean shouldSkip() {
		return null;
	}

    /**
     * Method to be used with HomeworkOneTest.shouldIgnore() method.
     * @return always false
     */
	public boolean shouldIgnore() {
		return false;
	}

    /**
     * Method to be used with HomeworkOneTest.testOne() method.
     * @return always integer 1
     */
	public int testOne() {
		return 1;
	}

    /**
     * Method to be used with HomeworkOneTest.testTwo() method.
     * @return always integer 1
     */
    public int testTwo(){
        return 1;
    }

    /**
     * Method to be used with HomeworkOneTest.testThree() method.
     * @return random number in range <0, 15>
     */
    public int testThree(){
        Random random = new SecureRandom();
        return random.nextInt(16);
    }

    /**
     * Method to be used with HomeworkOneTest.testFour() method.
     * @return random number in range <20, 40>
     */
    public int testFour(){
        Random random = new SecureRandom();
        return random.ints(20,41).findAny().getAsInt();
    }
}