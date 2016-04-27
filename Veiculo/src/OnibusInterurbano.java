
public final class OnibusInterurbano extends Veiculo implements VeiculoTransportePassageiros
{
	
	private int _numAssentos;
	
	OnibusInterurbano()
	{
		_numAssentos = 0;
	}
	
	OnibusInterurbano(OnibusInterurbano onibus)
	{
		_numAssentos = onibus._numAssentos;
	}
	
	
	OnibusInterurbano(int numAssentos)
	{
		_numAssentos = numAssentos;
	}

	@Override
	public void aceleracao()
	{
		_velocidade += 3;
	}
	
	@Override
	public void freio()
	{
		_velocidade -=3;
	}

	@Override
	public int getCapacidade() 
	{
		return _numAssentos;
	}

	@Override
	public void comprarPassagem()
	{
		
	}
	
	
}
