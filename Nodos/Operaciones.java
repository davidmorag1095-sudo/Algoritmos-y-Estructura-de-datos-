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
			primero = nuevo
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
			ultimo = nuevo
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
	 public String agregarDespues(int datos, int buscar)
	 {
		String mensaje = "";
		
		return mensaje; 
	 }//Fin de agregarDespues
	 //--------------------------------------------------------------
	 public String eliminar(int buscar)
	 {
		String mensaje = "";
		
		return mensaje = ""; 
	 }//Fin del eliminar
	 
}//Fin de la clase
