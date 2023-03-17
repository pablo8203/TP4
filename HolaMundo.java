package com.pjs.app;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = new Scanner(System.in);{
			
			System.out.println("Ingrese su nombre");
			String nombre = lectura.next();
			
			System.out.println("Ingrese el apellido: ");
			String apellido = lectura.next();
			
			System.out.println("Ingrese su edad ");
			int edad = lectura.nextInt();

			System.out.println("Mi nombre es: " + nombre + "Y mi apellido es: " + apellido + "y tengo: " + edad + " años ");
			
			if (edad < 18) {
				System.out.println("La persona es menor de edad");}
			else {
				System.out.println("La persona es mayor de edad");}
			}
		}
		
		//String nombre = "Jose";
		//String apellido = "Rodriguez";
		//int edad = 35;
				
		
}


