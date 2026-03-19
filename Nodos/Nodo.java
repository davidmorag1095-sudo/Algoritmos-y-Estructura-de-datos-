public class Nodo
{
	int datos;
	Nodo siguiente;
#--------------------------------------------------
	public Nodo(int datos)
	{
		this.datos = datos;
		siguiente = null
	}
	#--------------------------------------------------
	#Set/Gets 
	public void setDatos(int datos)
	{
		this.datos = datos;
	}
	public void setSiguiente(Nodo siguiente)
	{
		this.siguiente = siguiente;
	}
	#--------------------------------------------------
	public int getDatos()
	{
		return datos
	}
	public int getSiguiente()
	{
		return siguiente;
	}
}	//Fin de la clase 
	
	
