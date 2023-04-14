package resources;


public enum APIResources {
	
    notificationRegistrationsmsAPI("/notification/sms/send"),
    notificationEmailAPI("/notification/email/send/order"),
    loginAPI("/customer/login/"),
    registerAPI("/customer/register"),
    cartSizeAPI("/cart/cart-size"),
	addToCartAPI("/cart/addtocart"),
	validateGSTAPI("/customer/v1/gst/validate"),
	validateCouponAPI("/cart/v2/add-discount"),
	validatemyOrderAPI("/order-service/order/my-orders?offset=0&limit=499"),
	createOrderAPI("/order/create"),
	orderSummaryAPI("/order/summary/order-num"),
	orderAPI("/order/order-num"),
	bankAPI("payment/banks"),
	paymentSummaryAPI("payment/paymentSummary/orderNumber"),
	razorPayOrderAPI("payment/razorpayorder"),
	captureTransactionAPI("payment/capture-transaction"),
	ledgerAPI("customer/ledger?page=0&limit=10"),
	ledgerTransactionDownloadAPI("customer/download-transaction"),
	ledgerEmailStatementAPI("customer/ledger/share"),
	plpAPI("catalog/breadcrumb/category"),
	plpFilterAPI("product/projections/filter"),
	profileAPI("customer/me/profile"),
	updateprofileAPI("customer/profile"),
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
	
