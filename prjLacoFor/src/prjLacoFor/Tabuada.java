package prjLacoFor;

public class Tabuada {

	public static void main(String[] args) {
		int i,n,r;
		for(i=1;i<=10;i++) {
			for(n=1;n<=10;n++) {
				r=n*i;
				System.out.println(n+"x"+i+"="+r);
			}
		}
	}

}
