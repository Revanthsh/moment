package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.hamcrest.Matcher;

import groovyjarjarantlr.collections.List;
import junit.framework.Assert;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import revanth1.pages.DictionaryPage;
import revanth1.pages.DictionaryPage1;

public class revanthanna {
	

	DictionaryPage1 page ;
	
	
	@Step
	@Screenshots(onlyOnFailures=true)
	public void enters(String  keyword) {
		page.enter_keywords(keyword);
		
	}
	
	//@Step
	 //public void starts_search() {
        //page.lookup_terms();
    
	
	@Step
	public void click_search_button() {
		page.clickButton();
	}

	 @Step
	    public void is_the_home_page() {
	        page.open();
	    }

	/* @Step
	    public void looks_for(String term) {
	        enters(term);
	        starts_search();
	/*
	  @Step
	 
	    public void should_see_definition(String definition) {
	        /*assertThat(page.getDefinitions(), hasItem(containsString(definition)));*/
	       // Assert.assertEquals(page.getDefinitions(), definition);
	     //   assertThat("Did not match the expected value", page.getDefinitions().equalsIgnoreCase(definition));
	        
	    }





	
		
	
	


