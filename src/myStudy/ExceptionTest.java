package myStudy;

public class ExceptionTest extends Exception {

	private static final long serialVersionUID = 1L;

	public ExceptionTest() {
		super("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ExceptionTest");
	}

	public ExceptionTest(String message) {
		super(message);
	}
}
