import javax.swing.JOptionPane;


public class ExcepcionString 
{

	public static void main(String[] args) 
	{
	String valor;
	int num;
	boolean ok=false;

		while(ok==false)
		{
			try
			{
				valor=JOptionPane.showInputDialog(null,"Ingrese un numero");
				num=Integer.parseInt(valor);
				System.out.println("El numero ingresado es "+num);
				ok=true;
			}
			catch(java.lang.NumberFormatException e)
			{
				System.out.println("No ingreso un numero");
			}
		}
	}
		
	}
	


