package chain;

public class CountryGisheCourier implements CourierServiceItf {
	
	
	private CourierServiceItf next = null;
	
	

	public CourierServiceItf getNext() {
		return next;
	}



	public void setNext(CourierServiceItf next) {
		this.next = next;
	}



	@Override
	public void handleRequest(CustomerRequest request) {
		if (request.getType() == CourierDestination.COUNTRY) 
		{
			request.setDelivery("Country gishe handled customer request !!");
		}
		else
		{
			if (next !=null) {
				next.handleRequest(request);
				
			}
		}
		

	}

}
