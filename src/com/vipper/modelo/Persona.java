package com.vipper.modelo;

public class Persona {
	//Atributos
	private String id;
	private String nombre;
	private int edad;
	private String email;
	private String genero;
	private double sueldo;
	private String empresa;
	private String telefono;
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", genero=" + genero
				+ ", sueldo=" + sueldo + ", empresa=" + empresa + ", telefono=" + telefono + "]\n";
	}
	
	//Constructores
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int edad, String email, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.genero = genero;
	}
	
	public Persona(String id,
			String nombre, 
			int edad, 
			String email, 
			String genero, 
			double sueldo, 
			String empresa,
			String telefono) {
		
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.genero = genero;
		this.sueldo = sueldo;
		this.empresa = empresa;
		this.telefono = telefono;
	}
	//metodos
	public static double convertirSueldo(String sueldoMongoDB) {
		//Quita el dolar de la primera posición
		String sueldoSinDolar = sueldoMongoDB.substring(1, sueldoMongoDB.length());
//		System.out.println("sueldo sin dolar" + sueldoSinDolar);
		//Quita la coma
		sueldoSinDolar = sueldoSinDolar.replace(",", "");
//		System.out.println("Sueldo sin coma" + sueldoSinDolar);
		return Double.parseDouble(sueldoSinDolar);
	}

	//Setters y Getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	
	
	
   

}
