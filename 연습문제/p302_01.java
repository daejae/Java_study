package Sol;

class sol_Printer {
	private String productNumber;
	private String maker;
	private String interfaceType;
	private int paperBacklog;
	private int paperOrder;

	public sol_Printer() {

	}

	public void print() {

	}

}

class sol_LaserPrinter extends sol_Printer {
	private int tonerBacklog;

	public sol_LaserPrinter() {

	}

	public void print() {

	}
}

class sol_InkjetPrinter extends sol_Printer{
	private int inkBacklog;
	
	public sol_InkjetPrinter() {
		
	}
	public void print() {
		
	}
}

public class p302_01 {

}
