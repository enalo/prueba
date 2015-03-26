import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Contenedor implements Comparable<Usuario>{

	ArrayList<Usuario> contUsuarios;
	TreeSet<Usuario> ordeUsuarios;
	HashMap<String, Usuario> hashUsuarios;
	
	public Contenedor() {
		contUsuarios = new ArrayList<Usuario>();
		ordeUsuarios =  new TreeSet<Usuario>();
		hashUsuarios = new HashMap<>();
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario("Obi", "12345678", "sable",
				"5632589614524785");
		Usuario u2 = new Usuario("Ani", "12345679", "ladooscuro",
				"5632589614524795");
		Usuario u3 = new Usuario("Padme", "12345689", "ani",
				"5632889614524795");
		
		Contenedor contenedor = new Contenedor();
		
		contenedor.contUsuarios.add(u1);
		contenedor.contUsuarios.add(u2);
		contenedor.contUsuarios.add(u3);
		
		System.out.println(contenedor.contUsuarios.toString());
		
//		Collections.sort(contUsuarios);
		
//		contenedor.ordeUsuarios.add(u1);
//		contenedor.ordeUsuarios.add(u2);
//		contenedor.ordeUsuarios.add(u3);
//		
//		System.out.println(contenedor.ordeUsuarios.toString());
		
		contenedor.hashUsuarios.put(u1.getDni(), u1);
		
		contenedor.hashUsuarios.put(u1.getDni(), u1);
		
		contenedor.hashUsuarios.put(u2.getDni(), u2);
		contenedor.hashUsuarios.put(u3.getDni(), u3);
		contenedor.hashUsuarios.put(u2.getDni(), u2);
		
		System.out.println(contenedor.hashUsuarios.toString());
		
		contenedor.contUsuarios.remove(u2);
		System.out.println("\n"+contenedor.contUsuarios.toString());
		
		contenedor.hashUsuarios.remove("12345679");
		System.out.println("\n"+contenedor.hashUsuarios.toString());

		System.out.println("\n"+contenedor.contUsuarios.get(0));
		System.out.println("\n"+contenedor.contUsuarios.get(1));
	}


	@Override
	public int compareTo(Usuario arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
