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
		int vec[]=new int[3];
		int i=3;
		boolean div=false;
		boolean arr=false;
		
		
		
	while(div==false || arr==false){
		
		try{
			if(div==false)
			{
				System.out.println(num1/num2);
				div=true;
			}
			if(arr==false)
			{
				vec[i]=0;
				arr=true;
			}
	
		}
		catch(java.lang.ArithmeticException ex)
		{
		System.out.println("La excepcion fue "+ex);
		System.out.println("no se puede dividir");
		num2=1;
		}
		catch( java.lang.ArrayIndexOutOfBoundsException e)
		{
			System.out.println("La excepcion fue "+e);
			System.out.println("No existe en el array");
			i=0;
		}
		catch(Exception e)
		{
			System.out.println("guardar la info y salir correcta");
		}
	}
		
		System.out.println("Fin del programa");
		
		
		
		

	}
}
