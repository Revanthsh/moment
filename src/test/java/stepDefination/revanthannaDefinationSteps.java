package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.revanthanna;

public class revanthannaDefinationSteps {
	
	
	@Steps
	revanthanna ok;
	
	 @Given("the user is on the Wikionary home page")
	    public void givenTheUserIsOnTheWikionaryHomePage() {
	        ok.is_the_home_page();
	    }

@Given("^i enterword in \"([^\"]*)\"  search bar$")
public void i_enterword_in_search_bar(String arg1) throws Exception {
	ok.enters(arg1);
   }


@Given("^click on search bar$")
public void click_on_search_bar() throws Exception {
	ok.click_search_button();
    
}

@Then("^user should able to view the meaning of  word$")
public void user_should_able_to_view_the_meaning_of_word() throws Exception {

}
     @Then("^application should be closed$")
    public void application_should_be_closed() throws Exception {

   
}
}


