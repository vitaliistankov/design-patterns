package chain;

public class CourierService implements CourierServiceItf {
	
	
	private CourierServiceItf handler = null;
	
	

	public CourierServiceItf getHandler() {
		return handler;
	}



	public void setHandler(CourierServiceItf handler) {
		this.handler = handler;
	}



	@Override
	public void handleRequest(CustomerRequest request) {
		handler.handleRequest(request);

	}

}
