package qwe;
//fibonacci
public class fabo {
	public static void main(String[] args) {

	    int n = 5, a = 0, b = 1;
	    System.out.println("Fibonacci Series  " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(a + ", ");


	      int nextTerm = a + b;
	      a = b;
	      b = nextTerm;
	    }
	  }
	}


