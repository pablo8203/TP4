package com.pjs.app;

import java.util.*;  // vamos a utilizar la clase Scanner y la vamos a importar

public class compras { // vamos a definir nuestra clase publica, compras
	Scanner dato = new Scanner(System.in);  // instanciamos el objeto, DATO, de la clase compras
	public void compraproducto(){   // creamos la funcion compraproducto 
		
		String nproducto = "";   // Definimos las variables de tipo string para el producto
		double precio, total; 	 // Definimos de tipo decimal, precio, total, totalpagar
		double totalpagar = 0;
		int cantidad;			// Definimos cantidad como entero
		
		System.out.println("Ingreso el nombre del producto");  // vamos a mostrar mensaje de ingreso Nombre Producto
		nproducto= dato.next();				// vamos a capturar la informacion y guardar en la variable nproducto
		System.out.println("Ingreso el precio del producto");
		precio = dato.nextDouble();
		System.out.println("Ingreso la cantidad");
		cantidad =dato.nextInt();
		total = precio * cantidad; // vamos a hacer la operacion, precio por cantidad
		System.out.println("El total es : " + total);  // vamos a imprimir el total
			if(total > 1000){  // y preguntamos, si es mayor a 1000
				System.out.println("El descuento es ; "+ total*0.20);  // si es mayor, aplico un desc de 20%
				totalpagar = total - (total*0.20); // realizo el calculo
				System.out.println("El neto a pagar es : "+totalpagar); // imprimo por pantalla el importe a pagar
			}else{ 
				System.out.println("No hay descuentos"); // caso contrario, envio msj, sin descuento
			}
	}
  public void seccion ( ) {  // creamos la funcion seccion para ver 
	  String cliente;
	  System.out.println("Ingreso el nombre del cliente"); // pedimos por pantalla que ingrrse el nombre de cliente
	  cliente = dato.next(); // capturamos el dato del nombre
	  
	  System.out.println("Ingrese el nombre de la sección de productos: ");  // pedimos que seccion usara
	  String opcion =" "; // declaramos la variable opcion y la iniciamos vacia
	  
	  System.out.println("Frutas"); // Mostramos las secciones disponiblkes
	  System.out.println("Lacteos");
	  System.out.println("Gaseosas");
	  
	  opcion = dato.next(); //guardamos el datp en opcion
	  	switch(opcion) {    // y en base a la opcion, escogemos
	  		case "frutas":  compraproducto();  break;
	  		case "lacteos":  compraproducto();  break;
	  		case "gaseosas":  compraproducto();  break;
	  		}
  	}
  public static void main (String []args){
	  compras cp = new compras();  
	  cp.seccion();
  }  
}