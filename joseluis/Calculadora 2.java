package Proyecto1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num_uno, num_dos, resultado;		
		String tecla=null;
		
		do {
		System.out.println("******Has iniciado la calculadora******");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		System.out.println("Selecciona un numero de operacion: ");
		int opcion;
		opcion =  sc.nextInt();
		
		switch(opcion){
			case 1:
				System.out.print("Digita el primer numero: ");
				num_uno = sc.nextDouble();
				System.out.print("Digita el segundo numero: ");
				num_dos = sc.nextDouble();
				resultado = num_uno + num_dos;
				System.out.println("La suma de los numeros es: " + resultado);				
				break;
			case 2:
				System.out.print("Digita el primer numero: ");
				num_uno = sc.nextDouble();
				System.out.print("Digita el segundo numero: ");
				num_dos = sc.nextDouble();
				resultado = num_uno - num_dos;
				System.out.println("La resta de los numeros es: " + resultado);
				break;
			case 3:
				System.out.print("Digita el primer numero: ");
				num_uno = sc.nextDouble();
				System.out.print("Digita el segundo numero: ");
				num_dos = sc.nextDouble();
				resultado = num_uno * num_dos;
				System.out.println("La multiplicacion de los numeros es: " + resultado);
				break;
			case 4:
				System.out.print("Digita el primer numero: ");
				num_uno = sc.nextDouble();
				System.out.print("Digita el segundo numero: ");
				num_dos = sc.nextDouble();
				resultado = num_uno / num_dos;
				System.out.println("La division de los numeros es: " + resultado);
				break;
				default: 
					System.out.println("Opcion invalida, vuelve a seleccionar una opcion correcta");
					break;
					
		}	
		System.out.print("\n�Quiere seguir?\n");
		System.out.print("Presione �S� para continuar: ");
		tecla = new Scanner(System.in).nextLine();
		} while (tecla.equals("s") || tecla.equals("S"));
		
			System.out.println("****Gracias por utilizar el programa****");
	}

}
