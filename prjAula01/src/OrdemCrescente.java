import java.util.Scanner;
public class OrdemCrescente {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   int a,b,c;
	   System.out.println("coloque o primeiro valor");
	   a = in.nextInt();
	   System.out.println("coloque o segundo valor");
	   b = in.nextInt();
	   System.out.println("coloque o terceiro valor");
	   c = in.nextInt();
	   if(a>b&&b>c) {
		   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);
	   }else if(b>a&&a>c) {
		   System.out.println(b);
		   System.out.println(a);
		   System.out.println(c);
	   }else if(c>b&&b>a) {
		   System.out.println(c);
		   System.out.println(b);
		   System.out.println(a);
	   }else if(a>c&&c>b) {
		   System.out.println(a);
		   System.out.println(c);
		   System.out.println(b);
	   }else if(c>a&&a>b) {
		   System.out.println(c);
		   System.out.println(a);
		   System.out.println(b);
	   }
   }
}
