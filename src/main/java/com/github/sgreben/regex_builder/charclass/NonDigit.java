package com.github.sgreben.regex_builder.charclass;

import com.github.sgreben.regex_builder.CharClass;
import com.github.sgreben.regex_builder.tokens.RAW;
import com.github.sgreben.regex_builder.tokens.TOKEN;

public class NonDigit extends Nullary {
	public NonDigit() {
	}

	@Override
	public CharClass complement() {
		return new Digit();
	}

	@Override
	public void compile(java.util.List<TOKEN> output) {
		output.add(new RAW("\\D"));
	}
}
