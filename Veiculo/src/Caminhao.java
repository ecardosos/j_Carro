import java.util.ArrayList;

public final class Caminhao extends Veiculo implements VeiculoTransporteCarga
{
	  ArrayList<Produto> _produtos;
	  private float _pesoDaCargaAtual;
	  private float _capacidadeMax;
	  private int _numContainers;
	  private int _comprimento;
	
	  Caminhao(Caminhao caminhao)
	  {
		  _pesoDaCargaAtual = caminhao._pesoDaCargaAtual;
		  _numContainers = caminhao._numContainers;
		  _capacidadeMax = caminhao._capacidadeMax;
		  _comprimento = caminhao._comprimento;
	  }
	  
	  Caminhao()
	  {
		  super();
		  _pesoDaCargaAtual = 0;
		  _numContainers = 0;
		  _capacidadeMax = 0;
		  _comprimento = 0;
	  }
	  
	  Caminhao(int numContainers, float capacidadeMax, int comprimento)
	  {
		  super("", 50);
		  _pesoDaCargaAtual = 0;
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

	  public float getCapacidade() 
	  {
			return _capacidadeMax;
	  }

	  public float getComprimento() 
	  {
			return _comprimento;
	  }

	@Override
	public void carregarProdutos(Produto produto) 
	{
		if(produto.getPeso() + _pesoDaCargaAtual > _capacidadeMax)
		{
			System.out.print("não é possível adicionar o item.");
			return;
		}
		
		_pesoDaCargaAtual += produto.getPeso();
		_produtos.add(produto);
		
	}
		
	    }
