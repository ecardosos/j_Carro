
public class PassagemMetro
{
	private static int s_numCartoes = 0;
	private int _idCartao;
	private float _creditos;
	private boolean _avulso;
	
	PassagemMetro()
	{
	  _idCartao = s_numCartoes;
	  _creditos = 0;
	  _avulso = false;
	  s_numCartoes++;
	}
	
	PassagemMetro(boolean avulso)
	{
		_creditos = 0;
		_avulso = avulso;
		_idCartao = s_numCartoes;
		s_numCartoes++;
	}
	
	PassagemMetro(float credits)
	{
	  _creditos = credits;
	  _avulso = false;
	  _idCartao = s_numCartoes;
	  s_numCartoes++;
	}

	void adicionarCreditos(float creditos)
	{
	  _creditos += creditos;
	}
	
	void deduzirCreditos(float valPassagem)
	{
	  _creditos -= valPassagem;
	}
	
	void isAvulso()
	{
	  _avulso = true;
	}
}
