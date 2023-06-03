import java.util.Random;
import java.util.Scanner;

public class CaraCruz{
    public static void main(String args[]){
        Random numAleatorio = new Random();
		Scanner teclado = new Scanner(System.in);

		// Genera un boolean de forma aleatoria
		boolean moneda = numAleatorio.nextBoolean();
		System.out.print("Cara (1) o Cruz (0) ??? ");
		int eleccion = teclado.nextInt();

		if (eleccion == 1 && moneda) {
			System.out.println("Cara...Ganaste!!!");
		} else if(eleccion == 0 && !moneda) {
			System.out.println("Cruz...Ganaste!!!");
		}
		else{
			System.out.println("Perdiste");
			if(moneda){
				System.out.println("Cara");
			}
			else{
				System.out.println("Cruz");
			}
		}
    }
}