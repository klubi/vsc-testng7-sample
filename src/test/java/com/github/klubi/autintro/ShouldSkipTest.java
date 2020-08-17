package com.github.klubi.autintro;

import static org.testng.Assert.fail;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = TestConfig.class)
public class ShouldSkipTest extends AbstractTestNGSpringContextTests {

  @Test
  public void shouldBeSkipped() {
    fail("Executed instead of skipping.");
  }
}
