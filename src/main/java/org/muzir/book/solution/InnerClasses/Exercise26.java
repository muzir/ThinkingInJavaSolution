package org.muzir.book.solution.InnerClasses;

import org.muzir.book.solution.InnerClasses.EngineeringFaculty.ComputerEnginering;

/**
 * @author erhun.baycelik
 *
 */
class Faculty {
	class Department {
		private String name;

		public Department(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Department [name=" + name + "]";
		}

	}
}

class EngineeringFaculty {
	class ComputerEnginering extends Faculty.Department {
		public ComputerEnginering(Faculty faculty) {
			faculty.super("Computer Engineering");
		}

	}
}

public class Exercise26 {
	public static void main(String[] args) {
		Faculty faculty = new Faculty();
		EngineeringFaculty engineeringFaculty = new EngineeringFaculty();
		ComputerEnginering computerEnginering = engineeringFaculty.new ComputerEnginering(faculty);
		System.out.println(computerEnginering.toString());
	}
}
