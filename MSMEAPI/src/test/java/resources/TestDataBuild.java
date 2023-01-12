package resources;

public class TestDataBuild {
	
	public String notoficationRegistrationSmsPayload(String phoneNo) {
		return "{\r\n"
				+ "    \"sms-for\":\"Successfully Registered\",\r\n"
				+ "    \"mobileNumber\":\"8095424663\",\r\n"
				+ "    \"data\":{\r\n"
				+ "        \"userEmail\":\"dddda\",\r\n"
				+ "        \"phoneNumber\":\"8095424663\"\r\n"
				+ "    }\r\n"
				+ "}";
		

	}

}
