package ejercicio3;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Numero {
	
	public static void main(String[] args) {
		
	
	}
	

	public static int getEdad(LocalDate cumpleanos){
		LocalDate ahora = LocalDate.now();
	
		return (int) ChronoUnit.YEARS.between(cumpleanos, ahora); 
		
	}
	
  
}
