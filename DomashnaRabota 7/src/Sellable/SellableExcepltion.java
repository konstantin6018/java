package Sellable;

public class SellableExcepltion extends Exception {

	protected static final String message = "Error";

	public SellableExcepltion() {
		super();
	}

	public SellableExcepltion(String message) {
		super(message);

	}
}
