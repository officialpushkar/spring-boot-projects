package com.spring.springioc;

import org.springframework.stereotype.Component;

@Component
public class Math {

	private MathCheat mathCheat;

	public MathCheat getMathCheat() {
		return mathCheat;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	void cheating() {
		mathCheat.maathCheat();
	}

}
