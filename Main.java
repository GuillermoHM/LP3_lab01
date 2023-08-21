import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vida, rp;
		boolean fl=false;
		vida=0;
		Scanner sc= new Scanner(System.in);
		do {
			vida++;
			System.out.println("Vida: "+ vida +"\t¿Cuál es el número secreto?");
			rp= sc.nextInt();
			if(rp==2152)//antigua clave:1234
				fl= true;
		}while(vida < 3 && !fl );
		if (fl==true)
			System.out.println("Adivinaste!!");
		else
			System.out.println("Has perdido");
		sc.close();//se deben cerrar los recursos de entrada o salida
	}
}
