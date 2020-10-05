/*
 * Excepciones
 * Errores que ocurren cuando el programa se ejecuta
 * Finaliza la ejecucion del programa
 * El programa es sintacticamente correcto
 * */
public class ManejoExcepciones 
{
	public static void main(String[] args) 
	{
		int vec []=new int[3];
		vec[0]=1;
		vec[1]=0;
		vec[2]=4;
		System.out.println(vec[0]);
		System.out.println(vec[1]);
		System.out.println(vec[2]);
		System.out.println(vec[3]);
		System.out.println("Fin del programa");

	}
}
