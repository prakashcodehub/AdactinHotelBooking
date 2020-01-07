package com.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Helper;

public class LoginPage extends Helper {
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private List<WebElement>  userName;
	@FindBy(id="password")
	private List<WebElement>  password;

	public List<WebElement>  getUserName() {
		return userName;
	}

	public List<WebElement>  getPassword() {
		return password;
	}

	public List<WebElement>  getLogIn() {
		return logIn;
	}
	@FindBy(id="login")
	private List<WebElement>  logIn;
}
