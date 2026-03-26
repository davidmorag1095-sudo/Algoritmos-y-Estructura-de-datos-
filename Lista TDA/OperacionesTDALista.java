//Clase con las operaciones del TDA lista con enteros 

public class OperacionesTDALista
{
	Nodo primero, ultimo, rec, nuevo;
	private int contador = 0;
	int pos;
	
//--------------------------------------------			
	public void inserta(int datos, int posicion)
	{
			nuevo = new Nodo(datos);
			if(esVacia())
			{
				primero = nuevo;
				ultimo = nuevo;
			
			}//Fin del if
			else
			{
				if(pos == 0)
				{
					nuevo.setSiguiente(primero);
					primero = nuevo;
				}//Fin del if
				else
				{
					if(pos>=contador)
					{
						ultimo.setSiguiente(nuevo);
						ultimo = nuevo;
					}//Fin del if
					else
					{
						rec = primero;
						for(int i=0;i<pos-1; i++)
						{
							rec = rec.getSiguiente();
							nuevo.setSiguiente(rec.getSiguiente());
							rec.setSiguiente(nuevo);
						}//Fin del for 
					}//Fin del else
				}//Fin del else 
			}//Fin del else
			contador++;
	}//Fin del metodo insertar
//--------------------------------------------			
	public void anula()
	{
		primero = null;
		ultimo = null;
		contador = 0;
	}//Fin del metodo anula
//--------------------------------------------		
	public int primero()
	{
		if(primero !=null)
		{
			return primero.getDatos();
		}
		return -1;
//--------------------------------------------		
	}//Fin del metedo primero
	
	public String imprimirLista()
	{
		rec = primero;
		String mensaje = "";
		
		if(esVacia())
		{
			while(rec != null)
			{
				mensaje += rec.getDatos();
				rec.getSiguiente();
			}//Fin del for
			return mensaje;	
		}//Fin del if
		else
		{
			mensaje ="La lista esta vacia";
		}
		return mensaje;
	
	}//Fin del metodo imprimir lista
//--------------------------------------------			
	public boolean esVacia()
	{
		if(primero == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}//Fin del metodo es vacia 
//--------------------------------------------		
	public int localiza(int x)
	{
		int posicion = 0; 
		rec = primero;
		
		while(rec != null)
		{
			if(rec.getDatos() == x)
			{
				return posicion;	
			}
			rec = rec.getSiguiente();
			posicion ++;
		}
		return -1;
	}//Fin del localiza
//--------------------------------------------
		public int recuperar(int p)
	{
		int posicion = 0; 
		rec = primero;
		
		while(rec != null)
		{
			if(rec.getDatos() == p)
			{
				return posicion;	
			}
			rec = rec.getSiguiente();
			posicion ++;
		}
		return -1;
	}//Fin del localiza
	
	
	
	
}//Fin de la clase 
