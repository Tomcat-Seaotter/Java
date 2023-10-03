interface identified
{
	public default int getId()
	{
		return Math.abs(hashCode());
	}
}