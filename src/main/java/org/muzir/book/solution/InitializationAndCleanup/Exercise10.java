package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class FinalizeObject {
	public FinalizeObject() {
		message = "Hello Guys";
		//finalize();
	}

	@Override
	protected void finalize() {
		System.out.println("Finalize");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
}

public class Exercise10 {
	public static void main(String[] args) {
		FinalizeObject finalizeObject = new FinalizeObject();
		System.out.println(finalizeObject.getMessage());
		new FinalizeObject().getMessage();
		// System.gc is used to force finalization.
		System.gc();

	}
}
