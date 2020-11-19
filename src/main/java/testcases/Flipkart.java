package testcases;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartFirstWindow;
import pages.FlipkartSecondWindow;

public class Flipkart {

	@Given("^Open flipkart browser$")
	public void open_flipkart_browser_and_validate_it() {
		FlipkartFirstWindow.openBrowser();

	}

	@When("^escape key is pressed$")
	public void escape_key_is_pressed() {
		FlipkartFirstWindow.escKey();

	}

	@Then("^flipkart home page should be loaded and validated$")
	public void flipkart_home_page_should_be_loaded_and_validated() {
		FlipkartFirstWindow.validateHomePage();
	}

	@When("^user searches mobile in search bar and hit enter$")
	public void user_searches_mobile_in_search_bar_and_hit_enter() {
		FlipkartFirstWindow.user_searches_mobile_in_search_bar_and_hit_enter();

	}

	@Then("^list of given mobile phones should appear$")
	public void list_of_given_mobile_phones_should_appear() {
		FlipkartFirstWindow.list_of_given_mobile_phones_should_appear();
	}

	@When("^user clicks first searched result link$")
	public void user_clicks_first_searched_result_link() {
		FlipkartFirstWindow.user_clicks_first_searched_result_link();

	}

	@Then("^searched mobile should appear with details$")
	public void searched_mobile_should_appear_with_textprice_details() {
		FlipkartSecondWindow.searched_mobile_should_appear_with_details();
	}

	@When("^delivery details is entered and item added to cart$")
	public void delivery_details_is_entered_and_item_added_to_cart() {
		FlipkartSecondWindow.delivery_details_is_entered_and_item_added_to_cart();
	}

	@Then("^mobile details should be validated and compared with previous data$")
	public void mobile_textprice_should_be_validated_and_compared_with_previous_data() {
		FlipkartSecondWindow.mobile_details_should_be_validated_and_compared_with_previous_data();
	}

	@And("^mobile details should be captured for validation$")
	public void mobile_textprice_should_be_captured_for_validation() throws InterruptedException {
		FlipkartSecondWindow.child_Window_Switch();
		FlipkartSecondWindow.mobile_details_should_be_captured_for_validation();
	}

	@And("^screen is closed if the mobile details matches$")
	public void screen_is_closed_if_the_textprice_matches() {
		FlipkartSecondWindow.screen_is_closed_if_the_mobile_details_matches();

	}

}
