package chain;

public class Main {

	public static void main(String[] args) {
		
		CourierService courierService = new CourierService();
		
		
		CustomerRequest request = new CustomerRequest();
		request.setType(CourierDestination.ABROAD);
		courierService.handleRequest(request);
		System.out.println(request.getDelivery());
		
		request = new CustomerRequest();
		request.setType(CourierDestination.COUNTRY);
		courierService.handleRequest(request);
		System.out.println(request.getDelivery());
		
		request = new CustomerRequest();
		request.setType(CourierDestination.CITY);
		courierService.handleRequest(request);
		System.out.println(request.getDelivery());

	}

}
