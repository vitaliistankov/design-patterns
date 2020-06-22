package chain;

public class AbroadGisheCourier implements CourierServiceItf {
	
	
	private CourierServiceItf next = null;
	
	

	public CourierServiceItf getNext() {
		return next;
	}



	public void setNext(CourierServiceItf next) {
		this.next = next;
	}



	@Override
	public void handleRequest(CustomerRequest service) {
		if (service.getType() == CourierDestination.ABROAD) 
		{
			service.setDelivery("Abroad gishe handled customer request !!");
		}
		else
		{
			if (next != null) {
				next.handleRequest(service);
			}
		}

	}

}
