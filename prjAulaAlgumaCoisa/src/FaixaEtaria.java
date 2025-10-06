import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
      int i,t=0,f1=0,f2=0,f3=0,f4=0,f5=0,idade,p1,p2,p3,p4,p5;
      do {
    	  System.out.println("coloque a idade");
    	  idade =in.nextInt();
    	  if(idade<=15) {
    		  System.out.println("faixa etária 1");
    		  t++;
    		  f1++;
    	  }else if(idade<=30) {
    		  System.out.println("faixa etária 2");
    		  t++;
    		  f2++;
    	  }else if(idade<=45) {
    		  System.out.println("faixa etária 3");
    		  t++;
    		  f3++;
    	  }else if(idade<=60) {
    		  System.out.println("faixa etária 4");
    		  t++;
    		  f4++;
    	  }else if(idade>=61) {
    		  System.out.println("faixa etária 5");
    		  t++;
    		  f5++;
    	  }
    	  System.out.println("deseja continuar aperte 1 se não aperte outro númmero");
    	  i = in.nextInt();
      }while(i==1);
      System.out.println("faixa etária 1 = "+f1);
      System.out.println("faixa etária 2 = "+f2);
      System.out.println("faixa etária 3 = "+f3);
      System.out.println("faixa etária 4 = "+f4);
      System.out.println("faixa etária 5 = "+f5);
      p1=(f1*100)/t;
      p2=(100*f2)/t;
      p3=(100*f3)/t;
      p4=(100*f4)/t;
      p5=(100*f5)/t;
      System.out.println("faixa etária 1 = "+p1+"%");
      System.out.println("faixa etária 2 = "+p2+"%");
      System.out.println("faixa etária 3 = "+p3+"%");
      System.out.println("faixa etária 4 = "+p4+"%");
      System.out.println("faixa etária 5 = "+p5+"%");
	}

}
