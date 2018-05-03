package ejercicio5;

import java.util.regex.Pattern;

public class Coche {

	static final private Pattern REGEX = Pattern.compile("^(\\d{4})[\\s-]?([B-Z&&[^EIOUQ]]{3})$");
	
	public static boolean checkearMatricula(String matricula) throws MatriculaNoValidaException{
		if(!REGEX.matcher(matricula).matches())
			throw new MatriculaNoValidaException("El formato de la matricula es inválida");
		return true;
			
	}
}
