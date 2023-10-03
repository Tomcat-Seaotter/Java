# 第二章 Java的分支语句



```flow
st1=>start: 开始
op1=>operation: 过程1
op2=>operation: 过程2
e=>end: 结束

st1->op1
op1->op2
op2->e
```



### 1、Java分支语句

$$
y = \begin{cases} sin(x) & x> 0 \\ 
 cos(x) & x \leqslant -5 \\
 x^2+3x  & x\geqslant -5 \quad and \quad x<0
 \end{cases}
$$

```java
import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = 0;
        if (x>0)
        {
            y= Math.sin(x);
        }
        else if(x<=-5)
        {
            y = Math.cos(x);
        }
        else
        {
            y = x*x+3*x;
        }
        System.out.print("y="+y);
    }
}


```

### 2、Java的循环语句

1、判断1~100之间自然数，哪些数能够被7整除。 

```java
import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i<=100)
        {
            if(i%7==0)
            {
                System.out.print(i+"\t");
            }
            i++;
        }
    }
}
```

2、判断1~100之间自然数，哪些数能够同时被2和7整除。 

```flow
st=>start: Start
e=>end
op=>operation: 同时被2和7整除
cond=>condition: Yes or No?

st->op->cond
cond(yes)->e
cond(no)->op
```



```java
import java.util.Scanner;

public class Test3
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i<=100)
        {
            if(i%2==0 && i%7==0)
            {
                System.out.print(i+"\t");
            }
            i++;
        }
    }
}
```

3、判断2~100之间的质数（只能被自身和1整除的数）。

```java
import java.util.Scanner;

public class Test4
{
    public static void main(String[] args)
    {
        int i = 2;
        while(i<=100)
        {
            int j;
            j=i-1;
            while(j>=2)
            {
                if(i%j==0)
                {
                    break;
                }
                else
                {
                    j--;
                }
            }
            if(j==1)
            {
                System.out.print(i+"\t");
            }
            i++;
        }
    }
}
```

4、判断2~100之间的姐妹质数（相邻两个奇数均为素数）。

```java
import java.util.Scanner;

public class Test5
{
    public static void main(String[] args)
    {
        int x, i;
        i = 2;
        x = i;
        while(i<=100)
        {
            int j;
            j=i-1;
            while(j>=2)
            {
                if(i%j==0)
                {
                    break;
                }
                else
                {
                    j--;
                }
            }
            if(j==1)
            {
                if(i-x==2)
                {
                System.out.print(i+"\t");
                System.out.print(x+"\n");
                }
                x = i;
            }
            i++;
        }
    }
}
```

