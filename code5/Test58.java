import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Test58 extends JFrame
{
static BufferedImage image = null;
static File file = null;

public Test58()
{
setSize(800,600);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args)throws IOException{
try
{
file = new File("lena.jpg");
image = ImageIO.read(file);
Test58 t = new Test58();
}
catch(IOException e)
{
System.out.println("Error: "+e);}
}

public void paint(Graphics g)
{
super.paint(g);
g.drawImage(image,0,0, null);
}
}

