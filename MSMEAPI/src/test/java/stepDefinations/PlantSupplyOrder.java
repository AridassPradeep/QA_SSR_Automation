package stepDefinations;

import io.cucumber.java.en.Then;
import resources.ProjectVariables;
import resources.Utils;

public class PlantSupplyOrder {
	

@Then("extract the jwtToken")
public void extract_the_jwt_token() {
	ProjectVariables.jwtToken = Utils.getexpectedValue("jwtToken");
	System.out.println(ProjectVariables.jwtToken);
  
}


}
