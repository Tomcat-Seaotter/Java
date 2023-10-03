import java.util.Date;

public class DeprecatedDemo{
	@Deprecated
	public void badMethod(){
	     System.out.println("Deprecated");
	}
	
	public static void main(String[]args){
		Date d = new Date(2017,10,30);
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		
		DeprecatedDemo dd = new DeprecatedDemo();
	    dd.badMethod();
    }
}
