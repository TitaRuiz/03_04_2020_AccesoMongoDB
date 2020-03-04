package com.vipper.persistencia;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.vipper.modelo.Persona;

public class AccesoPersonalDetalle extends Conexion {
	// atributo de colección
	public DBCollection detalle;

	public List<Persona> mostrarTodos() throws UnknownHostException {


		// 1. Definicion de variables
		List<Persona> todos = new ArrayList<Persona>();
		DBCursor rs;
		BasicDBObject documentoJson;
		// 2. Abrir conexion - Conectarse al cliente
		abrirConexion();
		// 3. Obtener la colección
		detalle = db.getCollection("detalle");
		System.out.println("Obtiene la colección -->" + detalle.getFullName());
		System.out.println("Contiene " + detalle.count() + " documentos ");
		// 4. Obtener todos los documentos de la colección
		rs = detalle.find();
		// 5. bucle para obtener los documentos
		while (rs.hasNext()) { // Verifica si hay documentos en la colección
			documentoJson = (BasicDBObject) rs.next();
			todos.add(new Persona(documentoJson.getString("name"), documentoJson.getInt("age"),
					documentoJson.getString("email"), documentoJson.getString("gender")));
		}
		// 6. Cerrar el cliente
		cerrarConexion();
		return todos;

	}
	
	public List<Persona> mostrarMayorA35() throws UnknownHostException {


		// 1. Definicion de variables
		List<Persona> todos = new ArrayList<Persona>();
		DBCursor rs;
		BasicDBObject documentoJson;
		// 2. Abrir conexion - Conectarse al cliente
		abrirConexion();
		// 3. Obtener la colección
		detalle = db.getCollection("detalle");
		System.out.println("Obtiene la colección -->" + detalle.getFullName());
		System.out.println("Contiene " + detalle.count() + " documentos ");
		// 4. Obtener todos los documentos de la colección
		BasicDBObject query = new BasicDBObject("age", new BasicDBObject("$gt", 35)) ;
		System.out.println("query " + query.toString());
		rs = detalle.find(query);
	
		// 5. bucle para obtener los documentos
		while (rs.hasNext()) { // Verifica si hay documentos en la colección
			documentoJson = (BasicDBObject) rs.next();
			todos.add(new Persona(documentoJson.getString("name"), documentoJson.getInt("age"),
					documentoJson.getString("email"), documentoJson.getString("gender")));
		}
		// 6. Cerrar el cliente
		cerrarConexion();
		return todos;

	}
	
}
