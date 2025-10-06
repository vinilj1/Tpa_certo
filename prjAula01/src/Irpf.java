import java.util.Scanner;
public class Irpf {
    public static void main(String[]args) {
    	Scanner in = new Scanner(System.in);
    	double salario,irpf;
    	 System.out.println("colque o salário");
    	 salario = in.nextDouble();
    	 if(salario==1434.59) {
    		 System.out.println(salario);
    	 }else if(salario<2150) {
    		 irpf = salario*7.5/100-107.59;
    		 System.out.println(irpf);
    	 }else if(salario<2866.70) {
    		 irpf = salario*15/100-268.84;
    		 System.out.println(irpf);
    	 }else if(salario<3582) {
    		 irpf = salario*22.5/100-483.84;
    		 System.out.println(irpf);
    	 }else {
    		 irpf = salario*27.5/100-662.94;
    		 System.out.println(irpf);
    	 }
    }
}
