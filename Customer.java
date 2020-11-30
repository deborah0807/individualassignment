public class Customer extends Person {
	private int CustNo;
	private boolean stop = false;
	private char mail;
	
	
	public Customer() {}

	public void Pelanggan(boolean stop, char mail)
	{
		this.CustNo = CustNo;
		this.stop  = stop;
		this.mail = mail;
	}

	public int getCustNo()
	{
		return CustNo;
	}

	public boolean getstop()
	{
		return stop;
	}
}