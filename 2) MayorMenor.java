package com.pjs.app;

import java.util.*; 
	class MayorMenor {  
		public String nombre;  
		public int edad;  
		Scanner dato = new Scanner(System.in);
   public void usuario(String nombre ,int edad){  
	   System.out.println("Ingrese su nombre");
	   nombre = dato.next(); 
	   System.out.println("Ingrese la edad"); 
	   edad = dato.nextInt(); 
	   System.out.println("El nombre del usuario es " + nombre);
	   System.out.println(" y su edad es " + edad + " años \n" );
	   	if(edad <18){  
	   		System.out.println("El usuario es menor de edad");  }
	   	else{  
	   		System.out.println("El usuario es mayor de edad");  }  
	   	}  
   public static void main (String []args){ 
	 MayorMenor ObjMM = new MayorMenor ();
	 ObjMM.usuario("", 0);  
} 
}