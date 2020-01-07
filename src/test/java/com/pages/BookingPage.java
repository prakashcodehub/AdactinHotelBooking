package com.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Helper;

public class BookingPage extends Helper{
	public  BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private List<WebElement> firstName;
	@FindBy(id="last_name")
	private List<WebElement>  lastName;
	@FindBy(id="address")
	private List<WebElement>  address;
	@FindBy(id="cc_num")
	private List<WebElement>  creditCardNum;
	@FindBy(id="cc_type")
	private List<WebElement>  creditCardType;
	@FindBy(id="cc_exp_month")
	private List<WebElement>  selectExpiryMonth;
	@FindBy(id="cc_exp_year")
	private List<WebElement>  selectExpiryYear;
	@FindBy(id="cc_cvv")
	private List<WebElement>  cvvNum;
	@FindBy(id="book_now")
	private List<WebElement>  booknow;
	public List<WebElement>  getFirstName() {
		return firstName;
	}
	public List<WebElement>  getLastName() {
		return lastName;
	}
	public List<WebElement>  getAddress() {
		return address;
	}
	public List<WebElement>  getCreditCardNum() {
		return creditCardNum;
	}
	public List<WebElement>  getCreditCardType() {
		return creditCardType;
	}
	public List<WebElement> getSelectExpiryMonth() {
		return selectExpiryMonth;
	}
	public List<WebElement>  getSelectExpiryYear() {
		return selectExpiryYear;
	}
	public List<WebElement>  getCvvNum() {
		return cvvNum;
	}
	public List<WebElement>  getBooknow() {
		return booknow;
	}
	
	
	
	
}
