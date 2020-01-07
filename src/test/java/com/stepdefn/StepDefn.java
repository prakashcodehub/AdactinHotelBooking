package com.stepdefn;
import org.junit.Assert;

import com.base.Helper;
import com.pages.BookingPage;
import com.pages.LoginPage;
import com.pages.OrderReciptPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import io.cucumber.java.en.*;

public class StepDefn extends Helper{
@Given("User is in adactin Login Page \\/Homepage")
public void user_is_in_adactin_Login_Page_Homepage() {
	launchChromeBrowser();
	loadUrl("http://adactin.com/HotelApp/");
   
}

@When("User has to enter the vaild {string} and {string}")
public void user_has_to_enter_the_vaild_and(String name, String pass) {
	LoginPage login =new LoginPage();
	
	sendKeyBase(login.getUserName().get(0), name);
	Assert.assertEquals("Verify User Name",name,getAtrribute(login.getUserName().get(0)));
	sendKeyBase(login.getPassword().get(0), pass);
	Assert.assertEquals("Verify User Name",pass,getAtrribute(login.getPassword().get(0)));
	btnClick(login.getLogIn().get(0));
	boolean url = getCurrentUrl().contains("SearchHotel");
	Assert.assertTrue("Verify if user navigates to Login Hotel Page", url);

}

@When("User has to fill the mandatory fields {string} and {string} and {string} and {string} and {string}and{string}")
public void user_has_to_fill_the_mandatory_fields_and_and_and_and_and(String location, String hotel, String roomType, String numOfRooms, String adultsRoom, String childRoom ) {
	SearchHotelPage search =new SearchHotelPage();
	selectVisibleText(search.getLocation().get(0), location);
	selectVisibleText(search.getHotel().get(0), hotel);
	selectVisibleText(search.getRoomType().get(0), roomType);
	selectVisibleText(search.getNumOfRooms().get(0), numOfRooms);
	selectVisibleText(search.getAdultsPerRoom().get(0),adultsRoom);
	selectVisibleText(search.getChildernPerRoom().get(0), childRoom);
	btnClick(search.getSearch().get(0));
	boolean url = getCurrentUrl().contains("SelectHotel");
	Assert.assertTrue("Verify if user navigates to search Hotel Page", url);

}

@When("User has to click the select button")
public void user_has_to_click_the_select_button() {
	SelectHotelPage select =new SelectHotelPage();
	btnClick(select.getSelect().get(0));
	btnClick(select.getContinuebtn().get(0));
	boolean url = getCurrentUrl().contains("BookHotel");
	Assert.assertTrue("Verify if user navigates to book Hotel Page", url);
}

@When("User has to fill the mandatory fields {string} and {string} and {string} and {string} and {string} and {string}and {string}and {string}")
public void user_has_to_fill_the_mandatory_fields_and_and_and_and_and_and_and(String firstName, String lastName, String address,String creditCard, String creditCardType, String expiryMonth, String expiryYear, String cvv) throws InterruptedException {
	BookingPage book =new BookingPage();
	sendKeyBase(book.getFirstName().get(0), firstName);
	Assert.assertEquals("Verify first Name",firstName,getAtrribute(book.getFirstName().get(0)));
	sendKeyBase(book.getLastName().get(0), lastName);
	Assert.assertEquals("Verify last Name",lastName,getAtrribute(book.getLastName().get(0)));
	sendKeyBase(book.getAddress().get(0),address);
	Assert.assertEquals("Verify address",address,getAtrribute(book.getAddress().get(0)));
	sendKeyBase(book.getCreditCardNum().get(0),creditCard);
	Assert.assertEquals("Verify creditCard",creditCard,getAtrribute(book.getCreditCardNum().get(0)));
	selectVisibleText(book.getCreditCardType().get(0), creditCardType);
	selectVisibleText(book.getSelectExpiryMonth().get(0), expiryMonth);
	selectVisibleText(book.getSelectExpiryYear().get(0), expiryYear);
	sendKeyBase(book.getCvvNum().get(0),cvv);
	Assert.assertEquals("Verify cvv",cvv,getAtrribute(book.getCvvNum().get(0)));
	btnClick(book.getBooknow().get(0));
	Thread.sleep(5000);
	boolean url = getCurrentUrl().contains("BookingConfirm");
	Assert.assertTrue("Verify if user navigates to BookingConfirm Hotel Page", url);
}

@Then("User should navigate to Booking Confirm Page")
public void user_should_navigate_to_Booking_Confirm_Page() throws InterruptedException {
	Thread.sleep(5000);
	OrderReciptPage printOrderNo =new OrderReciptPage();
	System.out.println(printOrderNo.getOrderNum().get(0).getAttribute("value"));
	driver.quit();

}

}

