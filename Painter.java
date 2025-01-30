package Assignment;

public interface Painter {
	String paint();
}

class Abc{
	public static void main(String args[]) {
		LaserPrinter lp=new LaserPrinter();
		System.out.println(lp.scanCopy());
		System.out.println(lp.paint());
		
		
	}
}