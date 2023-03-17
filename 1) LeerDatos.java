package com.pjs.app;

import java.util.Scanner;
	public class LeerDatos{
		public static void main (String[] args){
			Scanner lectura = new Scanner (System.in);{

				System.out.println("Ingrese su nombre: ");
				String nombre = lectura.next();
				System.out.println("Ingrese su edad: ");
				int edad = lectura.nextInt();
				System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad);}

		}//cierra método main

}//cierra class
