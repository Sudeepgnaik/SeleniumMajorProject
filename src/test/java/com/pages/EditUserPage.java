package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditUserPage {
	

		    private WebDriver driver;
		 
		    @FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
		    private WebElement editIcon;
		 
		    @FindBy(xpath = "//label[text()='Status']/following::div[1]//div[contains(@class,'oxd-select-text')]")
		    private WebElement statusDropdown;
		 
		    @FindBy(xpath = "//button[normalize-space()='Save']")
		    private WebElement saveButton;
		 
		    public EditUserPage(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }
		 
		    public void editUserStatus(String newStatus) {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(editIcon)).click();
		 
		        wait.until(ExpectedConditions.elementToBeClickable(statusDropdown)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//span[text()='" + newStatus + "']"))).click();
		 
		        saveButton.click();
		    }
		}
		 
		 



