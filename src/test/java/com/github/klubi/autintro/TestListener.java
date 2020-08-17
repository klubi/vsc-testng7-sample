package com.github.klubi.autintro;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.SkipException;

public class TestListener implements IInvokedMethodListener {

  @Override
  public void beforeInvocation(final IInvokedMethod methodToBeInvoked, final ITestResult testResult) {
    System.out.println("Invoking TestListener before ".concat(methodToBeInvoked.getTestMethod().getMethodName()));
    throw new SkipException("Skipping");
  }
}
