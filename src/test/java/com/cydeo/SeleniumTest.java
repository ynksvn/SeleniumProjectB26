package com.cydeo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1- Setting up the web driver manager
       // WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yankı Sevin\\Desktop\\Selenium/chromedriver.exe");

        //2- Create instance of chrome webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");


    }
}
