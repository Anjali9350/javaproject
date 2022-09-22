

/*
 * @author : Anjali
 * Program :Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
 * 
 */

	class Number extends Thread
	{
		synchronized	 public void fiboSeries()  { //here we put synchronization method
		    int n = 10, a = 0, b = 1;
		    System.out.println("Fibonacci Series " + n );

		    for (int i = 1; i <= n; ++i) {
		      System.out.println(a + " ");

		    //here we put the next terms
		      int nextTerm = a + b;
		      a = b;
		      a = nextTerm;
		}
		}
		    synchronized public void revNum()
		    {
		    	System.out.println("Reverse order");
		    	for(int i=10;i>=1;i--)
		    		System.out.println(i);
		    }
	}
	class Thread1 extends Thread{
		Number n;
		public Thread1(Number n) {
			this.n=n;
		}
		public void run() {
			n.fiboSeries();
		}
		
	}
	class Thread2 extends Thread{
		Number n;
		public Thread2(Number n) {
			this.n=n;
		}
		public void run() {
			n.revNum();
		}
		
	}
	public class FabnicoSeries {
		
	public static void main(String args[]) {
		Number num1=new Number();
		Thread1 th1=new Thread1(num1);
		Thread2 th2=new Thread2(num1);
		th1.start();
		th2.start();

	}
	}	