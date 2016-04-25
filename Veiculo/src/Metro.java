import java.io.IOException;

public final class Metro extends Veiculo implements VeiculoTransportePassageiros
{
	 private int _primeiraClasse;
	 private int _comAcSegundaClasse;
	 private int _semAcSegundaClasse;
	 
	 private static float _valPassagem = 5.5f;
	 
	Metro()
	{
		_primeiraClasse = 0;
		_comAcSegundaClasse = 0;
		_semAcSegundaClasse = 0;
	}
	  
	Metro(int primeiraClasse, int comAcSegundaClasse, int semAcSegundaClasse)
	{
		_primeiraClasse = primeiraClasse;
		_comAcSegundaClasse = comAcSegundaClasse;
		_semAcSegundaClasse = semAcSegundaClasse;
	}
	
	@Override
	public void aceleracao()
	{
		_velocidade += 100;
	}
	
	@Override
	public void freio()
	{
		_velocidade = 0;
	}
	
	public void adicionarCreditos(PassagemMetro p)
	{
		float creditos = 0.0f;
		System.out.println("Insira a quantidade de créditos:");
		//System.in.close(Credits);
		
		p.adicionarCreditos(creditos);
	}

	public void comprarPassagem(PassagemMetro p) 
	{
	  int cod = 0;
	  System.out.println("Olá,");
	  System.out.println("Digite 1 se você deseja utilizar um ticket.");
	  System.out.println("Digite 2 se você deseja adicionar créditos.");
	  
	  switch(cod)
	  {
	  case 1:
	    p.isAvulso();
	    break;

	  case 2:
	    p.deduzirCreditos(_valPassagem);
	    break;
	  }
	}


	@Override
	public int getCapacidade() 
	{
		return _primeiraClasse + _comAcSegundaClasse + _semAcSegundaClasse;
	}
}
