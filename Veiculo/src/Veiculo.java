
public abstract class Veiculo 
{
	  float _velocidade;
	  float _velocidadeMax;
	  String _cor;
	  Pessoa _nome;
	  
	  Veiculo()
	  {
		_velocidade = 0;
		_velocidadeMax = 0;
		_cor = "";
		_nome = new Pessoa();
	  }
	  
	  Veiculo(String cor, float velocidadeMax)
	  {
		  _velocidade = 0;
		  _velocidadeMax = velocidadeMax;
		  _cor = cor;
		  _nome = new Pessoa();
	  }
	  
	  public void aceleracao()
	  {
		  
	  }
	  
	  public void freio()
	  {
		  
	  }
	  
	  public float getVelocidade()
	  {
		  return _velocidade;
	  }
	  
	  public void setDono(Pessoa nome)
	  {
		  _nome = nome;
	  }
}