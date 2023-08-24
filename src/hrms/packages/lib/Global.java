package hrms.packages.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	// TestData
	public String url = "http://183.82.103.245/nareshit/index.php";
	public String un = "nareshit";
	public String pwd = "nareshit";
	public String firstName = "SunithaLabment";
	public String lastName = "Kothaaa";

	// objectives
	public String txt_Loginame = "txtUserName";
	public String txt_loginpassword = "txtPassword";
	public String txt_loginbtn = "Submit";
	public String txt_logout = "Logout";
	public String txt_pim = "PIM";
	public String txt_add_employees = "Add Employee";
	public String txt_addemp = "//input[@value='Add']";
	public String txt_lastname = "txtEmpLastName";
	public String txt_firsttname = "txtEmpFirstName";
	public String txt_savebtn = "btnEdit";
	public String txt_enterFrameid = "rightMenu";
	public String txt_delBtn = "//input[@value='Delete']";
	public String txt_checkBox="chkLocID[]";
	//public String txt_
}
