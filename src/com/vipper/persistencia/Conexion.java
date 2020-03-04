package com.vipper.persistencia;



import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Conexion {
	//atributos 
	
	protected MongoClient cliente;
	protected DB db;
	
	public void abrirConexion() throws UnknownHostException
	{
//		1. Conectarse con el cliente de Mongo DB
//		Equivalente a ejecutar mongo.exe
		cliente = new MongoClient("localhost", 27017);
		System.out.println("Accedió correctamente al cliente ");
//		2. Obtener la BBDD
		db = cliente.getDB("personal");
		System.out.println("la base de datos es -->"+db.getName());	
	}
	
	public void cerrarConexion() {
		cliente.close();
	}

}
