package magus.universe.compiler;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The base class for the universe compiler. It takes an unique input file and create a unique output file.
 * @author Magus
 */
public class Compiler {
	private static final Log LOG = LogFactory.getLog(Compiler.class);

	/**
	 * The input file
	 */
	private File in;
	
	/**
	 * The output file
	 */
	private File out;
	
	/**
	 * Construct a new Compiler
	 * @param in
	 * 	The input file
	 * @param out
	 * 	The output file
	 */
	public Compiler(File in, File out) {
		this.in = in;
		this.out = out;
	}
	
}
