/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author avbravo
 */
public class HomePage {
   private WebDriver driver;

   //Page URL
   private static String PAGE_URL="https://www.choucairtesting.com/";

   //Locators

   //Apply as Developer Button
   @FindBy(how = How.LINK_TEXT, using = "Empleos")
   private WebElement empleosButton;

   //Constructor
   public HomePage(WebDriver driver){
       this.driver=driver;
       driver.get(PAGE_URL);
       //Initialise Elements
       PageFactory.initElements(driver, this);
   }

   public void clickOnDeveloperApplyButton(){

       empleosButton.click();

   }
 
}
