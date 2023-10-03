
abstract class Pen {
	public abstract void write();
}
 
class  Pencil extends Pen {
	public void write() {

	}
}
 
class Student {
	public void user(Pen pen) {
		pen.write();
	}
}
 
public class Lesson94
{
	public static void main(String args[]) {
		Student s = new Student();
						//直接传递给方法
		s.user(new Pen() {
			public void write() {
				System.out.println("钢笔写字");
			}
		});
	}
}