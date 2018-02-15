import java.util.Scanner;
public class Main{
	public static void main(String[] arg){
		Scanner dat = new Scanner(System.in);
		int b, con=0, i;
		System.out.println("Este programa te permitirá saber si el numero que ingresas es primo o no");
		System.out.println("Ingresa el numero" );
		b = dat.nextInt();
		while(b<=0){
		System.out.println("No puedes ingresar numeros negativos");
		b = dat.nextInt();
		}
		for(i=1; i<(b+1); i++){
			if(b%i==0){
			con++;
			}
		}
		if(con!=2){
		System.out.println("el numero no es primo");
		}else{
		System.out.println("El numero es primo ");
		}
		System.out.println("El programa ha finalizado");
	}
}