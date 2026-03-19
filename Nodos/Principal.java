import javax.swing.JOptionPane;

public class Principal //Trabaja con Nodos enteros 
{
	public static void main(String arg[])
	{
		Operaciones operacion = new Operaciones();
		int opcion, dato, buscar;
		
		do
		{
			opcion = Integer.parseInt(JOptionPane.showInputDialog("--Seleccione una opción--"
																										+"\n1.Agregar al inicio"
																										+"\n2.Agregar al final"
																										+"\n3.Imprimir"
																										+"\n4.Agregar despues de"
																										+"\n5.Eliminar un elemento"
																										+"\n6.Eliminar lista"
																										+"\n7.Salir" "));
			switch(opcion)
			{
				case 1: //Agregar al inicio
				break;
				//--------------------------------------------------
				case 2://Agregar al final
				break;
				//--------------------------------------------------
				case 3: //Imprimir
				break;
				//--------------------------------------------------
				case 4://.Agregar despues de
				break;
				//--------------------------------------------------
				case 5://Eliminar un elemento
				break;
				//--------------------------------------------------
				case 6://Eliminar lista
				break;
				//--------------------------------------------------
				case 7://Salir
					JOptionPane.showMessageDialog(null, "--Gracias--")
					system.exit(0)
				break;
				//--------------------------------------------------
				default:
					JOptionPane.showMessageDiaog(null, "Opcion incorrecta");
			}//Fin del switch 
		}while (opcion != 7);
		
		
		
		
	}//Fin del metodo principal 
	
	
	
	
}//Fin de la clase 
