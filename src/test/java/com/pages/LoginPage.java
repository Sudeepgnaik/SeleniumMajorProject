package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;

	   
	    @FindBy(name = "username")
	    private WebElement usernameField;

	    @FindBy(name = "password")
	    private WebElement passwordField;

	    @FindBy(css = "button[type='submit']")
	    private WebElement loginButton;

	    @FindBy(css = ".oxd-alert-content-text")
	    private WebElement loginErrorMessage;

	   
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	   
	    public void login(String username, String password) {
	        usernameField.clear();
	        usernameField.sendKeys(username);
	        passwordField.clear();
	        passwordField.sendKeys(password);
	        loginButton.click();
	    }

	   
	    public String getLoginErrorText() {
	        try {
	            return loginErrorMessage.getText();
	        } catch (Exception e) {
	            return null; 
	        }
	    }
	}


