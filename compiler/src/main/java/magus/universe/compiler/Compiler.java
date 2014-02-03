package magus.universe.compiler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import magus.universe.compiler.exception.CompilerException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The base class for the universe compiler. It takes an unique input file and create a unique output file.
 * @author Magus
 */
public class Compiler {
	private static final Log LOG = LogFactory.getLog(Compiler.class);
	
	/**
	 * All steps of the compilation
	 */
	private List<Step> steps;
	
	/**
	 * Construct a new Compiler
	 */
	public Compiler() {
		// Initialize the steps of the compilation
		steps = new ArrayList<Step>();
	}
	
	/**
	 * Perform a compilation
	 * @param in
	 * 	The source file
	 * @param out
	 * 	The output file
	 * @return <code>this</code>
	 */
	public Compiler compile(File in, File out) throws CompilerException {
		boolean log = LOG.isInfoEnabled();
		
		if (log) {
			LOG.info("Starting compilation");
			LOG.info("input : " + in.getAbsolutePath());
			LOG.info("output : " + out.getAbsolutePath());
		}
		
		if (!in.exists()) {
			throw new CompilerException(in.getAbsolutePath() + "does not exists");
		}
		
		return this;
	}
	
}
