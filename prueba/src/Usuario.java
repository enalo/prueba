
public class Usuario {
	
	/**
	 * Atributo que almacena el nombre del usuario
	 */
	private String nombre;
	/**
	 * Atributo que almacena el DNI del usuario
	 */
	private String dni;
	/**
	 * Atributo que almacena la contraseña del usuario
	 */
	private String contrasenia;
	/**
	 * Atributo que almacena el número de cuenta del usuario
	 */
	private String numCuenta;
	
	
	
	public Usuario(String nombre, String dni, String contrasenia,
			String numCuenta) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.numCuenta = numCuenta;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	/**
	 * @param numCuenta the numCuenta to set
	 */
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}


	/**
	 * @return the numCuenta
	 */
	public String getNumCuenta() {
		return numCuenta;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario \nnombre : " + nombre + "\ndni : " + dni
				+ "\ncontrasenia : " + contrasenia + "\nnumCuenta : "
				+ numCuenta;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario u1 = new Usuario("Obi", "12345678", "sable",
				"5632589614524785");
		System.out.println(u1);
		
		Usuario u2 = new Usuario("Ani", "12345679", "ladooscuro",
				"5632589614524795");
		System.out.println(u2.toString());
		
		Usuario u3 = new Usuario("Padme", "12345689", "ani",
				"5632889614524795");
		System.out.println(u3);
	}

}
