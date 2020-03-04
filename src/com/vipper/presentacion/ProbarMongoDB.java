package com.vipper.presentacion;

import java.net.UnknownHostException;

import com.vipper.persistencia.AccesoPersonalDetalle;
import com.vipper.persistencia.Conexion;

public class ProbarMongoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion c1 = new Conexion();
		try {
			c1.abrirConexion();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		//Instanciar AccesoPersona
		AccesoPersonalDetalle apd1 = new AccesoPersonalDetalle();
		System.out.println("----Todos los documentos de la coleccion Detalle" );
		try {
			System.out.println(apd1.mostrarTodos());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		System.out.println("\n---- los documentos de la coleccion Detalle con edad 25" );
		try {
			System.out.println(apd1.mostrarMayorA35());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
