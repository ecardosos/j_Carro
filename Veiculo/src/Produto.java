
public class Produto 
{
	String _nome;
	float _peso;
	
	Produto()
	{
	  _nome = "";
	  _peso = 0;
	}
	
	Produto(String nome, float peso)
	{
		_nome = nome;
		_peso = peso;
	}
	
	public String getNome()
	{
		return _nome;
	}
	
	public float getPeso()
	{
		return _peso;
	}
}
