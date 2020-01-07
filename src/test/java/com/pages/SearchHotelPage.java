package com.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Helper;
public class SearchHotelPage extends Helper{
		public  SearchHotelPage() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="location")
		private List<WebElement>  location;
		@FindBy(id="hotels")
		private List<WebElement> hotel;
		@FindBy(id="room_type")
		private List<WebElement>  roomType;
		@FindBy(id="room_nos")
		private List<WebElement>  numOfRooms;
		@FindBy(id="adult_room")
		private List<WebElement>  adultsPerRoom;
		@FindBy(id="child_room")
		private List<WebElement>  childernPerRoom;
		@FindBy(id="Submit")
		private List<WebElement>  search;
		
		public List<WebElement>  getLocation() {
			return location;
		}
		public List<WebElement>  getHotel() {
			return hotel;
		}
		public List<WebElement>  getRoomType() {
			return roomType;
		}
		public List<WebElement>  getNumOfRooms() {
			return numOfRooms;
		}
		public List<WebElement>  getAdultsPerRoom() {
			return adultsPerRoom;
		}
		public List<WebElement>  getChildernPerRoom() {
			return childernPerRoom;
		}
		public List<WebElement>  getSearch() {
			return search;
		}
			
		
	

}
