import javax.swing.JOptionPane;


public class ManejoExcepJOption {

	public static void main(String[] args) 
	{
		String stValor;
		int intValor=0;
		boolean mal=true;
		int repe=4;
		stValor=JOptionPane.showInputDialog("Ingrese un valor");
		System.out.println("el valor ingresado es "+stValor);
		
		stValor=JOptionPane.showInputDialog("Ingrese un valor numerico");
		System.out.println("el valor ingresado es "+stValor);
		intValor=Integer.parseInt(stValor);
		System.out.println("el valor numerico ingresado y convertido a int es "+intValor);
		
		while(mal==true && repe>0)
		{
			try 
			{
			stValor=JOptionPane.showInputDialog("Ingrese un valor numerico");
			System.out.println("el valor ingresado es "+stValor);
			intValor=Integer.parseInt(stValor);
			mal=false;
			

			
			System.out.println("el valor numerico ingresado y convertido a int es "+intValor);	
			}catch(Exception e)
			{
				System.out.println("Valor incorrecto genero una excepcion" + e);
				System.out.println("Ingrese un valor numerico");
				//
				repe--;
				mal=true;
			}

			
		}
				
		
		
		
		
		
		
		

	}

}
