package resources;

public class TestDataBuild {
	
	public String notoficationRegistrationSmsPayload(String phoneNo) {
	    return "{\r\n"
	            + "    \"sms-for\":\"Successfully Registered\",\r\n"
	            + "    \"mobileNumber\":\""+phoneNo+"\",\r\n"
	            + "    \"data\":{\r\n"
	            + "        \"userEmail\":\"dddda\",\r\n"
	            + "        \"phoneNumber\":\""+phoneNo+"\"\r\n"
	            + "    }\r\n"
	            + "}";
	}

}

