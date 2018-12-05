package revanth1.pages;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import groovyjarjarantlr.collections.List;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

	
@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class DictionaryPage1 extends PageObject {

@FindBy(name="search")
private WebElementFacade searchTerms;

@FindBy(name ="go")
private WebElementFacade  clickButton;

public void  enter_keywords(String keyword) {
	searchTerms.type(keyword);
}
public void clickButton() {
	clickButton.click();
}
//public void lookup_terms() {
	//lookup_terms.search();
	
}

//public static void lookup_terms() {
//	lookup_terms.
 //public String getDefinitions() {
//	WebElementFacade definitionList=find(By.tagName("ol"));
	//return  definitionList.findElement(By.tagName("li")).getText();
			
 
	

	
	
	



	







		
		