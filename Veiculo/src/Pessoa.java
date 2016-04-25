
public class Pessoa 
{
	private String _nome;
	private Data _dataDeNascimento;
	
	Pessoa()
	{
		_nome = "";
		_dataDeNascimento = new Data(0, 0, 0);
	}
	
	Pessoa(String n, Data dataNascimento)
	{
		_nome = n;
		_dataDeNascimento = dataNascimento;
	}
	
	public void setNome(String n)
	{
		_nome = n;
	}
	
	public String getNome()
	{
		return _nome;
	}
	
	public void setDataNascimento(int dia, int mes, int ano)
	{
		_dataDeNascimento.setDia(dia);
		_dataDeNascimento.setMes(mes);
		_dataDeNascimento.setAno(ano);
	}
	
	public Data getDataNascimento()
	{
		return _dataDeNascimento;
	}
}
