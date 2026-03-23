import javax.swing.JOptionPane;
public class Operaciones
{
	Nodo primero, ultimo, nuevo, rec;

	public void agregarAlInicio(int datos)
	{
		//Se crea el nuevo Nodo
		nuevo = new Nodo(datos);
		
		//Validacion para verificar que el primero no este vacio 
		if (primero == null)
		{
			primero = nuevo;
			ultimo = nuevo;
		}else
		{
			nuevo.setSiguiente(primero);
			primero = nuevo;
		}
	}//Fin del agregar al inicio
	//--------------------------------------------------------------
	public void agregarAlFinal(int datos)
	{
		nuevo = new Nodo(datos);
		if(primero == null)
		{
			primero = nuevo;
			ultimo = nuevo;
		}
		else
		{
			ultimo.setSiguiente(nuevo);
			ultimo = nuevo;
		}
		
	}//Fin del agregar al final
	 //--------------------------------------------------------------
	 public String imprimir()
	 {
		String mensaje = "";
		rec = primero;
		if(primero == null)
		{
			mensaje = "La lista se encuentra vacia";
		}else
		{
			while(rec !=null)
			{
				mensaje += rec.getDatos() + "\n";
				rec = rec.getSiguiente();
			}//Fin while
		}
		return mensaje;
	 }//Fin del imprimir 
	 //--------------------------------------------------------------
	 public String agregarDespues(int buscar, int nuevoDato)
	 {
		String mensaje = "";
		rec = primero;
		if (primero == null)
		{
			mensaje = "La lista se encuentra vacia";
		}else
		{
			while (rec != null)
			{
				if(rec.getDatos() == buscar)
				{
					nuevo = new Nodo(nuevoDato);
					nuevo.setSiguiente(rec.getSiguiente());
					rec.setSiguiente(nuevo);
					mensaje = "Agregado correctamente";
					break;
				}else
				{
					rec = rec.getSiguiente();
				}
			}
		}
		return mensaje; 
	 }//Fin de agregarDespues
	 //--------------------------------------------------------------
	 public String buscar(int buscar)
	 {
		String mensaje = "";
		rec = primero;
		boolean encontrado = false;
		if (primero == null)
		{
			mensaje = "La lista se encuentra vacia, agregar datos a la lista para buscar";
		}else
		{
				while(rec != null)
				{
					if(rec.getDatos() == buscar)
					{
						JOptionPane.showMessageDialog(null, rec.getDatos());
						encontrado = true;
					}
					rec = rec.getSiguiente();
				}
		}
		return mensaje;
	 }
	 //--------------------------------------------------------------
	 public String eliminar(int buscar)
	 {
		String mensaje = "";
		rec = primero;
		Nodo anterior = null;
		
		if(primero == null)
		{
			mensaje = "ERROR! la lista esta vacia";
		}else
		{
			if(primero.getDatos() == buscar)
			{
				primero = primero.getSiguiente();
				if(primero == null)
					{
						ultimo = null;
					}
				mensaje = "Nodo eliminado correctamente"; 
			}else
			{
				while(rec != null)
				{
					if(rec.getDatos() == buscar)
					{
						anterior.setSiguiente(rec.getSiguiente());
						
						if(rec == ultimo)
						{
							ultimo = anterior;
						}
						mensaje = "Nodo eliminado correctamente";
						return mensaje;
					}
					anterior = rec;
					rec = rec.getSiguiente();
				}
			}
			mensaje = "ERROR! no se encontro nodo en la lista";
		}
		return mensaje = ""; 
	 }//Fin del eliminar
	 //--------------------------------------------------------------
	 //Eliminar lista 
	 public String eliminarLista()
	 {
		String mensaje = ""; 
		rec = primero;
		
		if (primero  == null)
		{
			JOptionPane.showMessageDialog(null,"La lista esta vacia!");
		}else
		{
			primero = null;
			ultimo = null; 
			mensaje = "Lista eliminada con exito!";
		}
		return mensaje;
	 }
	 
	 
	 
}//Fin de la clase
