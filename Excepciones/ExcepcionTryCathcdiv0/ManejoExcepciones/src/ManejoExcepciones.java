/*
 * Excepciones
 * Errores que ocurren cuando el programa se ejecuta
 * Finaliza la ejecucion del programa
 * El programa es sintacticamente correcto
 * 
 * dividir 0
 * array fuera del limite
 * creo un archivo y no hay espacio
 * creo un archivo y ya existe con ese nombre
 * leer un archivo y no existe
 * red
 * base datos
 * 
 * */
public class ManejoExcepciones 
{
	public static void main(String[] args) 
	{
	
		
		int num1=4;
		int num2=0;
		
		try{
		System.out.println(num1/num2);
		}
		catch(Exception ex)
		{
		System.out.println("La excepcion fue "+ex);
		System.out.println("no se puede dividir");
		}
		
		
		System.out.println("Fin del programa");
		
		
		
		

	}
}
