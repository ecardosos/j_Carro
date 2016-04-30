
public class PassagemOnibusInterurbano
{
	private String _passageiro;
	private String _origem;
	private String _destino;
	private Data _dataDeSaida;
	private Data _dataDeChegada;
	private float _preco;
	private boolean _pago;
	
	PassagemOnibusInterurbano(String nome, String origem, String destino, float preco)
	{
		_passageiro = nome;
		_origem = origem;
		_destino = destino;	
		_preco = preco;
		_pago = false;
	}
	
	public String getNome()
	{
		return _passageiro;
	}
	
	public void setDataDeSaida(Data data)
	{
		_dataDeSaida = data;
	}
	
	public void setDataDeChegada(Data data)
	{
		_dataDeChegada = data;
	}
	
	public String getOrigem()
	{
		return _origem;
	}
	
	public String getDestino()
	{
	    return _destino; 	
	}
	
	public void efetuarPagamento()
	{
		_pago = true;
	}
}
