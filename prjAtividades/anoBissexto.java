import java.util.Scanner;
public class anoBissexto {
    public static void main(String[]args) {
    	Scanner in = new Scanner(System.in);
    	//declaração de variavel
    	int ano;
    	//leitura
    	System.out.println("coloque o  ano");
    	ano = in.nextInt();
    	//escolha
    	if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
    	System.out.println("é um ano bissexto" + ano);
    	}else {
    		System.out.println("é um ano normal " + ano);
    	}
    	in.close();
    }
}
