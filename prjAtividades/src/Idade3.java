import java.util.Scanner;
public class Idade3 {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	   //declara��o de var�avel
	  int anoNas,anoAtual,idade;
	   System.out.println("coloque o ano de nascimento");
	   anoNas = in.nextInt();
	   System.out.println("coloque o ano atual");
	   anoAtual = in.nextInt();
	     //processamento
	   idade = anoAtual - anoNas;
	          //tomada de desi��o
	     System.out.println("sua idade � = " + idade);
	     if(idade<10){
	    	 System.out.println("voc� � uma crian�a");
	     }else if(idade<18){
	    	 System.out.println("voc� � um adolesente");
	     }else if(idade<65) {
	    	 System.out.println("voc� � um adulto");
	     }else {
	    	 System.out.println("voc� � velho");
	     }
	  in.close();
  }//fim do m�todo main 
}
