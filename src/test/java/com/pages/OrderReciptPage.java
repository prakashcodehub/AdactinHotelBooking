package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Helper;

public class OrderReciptPage extends Helper{
	public  OrderReciptPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private List<WebElement>  orderNum;
	public List<WebElement>  getOrderNum() {
		return orderNum;
	}

}
