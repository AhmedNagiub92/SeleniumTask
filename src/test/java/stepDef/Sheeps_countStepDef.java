package stepDef;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.countSheep;
public  class Sheeps_countStepDef extends countSheep {

	int number;

	@Given("user entered no of sheeps as a non negative number")
	public void user_entered_no_of_sheeps_as_a_non_negative_number() {
		Scanner object = new Scanner(System.in);

		System.out.println("Enter a number: ");
		number = object.nextInt();
	}

	@Then("a string with number of sheeps is returned")
	public void a_string_with_number_of_sheeps_is_returned() {

		count(number);
	}
}