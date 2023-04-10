package resources;


public enum APIResources {
	
    notificationRegistrationsmsAPI("/notification/sms/send"),
    notificationEmailAPI("/notification/email/send/order"),
    loginAPI("/customer/login/"),
    registerAPI("/customer/register"),
    cartSizeAPI("/cart/cart-size"),
	addToCartAPI("/cart/addtocart"),
	validateGSTAPI("/customer/v1/gst/validate"),
	clearCartAPI("/cart/delete-cart?cartType=cart");
	
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
		
	}
}
	
