import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.Random;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.Math;

public class Lesson1010 {
   public static void main(String[] args) {
   		String[] names = {"peter","anna","mike","john"};
   		// Arrays.sort(names, new Comparator<String>()
   		// {
   		// 	public int compare(String a, String b)
   		// 	{
   		// 		return a.compareTo(b);
   		// 	}
   		// });
   		// Arrays.sort(names, (String a, String b) ->
   		// 	{
   		// 		return b.compareTo(a);
   		// 	}
   		// );
   		Arrays.sort(names, (String a, String b) -> b.compareTo(a));
   		for(String c: names)
   		{
   			System.out.print(c+"\n");
   		}

      Function<Integer, Double> fun1 = (input) -> 1.6 * input;
      int miles = 3;
      double kms = fun1.apply(miles);
      System.out.printf("%d miles = %3.2f kilometers\n",miles, kms);

      //表示带一个参数且返回一个结果的函数
      Function<Integer,Integer> fun2 = (input) ->{
         int sum1 = 0;
         for(int i=0;i<=input;i++)
         {
            sum1+=i;
         }
         return sum1;
      };
      System.out.format("%d = %d\n",30, fun2.apply(30));
   
      //表示两个参数且返回一个结果的函数
      BiFunction<int[],int[],Integer> fun3 = (w,d)-> {
         int sum2 = 0;
         for(int i=0;i<w.length;i++)
         {
            sum2+=w[i]*d[i];
         }
         return sum2;
      };
      int[] a1 = {1,2,3,4};
      int[] b1 = {3,4,1,1};
      for(int i:a1){System.out.print(i+"  ");}
      System.out.print("\n");
      for(int i:b1){System.out.print(i+"  ");}
      System.out.print("\n");
      System.out.format("向量的乘积=%d\n",fun3.apply(a1,b1));

      //一种有一个操作数的运算且返回一个结果
      UnaryOperator<Integer> fun4 = (w) -> {
        return Math.abs(w);
      };
      System.out.format("abs value = %d\n",fun4.apply(-4));

      //一种有两个操作数的运算且返回一个结果
      BinaryOperator<Integer> fun5 = (a,b) -> {
        int c;
        if(a<b){c=a;a=b;b=c;}
        while(b!=0)
        {
         c=a%b;
         a=b;
         b=c;
        }
        return a;
      };
      System.out.format("最大公倍数 = %d\n",fun5.apply(48,36));

      //Predicate 函数定义了test method
      Predicate<String> fun6 = (input) -> {
         for(int i=0;i<input.length();i++)
         {
            char c = input.charAt(i);
            if("1234567890".indexOf(c)==-1){
               return false;
            }
         }
         return true;
      };
      System.out.print(fun6.test("12345")+"\n");

      Supplier<Integer> fun7 = () -> {
          Random random = new Random();
          return random.nextInt(10);  
      };
      System.out.print(fun7.get()+"\n");

      Consumer<String> fun8 = (input) -> {
         int length = input.length();
         System.out.print(input.substring(0,length/2));
      };
      fun8.accept("hello world!");
   }  

}

