import java.util.Scanner;
import java.util.ArrayList;

public final class Metro extends Veiculo implements VeiculoTransportePassageiros
{
	 Scanner in = new Scanner(System.in);
	 
	 ArrayList<PassagemMetro> _passagens;
	 ArrayList<PassageiroMetro> _passageiros;
	 
	 private static int globalId = 0;
	
	 private int _primeiraClasse;
	 private int _comAcSegundaClasse;
	 private int _semAcSegundaClasse;
	 
	 private static float _valPassagem = 5.5f;
	 
	 Metro(Metro metro)
	{
		_primeiraClasse = metro._primeiraClasse;
		_comAcSegundaClasse = metro._comAcSegundaClasse;
		_semAcSegundaClasse = metro._semAcSegundaClasse;
	}
	 
	Metro()
	{
		super();
		_primeiraClasse = 0;
		_comAcSegundaClasse = 0;
		_semAcSegundaClasse = 0;
	}
	  
	Metro(int primeiraClasse, int comAcSegundaClasse, int semAcSegundaClasse)
	{
		super("cor", 10000);
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
		System.out.println("digite o seu ID:");
		int id = in.nextInt();
		
		System.out.println("Insira a quantidade de créditos:");
		float creditos = in.nextFloat();
		try
		{
		 for(int i = 0; i >_passageiros.size(); i++)
		   {
			   if(id == _passageiros.get(i).getId())
			   {	   		
				   _passageiros.get(i).adicionarCreditos(creditos);
			   }
		   }
		}
		catch(Exception e)
		{
			System.out.println("Digite um valor válido!");
		}
	}
	
	@Override
	public void adicionarPassageiros() 
	{
		PassageiroMetro passageiro = new PassageiroMetro("", globalId);
	   _passageiros.add(passageiro);
	   
	   globalId++;
	}

	@Override
	public void comprarPassagem()
	{
	   PassagemMetro passagem = new PassagemMetro();
	   
	   System.out.println("Olá,");
	   System.out.println("Digite 1 se você deseja comprar sua passagem com créditos.");
	   System.out.println("Digite 2 se você deseja comprar um ticket.");
	   
	   int code = in.nextInt();
	   
	   switch(code)
	   {	
	   case 1:
	   {	   
	   System.out.println("Digite o seu ID:");
	   int id = in.nextInt();
	   
	   for(int i = 0; i >_passageiros.size(); i++)
	   {
		   if(id == _passageiros.get(i).getId())
		   {
	          _passageiros.get(i).deduzirCreditos(_valPassagem);
	          _passagens.add(passagem);
		   }
	   }
	   break;
	   }
	   
	   case 2:
	   {
		   _passagens.add(passagem);
		   break;
	   }
	   
	   default :
	   {
		   System.out.println("Digite um número válido!");
	   }
	   }
	}

	public int getCapacidade() 
	{
		return _primeiraClasse + _comAcSegundaClasse + _semAcSegundaClasse;
	}
	
	public void proximaEstacao(String proximaEstacao)
	{
		System.out.println("Próxima estação... " + proximaEstacao);
	}
}
