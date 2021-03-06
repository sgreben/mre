package com.github.sgreben.regex_builder.charclass;

import com.github.sgreben.regex_builder.CharClass;
import com.github.sgreben.regex_builder.tokens.RAW;
import com.github.sgreben.regex_builder.tokens.TOKEN;

public class WordCharacter extends Nullary {
	public WordCharacter() {
	}

	@Override
	public CharClass complement() {
		return new NonWordCharacter();
	}

	@Override
	public void compile(java.util.List<TOKEN> output) {
		output.add(new RAW("\\w"));
	}
}
