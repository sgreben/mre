package sgreben.mre.expression;

import sgreben.mre.tokens.*;

public class Many extends Unary {
	public Many(Expression child) { super(child); }
	
	public void compile(java.util.List<TOKEN> output) {
		output.add(new START_GROUP_NON_CAPTURING());
		for(Expression child : children()) {
			child.compile(output);
		}
		output.add(new END_GROUP());
		output.add(new STAR());
	}
}