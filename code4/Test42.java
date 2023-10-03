import java.util.Scanner;
class Rectangle
{
    private int width;
    private int height;
    Rectangle(){}
    Rectangle(int w, int h){this.width=w;this.height=h;}
    public void setWidth(int w){this.width=w;}
    public void setHeight(int h){this.height=h;}
    public int getWidht(){return this.width;}
    public int getHeight(){return this.height;}
    public int length(){return 2*(this.height+this.width);}
    public int area(){return this.height*this.width;}
}
public class Test42
{
  public static void main(String[] args)
  {
     Rectangle rect1 = new Rectangle(4,5);
     System.out.print(rect1.length()+"\n");
     System.out.print(rect1.area()+"\n");
  }   
}