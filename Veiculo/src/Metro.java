import java.util.Scanner;

public final class Metro extends Veiculo implements VeiculoTransportePassageiros
{
	Scanner in = new Scanner(System.in);
	
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
	
	public void adicionarCreditos()
	{
		float creditos;
		
		PassagemMetro passagem = new PassagemMetro();
		
		System.out.println("Insira a quantidade de créditos:");
		creditos = in.nextFloat();
		
		passagem.adicionarCreditos(creditos);
		
		System.out.println("O seu ID é: " + passagem.getId());
	}

	@Override
	public void comprarPassagem()
	{
	   PassagemMetro passagem = new PassagemMetro();
	   int id;
	   System.out.println("digite o seu ID:");
	   id = in.nextInt();
	   
	   passagem.deduzirCreditos(_valPassagem);
	}

	@Override
	public int getCapacidade() 
	{
		return _primeiraClasse + _comAcSegundaClasse + _semAcSegundaClasse;
	}
	
	public void proximaEstacao(String proximaEstacao)
	{
		
		System.out.println("Próxima estação... " + proximaEstacao);
	}
}
