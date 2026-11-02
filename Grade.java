package edu.monmouth.lab1;

public class Grade {

	// Instance variables
	private String gradeLetter;
	private final String DEFAULT_VALUE = "UNKOWN";
	private final String DEFAULT_GRADE = "C";
	private final int GRADE_VALUE_A = 100;
	private final int GRADE_VALUE_B = 90;
	private final int GRADE_VALUE_C = 80;
	private final int GRADE_VALUE_OTHER = 70;

	// Default constructor
	public Grade() {
		setGradeLetter(DEFAULT_GRADE);

	}

	// Other Constructor
	public Grade(String gradeLetter) {
		setGradeLetter(gradeLetter);

	}

	// Accessor
	public String getGradeLetter() {
		return this.gradeLetter;

	}

	// Mutator with validation of gradeLetter
	public void setGradeLetter(String gradeLetter) {
		if (gradeLetter == null || gradeLetter.length() > 1) {
			this.gradeLetter = DEFAULT_VALUE;
		}
		else if (gradeLetter.equals("A") || gradeLetter.equals("B") || gradeLetter.equals("C")) {
			this.gradeLetter = gradeLetter;

		} else {
			this.gradeLetter = DEFAULT_VALUE;
		}

	}

	// Accessor to get the grade value
	public double getGradeValue() {
		if (this.gradeLetter.equals("A")) {
			return GRADE_VALUE_A;
		} else if (this.gradeLetter.equals("B")) {
			return GRADE_VALUE_B;
		} else if (this.gradeLetter.equals("C")) {
			return GRADE_VALUE_C;
		} else {
			return GRADE_VALUE_OTHER;
		}

	}

}
