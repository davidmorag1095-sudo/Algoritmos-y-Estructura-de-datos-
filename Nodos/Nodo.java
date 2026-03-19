public class Nodo
{
	int datos;
	Nodo siguiente;
//--------------------------------------------------
	//Constructor
	public Nodo(int datos)
	{
		this.datos = datos;
		siguiente = null;
	}//Fin del constructor 
	//--------------------------------------------------
	//Set/Gets 
	public void setDatos(int datos)
	{
		this.datos = datos;
	}
	public void setSiguiente(Nodo siguiente)
	{
		this.siguiente = siguiente;
	}
	//--------------------------------------------------
	public int getDatos()
	{
		return datos;
	}
	public Nodo getSiguiente()
	{
		return siguiente;
	}
}	//Fin de la clase 
	
	
