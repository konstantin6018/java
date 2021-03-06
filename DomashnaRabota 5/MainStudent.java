import java.util.*;

public class MainStudent {

	public static void main(String[] args) {

		Student Ivan = new Student();
		ArrayList<Integer> gradesIvan = new ArrayList<>(Arrays.asList(4, 2, 3));
		Ivan.getGrades().put("matematika", gradesIvan);
		Ivan.getGrades().put("himiq", new ArrayList<>(Arrays.asList(5, 5, 6)));
		Ivan.getGrades().put("angliiski",
				new ArrayList<>(Arrays.asList(5, 4, 6)));
		Ivan.getGrades().put("informatika",
				new ArrayList<>(Arrays.asList(3, 4, 2)));
		Ivan.getGrades().put("bulgarski ezik",
				new ArrayList<>(Arrays.asList(6, 6, 6)));
		Student Dragan = new Student();
		Dragan.getGrades().put("matematika",
				new ArrayList<>(Arrays.asList(6, 6, 6)));
		Dragan.getGrades()
				.put("himiq", new ArrayList<>(Arrays.asList(6, 5, 6)));
		Dragan.getGrades().put("angliiski",
				new ArrayList<>(Arrays.asList(6, 4, 6)));
		Dragan.getGrades().put("informatika",
				new ArrayList<>(Arrays.asList(6, 4, 4)));
		Dragan.getGrades().put("bulgarski ezik",
				new ArrayList<>(Arrays.asList(6, 6, 5)));
		Student Petkan = new Student();
		Petkan.getGrades().put("matematika",
				new ArrayList<>(Arrays.asList(3, 4, 2)));
		Petkan.getGrades()
				.put("himiq", new ArrayList<>(Arrays.asList(2, 2, 6)));
		Petkan.getGrades().put("angliiski",
				new ArrayList<>(Arrays.asList(6, 4, 3)));
		Petkan.getGrades().put("informatika",
				new ArrayList<>(Arrays.asList(4, 6, 6)));
		Petkan.getGrades().put("bulgarski ezik",
				new ArrayList<>(Arrays.asList(5, 5, 5)));

		for (String grade : Ivan.getGrades().keySet()) {
			System.out.println("" + grade + " -> "
					+ Ivan.getGrades().get(grade));
		}
		System.out.println();
		for (String grade : Dragan.getGrades().keySet()) {
			System.out.println("" + grade + " -> "
					+ Dragan.getGrades().get(grade));
		}
		float matematikaGrade = Dragan.calculateAverageMark("matematika");
		System.out.println("Sredna ocenka:" + matematikaGrade);
		Dragan.addSubjectMark("matematika", 6);
		System.out.println();
		for (String grade : Petkan.getGrades().keySet()) {
			System.out.println("" + grade + " -> "
					+ Petkan.getGrades().get(grade));
		}
		float himiqGrade = Petkan.calculateAverageMark("himiq");
		System.out.println("Stara sredna ocenka:" + himiqGrade);
		Petkan.addSubjectMark("himiq", 4);
		himiqGrade = Petkan.calculateAverageMark("himiq");
		System.out.println("Nova sredna ocenka:" + himiqGrade);
	}

}
