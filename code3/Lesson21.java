
import java.util.Scanner;
public class Exam6{
public static void main(String[] args){
	int i,j;
  Student[] stus = new Student[4];
  Scanner sc = new Scanner(System.in);
  String id,name;
  int grade;
  for (i=0;i<4;i++)
  {
    System.out.println("Input id");
    id = sc.next();
    System.out.println("Input name");
    name = sc.next();
    System.out.println("Input grade");
    grade = sc.nextInt();
    stus[i] = new Student(id,name,grade);
  }
	bubbleSort(stus);
	for(i=0;i<4;i++)
	{
		stus[i].printInfo();
	}
	System.out.print("\n");
}
public static void bubbleSort(Student[] x)
{
    int i,j,t;
  String temp1,temp2;
  for(i=0;i<x.length-1;i++)
  {
  	for(j=x.length-1;j>=i+1;j--)
  	if(x[j].grade>x[j-1].grade)
  	{
  		temp1= x[j].id;x[j].id=x[j-1].id;x[j-1].id = temp1;
      temp2= x[j].name;x[j].name=x[j-1].name;x[j-1].name = temp2;
  		t= x[j].grade;x[j].grade=x[j-1].grade;x[j-1].grade = t;
  	}
  }
}
}
class Student
{
String id;
String name;
int grade;
Student(String id, String name, int grade)
{
this.id =id;
this.name =name;
this.grade =grade;
}
void printInfo()
{	System.out.println("学号"+id+"，姓名"+name+"，年级"+grade);}}
