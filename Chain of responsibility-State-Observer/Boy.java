package chain;

public class Boy implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("Boy :: " + m.getMessageContent());

	}

}
