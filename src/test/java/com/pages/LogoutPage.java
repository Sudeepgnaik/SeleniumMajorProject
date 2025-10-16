package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	  WebDriver driver;

	    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")  
	    WebElement userMenu;

	    @FindBy(xpath = "//a[contains(text(),'Logout')]")  
	    WebElement logoutLink;

	    public LogoutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void logout() {
	        
	        userMenu.click();

	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));

}
}
