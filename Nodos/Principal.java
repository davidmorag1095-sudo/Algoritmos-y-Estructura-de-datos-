import javax.swing.JOptionPane;

public class Principal //Trabaja con Nodos enteros 
{
	public static void main(String arg[])
	{
		Operaciones operacion = new Operaciones();
		int opcion, dato, buscar, nuevoDato;
		
		do
		{
			opcion = Integer.parseInt(JOptionPane.showInputDialog("--Seleccione una opción--"
																										+"\n1.Agregar al inicio"
																										+"\n2.Agregar al final"
																										+"\n3.Imprimir"
																										+"\n4.Agregar despues de"
																										+"\n5.Buscar"
																										+"\n6.Eliminar un elemento"
																										+"\n7Eliminar lista" 
																										+"\n8.Salir" ));
			switch(opcion)
			{
				case 1: //Agregar al inicio
					dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Nodo: "));
					operacion.agregarAlInicio(dato);
					JOptionPane.showMessageDialog(null, "Agregado con exito");
				
				break;
				//--------------------------------------------------
				case 2://Agregar al final
					dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Nodo"));
					operacion.agregarAlFinal(dato);
					JOptionPane.showMessageDialog(null, "Agregado al final con exito"); 
				break;
				//--------------------------------------------------
				case 3: //Imprimir
					JOptionPane.showMessageDialog(null, operacion.imprimir());
				break;
				//--------------------------------------------------
				case 4://.Agregar despues de
					buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el nodo en el que desea agregar un nuevo nodo adelante"));
					nuevoDato = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del Nodo a agregar"));
					operacion.agregarDespues(buscar, nuevoDato);
					JOptionPane.showMessageDialog(null, "Agregado correctamente");
				break;
				//--------------------------------------------------
				case 5://Buscar
					
				break;
				//--------------------------------------------------
				case 6://Eliminar un elemento
				break;
				//--------------------------------------------------
				case 7://Eliminar lista
				break;
				//--------------------------------------------------
				case 8://Salir
					JOptionPane.showMessageDialog(null, "--Gracias--");
					System.exit(0);
				break;
				//--------------------------------------------------
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}//Fin del switch 
		}while (opcion != 7);
		
		
		
		
	}//Fin del metodo principal 
	
	
	
	
}//Fin de la clase 
