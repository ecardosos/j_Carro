
public final class Caminhao extends Veiculo implements VeiculoTransporteCarga
{
	  private int _capacidadeMax;
	  private int _numContainers;
	  private int _comprimento;
	
	  Caminhao(Caminhao caminhao)
	  {
		  _numContainers = caminhao._numContainers;
		  _capacidadeMax = caminhao._capacidadeMax;
		  _comprimento = caminhao._comprimento;
	  }
	  
	  Caminhao()
	  {
		  _numContainers = 0;
		  _capacidadeMax = 0;
		  _comprimento = 0;
	  }
	  
	  Caminhao(int numContainers, int capacidadeMax, int comprimento)
	  {
		  _numContainers = numContainers;
		  _capacidadeMax = capacidadeMax;
		  _comprimento = comprimento;
	  }
	  
	  public int getContainers()
	  {
		  return _numContainers;
	  }
	  
	  @Override
	  public void aceleracao()
	  {
		  _velocidade += 3;
	  }
	  
	  @Override
	  public void freio()
	  {
		  _velocidade -= 3;
	  }

	 @Override
	 public float getCapacidade() 
	 {
		return _capacidadeMax;
	 }

	 @Override
	 public float getComprimento() 
	 {
		return _comprimento;
	 }
}
