package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteUserPage {

		
		    private WebDriver driver;
		 
		    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
		    private WebElement deleteIcon;
		 
		    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
		    private WebElement confirmDeleteButton;
		 
		    public DeleteUserPage(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }
		 
		    public void deleteUser() {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
		        wait.until(ExpectedConditions.elementToBeClickable(deleteIcon)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
		    }
		}

		 
		 



