package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarStap {

	

@Given("^i am the home page \"([^\"]*)\" of cars guide webside$")
public void i_am_the_home_page_of_cars_guide_webside(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^i move to car manu$")
public void i_move_to_car_manu(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}

@And("^Click on \"([^\"]*)\" link$")
public void click_on_link(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@And("^Select carbrand as \"([^\"]*)\" from anymake dropdown$")
public void select_carbrand_as_from_anymake_dropdown(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@And("^Select carbrand as \"([^\"]*)\" from aselectmodel dropdown$")
public void select_carbrand_as_from_aselectmodel_dropdown(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@And("^select locator as \"([^\"]*)\" from selectlocation dropdown$")
public void select_locator_as_from_selectlocation_dropdown(String arg1) throws Throwable {
    
}

@And("^select price as \"([^\"]*)\" from price dropdown$")
public void select_price_as_from_price_dropdown(String arg1) throws Throwable {
    
}

@And("^click onFind_MY_Next_Car_button$")
public void click_onFind_MY_Next_Car_button() throws Throwable {
    
}

@Then("^I should be list of searched cars$")
public void i_should_be_list_of_searched_cars() throws Throwable {
   
}

@And("^the page title should be \"([^\"]*)\"$")
public void the_page_title_should_be(String arg1) throws Throwable {
    
}
}
