import java.util.Scanner;
public class salario {
	public static void main(String args[]){
   Scanner in= new Scanner (System.in);
   Double salario;
   System.out.println("coloque o salário");
   salario = in.nextDouble();
   System.out.println(salario);
   if(salario<1302) {
	System.out.println("menor que o salário minímo");
}else if(salario>1302) {
	System.out.println("maior que o salário minímo");
   } 
 }
}
