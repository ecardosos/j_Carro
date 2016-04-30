
public class PassagemMetro
{
	private static int s_numCartoes = 0;
	private int _idCartao;
	private float _creditos;
	private boolean _avulso;
	
	PassagemMetro(PassagemMetro passagem)
	{
	  _idCartao = passagem._idCartao;
	  _creditos = passagem._creditos;
	  _avulso = passagem._avulso;
	}
	
	PassagemMetro()
	{
	  _idCartao = s_numCartoes;
	  _creditos = 0;
	  _avulso = false;
	  s_numCartoes++;
	}
	
	PassagemMetro(boolean avulso)
	{
	   _idCartao = s_numCartoes;
	   _creditos = 0;
  	   _avulso = avulso;
	   s_numCartoes++;
	}
	
	PassagemMetro(float credits)
	{
	  _idCartao = s_numCartoes;
	  _creditos = credits;
	  _avulso = false;	  
	  s_numCartoes++;
	}
	
	public int getId()
	{
		return _idCartao;
	}
}
