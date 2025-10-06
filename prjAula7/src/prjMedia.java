import java.util.Scanner;
public class prjMedia {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   //declaração
	   double n1,n2,media,notaNova;
	   //leitura
	   System.out.println("coloque a primeira nota");
	   n1 = in.nextDouble();
	   System.out.println("coloque a segunda nota");
	   n2 = in.nextDouble();
	   //processamento
	   media = (n1+n2)/2;
	   System.out.println(media);
	   //escolha
	   if(media<3) {
		   System.out.println("reprovado");
	   }else if(media>=6) {
		   System.out.println("aprovado");
	   }else {
		   System.out.println("aluno devera fazer exame");
		   //leitura da nota do exame 
		   System.out.println("coloque a nota do exame");
		   notaNova = in.nextDouble();
		   if(notaNova>=6) {
			   System.out.println("aprovado");
		   }else {
			   System.out.println("reprovado");
		   }
	   }
	   in.close();
   }
}
