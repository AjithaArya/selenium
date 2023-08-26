package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.hrms.utility.Log;
import com.hrms.utilitypom.Basic;

public class AddEmployess extends Basic {
	// objectives
	static By btn_pim= By.linkText("PIM");
	static By btn_addemployee=By.linkText("Add Employee");
	static By txt_FirstName=By.name("txtEmpFirstName");
	static By txt_LastName=By.name("txtEmpLastName");
	static By btn_save=By.id("btnEdit");
	static String txt_EnterFirstName="Ajitha";
	static String txt_EnterlasstName="Arya";
	static By btn_Add=By.xpath("//input[@value='Add'][@type='button']");
	
	public static void pimMenu() {
		Actions ac= new Actions(driver); 
		ac.moveToElement(driver.findElement(btn_pim)).perform();
		ac.moveToElement(driver.findElement(btn_addemployee)).perform(); 
		Log.info("pimmouseover completed");
	}
	public static void AddEmp() {
		driver.findElement(btn_Add).click();
		driver.findElement(txt_FirstName).sendKeys(txt_EnterFirstName);
		driver.findElement(txt_LastName).sendKeys(txt_EnterlasstName);
		driver.findElement(btn_save).click();
		Log.info("AddemployeeCompleted");
		
	}

}
