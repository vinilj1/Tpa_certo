import java.util.Scanner;
public class Media {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   double n1,n2,n3,media;
	   System.out.println("coloque a primeira nota");
	   n1 = in.nextDouble();
	   System.out.println("coloque a segunda nota");
	   n2 = in.nextDouble();
	   System.out.println("coloque a tercaira nota");
	   n3 = in.nextDouble();
	   media = n1+n2+n3/3;
	   System.out.println(media);
	   if(media<3) {
		   System.out.println("reprovado");
	   }else if(media>6) {
		   System.out.println("aprovado");
	   }else if(media>3&&media<6) {
		   System.out.println("chamar para exame");
	   }
	   in.close();
   }
}
