/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author avbravo
 */
public class ChoucairHomePageTest {

    @Test
    public void site_header_is_on_home_page() {


        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.mipagina.com");

        WebElement href = browser.findElement(By.xpath("//a[@href='/job/analista-de-pruebas-panama/']"));
        assertTrue((href.isDisplayed()));

        browser.close();

    }
}
