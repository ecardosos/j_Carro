
public class PassageiroMetro 
{
	private String _nome;
	private int _id = 0;
	private float _creditos;
	
	PassageiroMetro(String nome, int id)
	{
		_nome = nome;
		_creditos = 0;
		_id = id;
	}
	
	public String getnome()
	{
		return _nome;
	}
	
	public float getCreditos()
	{
		return _creditos;
	}
	
	public void adicionarCreditos(float creditos)
	{
		_creditos += creditos;
	}
	
	public void deduzirCreditos(float valorPassagem)
	{
		_creditos -= valorPassagem;
	}
	
	public int getId()
	{
		return _id;
	}
}
