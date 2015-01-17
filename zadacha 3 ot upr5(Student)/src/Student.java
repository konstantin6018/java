import java.util.*;
public class Student {
 private String name;
 private String surname;
 private int number;
 private  HashMap<String , ArrayList<Integer>> grades = new HashMap<>();
  public Student(){
	  this.name="";
	  this.surname="";
	  this.number=0;
  }
	public Student(String name,String surname,int number){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public HashMap<String, ArrayList<Integer>> getGrades() {
		return grades;
	}
	public void setGrades(HashMap<String, ArrayList<Integer>> grades) {
		this.grades = grades;
	}
	public void addSubjectMark(String subject , int mark)
	{
		grades.get(subject).add(mark);
	}
	
	
	public float calculateAverageMark(String subject)
	{
		grades.get(subject);
		float sum=0;
		for(int i = 0 ; i<grades.get(subject).size();i++)
		{
			sum += grades.get(subject).get(i);
		}
		return sum/grades.get(subject).size();
		
	}
}
