import java.util.Scanner;
public class Idade3 {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	   //declaração de varíavel
	  int anoNas,anoAtual,idade;
	   System.out.println("coloque o ano de nascimento");
	   anoNas = in.nextInt();
	   System.out.println("coloque o ano atual");
	   anoAtual = in.nextInt();
	     //processamento
	   idade = anoAtual - anoNas;
	          //tomada de desição
	     System.out.println("sua idade é = " + idade);
	     if(idade<10){
	    	 System.out.println("você é uma criança");
	     }else if(idade<18){
	    	 System.out.println("você é um adolesente");
	     }else if(idade<65) {
	    	 System.out.println("você é um adulto");
	     }else {
	    	 System.out.println("você é velho");
	     }
	  in.close();
  }//fim do método main 
}
