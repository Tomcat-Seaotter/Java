import java.util.Scanner;

class Lesson48
{
	public static void main(String[] args)
	{
		TV t =  new TV(true,15,15);
		t.turnOff();
		t.turnOn();
		t.setChannel(18);
		t.setVolume(25);
		t.channelUp();
		t.channelDown();
		t.volumeUp();
		t.volumeDown();
	}

}

class TV
{
	private boolean on;
	private int channel;
	private int volumeLevel;

    TV(boolean on, int channel, int volumeLevel)
    {
		this.on = on;
		this.channel = channel;
		this.volumeLevel = volumeLevel;
    }
	public void turnOn()
	{
		this.on = true;
		System.out.print("TV 打开！\n");
	}
	public void turnOff()
	{
		this.on = false;
		System.out.print("TV 关闭！\n");
	}
	public void setChannel(int channel)
	{
		this.channel = channel;
	}
	public void setVolume(int volumeLevel)
	{
		this.volumeLevel = volumeLevel;
	}
	public void channelUp()
	{
		this.channel++;
		System.out.print("TV 频道！"+ this.channel + "\n");
	}
	public void channelDown()
	{
		this.channel--;
		System.out.print("TV 频道！"+ this.channel + "\n");
	}
    public void volumeUp()
    {
    	this.volumeLevel++;
    	System.out.print("TV 音量！"+ this.volumeLevel + "\n");
    }
   public void volumeDown()
   {	
   		this.volumeLevel--;
   		System.out.print("TV 音量！"+ this.volumeLevel +"\n");
   }

}