import java.util.Calendar;


public class Sesion {

	private Calendar fecha;
	
	public Sesion(Calendar fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the fecha
	 */
	public Calendar getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sesion [fecha=" + fecha.getTime() + "]";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fecha = Calendar.getInstance();
		fecha.set(2014, 9, 9, 14, 30);
		Sesion sesion = new Sesion(fecha);
		System.out.println(sesion.toString());
	}

}
