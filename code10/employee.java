class employee implements person, identified
{
	String name;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return identified.super.getId();
	}
}