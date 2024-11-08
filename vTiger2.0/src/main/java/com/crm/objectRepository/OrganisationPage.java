package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class OrganisationPage {
	

	public OrganisationPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement CreateOrg;
	@FindBy(name="search_text")
	private WebElement SearchOrg;
	@FindBy(name="submit")
	private WebElement SearchBtn;
	@FindBy(partialLinkText = "Advanced")
	private WebElement AdvancedSearch;
	@FindAll({@FindBy (id="bas_searchfield"),@FindBy(name ="search_field")})
	private WebElement OrgDropdown;
	@FindBy(linkText = "del")
	private WebElement DeleteOrg;
	@FindAll({@FindBy(id="51"),@FindBy(name="selected_id")})
	private WebElement OrgCheckBox;
	
	
	
	public WebElement getCreateOrg() {
		return CreateOrg;
	}
	public WebElement getSearchOrg() {
		return SearchOrg;
	}
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	public WebElement getOrgDropdown() {
		return OrgDropdown;
	}
	public WebElement getDeleteOrg() {
		return DeleteOrg;
	}
	public WebElement getAdvancedSearch() {
		return AdvancedSearch;
	}
	public WebElement getOrgCheckBox() {
		return OrgCheckBox;
	}
	
	
	

	public void createOrg() {
		CreateOrg.click();
	}
	public void searchOrg(String OrgName) {
		SearchOrg.sendKeys(OrgName);
	}
	public void searchButton() {
		SearchBtn.click();
	}
	
	public void deleteOrg() {
		DeleteOrg.click();
	}
	
	public void orgCheckBox() {
		OrgCheckBox.click();
	}
	
	
	
	
}
