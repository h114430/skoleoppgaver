package innlevering;

import java.util.Scanner;

class fakultetprog {
	
  public static void main(String args[]) {
	  
    int n, k, t = 1;

    System.out.println("Tast inn et tall for å regne ut fakultet:");
    Scanner fak = new Scanner(System.in);
    n = fak.nextInt();

    if (n < 0)
      System.out.println("Ugyldig inntasting");
    else
    	
    {
      for (k = 1; k <= n; k++)
        t = t*k;

      System.out.println(n+" fakultet er = "+t);
      
    }
    
  }
  
}