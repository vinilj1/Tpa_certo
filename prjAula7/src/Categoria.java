import java.util.Scanner;
public class Categoria {
  public static void main(String[]args) {
    Scanner in = new Scanner(System.in);
    //declarração
    int idade;
    //leitura
    System.out.println("coloque a idade");
    idade = in.nextInt();
    //escolha
    if(idade>=5&&idade<=8) {
    	 System.out.println("infantil");
    }else if(idade>=9&&idade<=13) {
    	 System.out.println("juvenil A");
    }else if(idade>=14&&idade<=17) {
    	 System.out.println("juvenil B");
    }else {
    	 System.out.println("adulto");
    }
    in.close();
  }
}
