package org.example;

import com.shaft.driver.SHAFT;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        driver.quit();
    }
}