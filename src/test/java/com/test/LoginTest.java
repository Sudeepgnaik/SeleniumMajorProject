package com.test;

import com.pages.DashboardPage;
import com.pages.DeleteUserPage;
import com.pages.EditUserPage;
import com.pages.LoginPage;
import com.pages.LogoutPage;
import com.pages.Search;

import org.testng.annotations.Test;

import com.pages.Admin;

public class LoginTest extends BaseTest{
	 @Test
	    public void testValidLogin() throws InterruptedException {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("Admin", "admin123");
//	        loginPage.login("Sudeep", "@123");
	       
//	        DashboardPage dashboardPage = new DashboardPage(driver);
//	        LogoutPage logoutPage = new LogoutPage(driver);
//	        logoutPage.logout();
//	        Thread.sleep(5000);
//Admin myinfo=new Admin(driver);
//myinfo.info();
	        Admin adminPage = new Admin(driver);
	        adminPage.openAdmin();
	        adminPage.clickAdd();
	        String employeeName = "Thomas Kutty Benny";
	        String username = "Mrsudeep000";
	        String password = "Jellyfish@123";
	        String confirmPassword = "Jellyfish@123";
	        adminPage.fillUserDetails(
	        		employeeName, username,password,confirmPassword 
	        );
	        Thread.sleep(5000);
	        adminPage.saveUser();
	        
	        Search search= new Search(driver); 
	        search.searchUser(username, "Admin", "Enabled");
	 
	        Thread.sleep(2000);
	 // "Ravi M B", "Sudeepnaik12", "Naik@123456786543", "Naik@123456786543"
	     
	                

	                EditUserPage editPage = new EditUserPage(driver);

	                editPage.editUserStatus("Disabled");
	         
	                 
	         
	                

//	                Search.searchUser(username, "Admin", "Disabled");
	                search.searchUser(username, "Admin", "Disabled");
	         
	                

	                DeleteUserPage deletePage = new DeleteUserPage(driver);

	                deletePage.deleteUser();
	         
	                 
	         
	                

	                LogoutPage logoutPage = new LogoutPage(driver);

	                logoutPage.logout();

	            }

	        

	          
	    
	    }

	
