package com.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Helper;
public class SelectHotelPage extends Helper{
	
			public  SelectHotelPage() {
				PageFactory.initElements(driver, this);
			}
			@FindBy(id="radiobutton_0")
			private List<WebElement> select;
			@FindBy(id="continue")
			private List<WebElement>  continuebtn;
			public List<WebElement>  getSelect() {
				return select;
			}
			public List<WebElement>  getContinuebtn() {
				return continuebtn;
			}
}
