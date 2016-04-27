
public class PassagemMetro
{
	private static int s_numCartoes = 0;
	private int _idCartao;
	private float _creditos;
	
	PassagemMetro(PassagemMetro passagem)
	{
	  _idCartao = passagem._idCartao;
	  _creditos = passagem._creditos;
	}
	
	PassagemMetro()
	{
	  _idCartao = s_numCartoes;
	  _creditos = 0;
	  s_numCartoes++;
	}
	
	PassagemMetro(float credits)
	{
	  _creditos = credits;
	  _idCartao = s_numCartoes;
	  s_numCartoes++;
	}

	public void adicionarCreditos(float creditos)
	{
	  _creditos += creditos;
	}
	
	public void deduzirCreditos(float valPassagem)
	{
	  _creditos -= valPassagem;
	}
	
	public int getId()
	{
		return _idCartao;
	}
}
