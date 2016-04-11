
public final class Metro extends Veiculo implements VeiculoTransportePassageiros
{
	 private int primeiraClasse;
	 private int comAcSegundaClasse;
	 private int semAcSegundaClasse;
	 
	Metro()
	{
		  
	}
	  
	Metro(int primClass, int acSegClass, int noAcSegClass)
	{
		  
	}
	
	@Override
	public void aceleracao()
	{
		
	}
	
	@Override
	public void freio()
	{
		
	}

	@Override
	public void comprarPassagem() 
	{
				
	}

	@Override
	public int getCapacidade() 
	{
		return primeiraClasse + comAcSegundaClasse + semAcSegundaClasse;
	}

	@Override
	public int getPassageiros() 
	{
		return 0;
	}

}
