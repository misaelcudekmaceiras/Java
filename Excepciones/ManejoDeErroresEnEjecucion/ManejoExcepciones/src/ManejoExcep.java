
public class ManejoExcep {

	public static void main(String[] args) 
	{
		int [] vec = new int[5];
	
		/*
		vec[0]=123;
		vec[1]=234;
		vec[2]=6;
		vec[3]=66;
		vec[4]=77;
		vec[5]=11;// !!!!!!!!!!!!!!!!!!
		
		System.out.println("El Array");
		*/
		
		
		try{
			vec[0]=123;
			vec[1]=234;
			vec[2]=6;
			vec[3]=66;
			vec[4]=77;
			vec[5]=11;// !!!!!!!!!!!!!!!!!!	
			System.out.println("El manejar Array incorrectamente produce ....");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error en el Array");
			System.out.println("Se produjo una excepcion del tipo "+e);
		}
		finally
		{
			System.out.println("FIN");	
		}

		
		
		
		

	}

}
