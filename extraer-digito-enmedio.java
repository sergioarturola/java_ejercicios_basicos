/*
De un numero de 5 cifras (verificar que sea de 5 cifras) extraer el digito de
enmedio, si es par sumarle 6 si es impar restarle 2
*/
package main;

public class Main {

	public static void main(String[] args) {
		int numero = 12845;
		
		String num = String.valueOf(numero);
		
		if(num.length() == 5) {
			String []numlist = num.split("");
			int enmedio = Integer.valueOf(numlist[2]);
			enmedio = enmedio%2 == 0 ? enmedio += 6 : enmedio -2;
			System.out.println(enmedio);			
		}
		else {
			System.out.println("El numero no es de 5 digitos");
		}
	}

}
