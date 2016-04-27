
public class Estacao
{

	public static void main(String[] args)
	{
		int n = 5;
		
		Veiculo[] _veiculos = new Veiculo[n];
		
		_veiculos[0] = new Caminhao();
		_veiculos[0].aceleracao();
		
		_veiculos[1] = new OnibusInterurbano();
		_veiculos[1].aceleracao();
		
		_veiculos[2] = new Metro();
		_veiculos[2].aceleracao();
		
		_veiculos[3] = new OnibusInterurbano();
		_veiculos[3].aceleracao();
		
		_veiculos[4] = new Metro();
		_veiculos[4].aceleracao();
		
		for(Veiculo veiculo : _veiculos)
		{
			veiculo.aceleracao();
		}
		
		for(Veiculo veiculo : _veiculos)
		{
			if (veiculo instanceof Metro)
			{
				((Metro) veiculo).proximaEstacao("UFPA.");
			}
		}
		
		for(Veiculo veiculo : _veiculos)
		{
			veiculo.freio();
		}

	}
}
