package Renastech.Lab02.stepDefinitions;

import Renastech.Lab02.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class steps {
    HomePage homePage=new HomePage();
    TariffPlan tariffPage=new TariffPlan();
    VerificationPage verificationPage=new VerificationPage();
    PlanDetails planDetails=new PlanDetails();
    VerificationMessage verificationMessage=new VerificationMessage();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
    homePage.setVerification();
    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        tariffPage.setTariffPlanLink();

    }
    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String string) {
        verificationPage.setVerify();

    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String> dataTable) {
        planDetails.setMrental(dataTable.get("Monthly Rental"));
        planDetails.setLocalMinutes(dataTable.get("Free Local Minutes"));
        planDetails.setInterMinutes(dataTable.get("Free International Minutes"));
        planDetails.setSmsPack(dataTable.get("Free SMS Pack"));
        planDetails.setLocalMinutesCharge(dataTable.get("Local Per Minutes Charges"));
        planDetails.setInterMinutesCharge(dataTable.get("International Per Minutes Charges"));
        planDetails.setSmsCharge(dataTable.get("SMS Per Charges"));


    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        planDetails.setSubmitBtn();
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String expected) {
            verificationMessage.setVerificationMessage(expected);
    }
}
