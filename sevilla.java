package everis;

import java.util.Arrays;

public class sevilla {

	public static void main(String[] args) {
		//Vocales
		String cadena = "Sevilla hace calor";
		char[] cadenaCharArray = cadena.toCharArray();
		for(int i = 0; i < cadena.length(); i++) {
			if(Character.toString(cadenaCharArray[i]).matches("[aeiou]")){
				cadenaCharArray[i] = 'i';
			}
		}
	//Ordenar letras y numeros
		cadena = String.valueOf(cadenaCharArray);
		System.out.println("Despues: " + cadena);
		System.out.println("<--------->");
		
		String cadena2 = "l v k f e ";
		char[] cadenaCharArray2 = cadena2.toCharArray();
		System.out.println("Antes: " + cadena2);
		Arrays.sort(cadenaCharArray2);
		cadena2 = String.valueOf(cadenaCharArray2).replaceAll("", "").trim();
		System.out.println("Despues" + cadena2);
		
		//Mostrar el resto de dividir entre 20
		System.out.println("<--------------->");
		String cadena3 = "21 22 357 50485";
		String[] numeroArray = cadena3.split(" ");
		int resto;
		for(int i = 0; i < numeroArray.length; i++) {
			resto = Integer.parseInt(numeroArray[i])%20;
			System.out.println("El resultado de la division es: " + numeroArray[i] + "entre 20 es: " + resto);	
		}
		
		
	}

}
