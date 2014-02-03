package magus.universe.compiler.exception;

/**
 * Represents an error during the compilation
 * @author Magus
 *
 */
public class CompilerException extends Exception {
	private static final long serialVersionUID = 5359482466152964691L;

	public CompilerException() {
		super();
	}

	public CompilerException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CompilerException(String message, Throwable cause) {
		super(message, cause);
	}

	public CompilerException(String message) {
		super(message);
	}

	public CompilerException(Throwable cause) {
		super(cause);
	}
	
}
