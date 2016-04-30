import java.util.Scanner;
import java.util.ArrayList;

public final class OnibusInterurbano extends Veiculo implements VeiculoTransportePassageiros
{
	Scanner in = new Scanner(System.in);
	
	ArrayList<PassagemOnibusInterurbano> _passagens;
	private int _numAssentos;
	
	OnibusInterurbano()
	{
		super();
		_numAssentos = 0;
	}
	
	OnibusInterurbano(OnibusInterurbano onibus)
	{
		_numAssentos = onibus._numAssentos;
	}
	
	OnibusInterurbano(int numAssentos)
	{
		super("cor", 70);
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

	public int getCapacidade() 
	{
		return _numAssentos;
	}

	@Override
	public void comprarPassagem()
	{	
		System.out.println("Digite o nome do Passageiro:");
		String nome = in.toString();
		
		for(int i = 0; i >_passagens.size(); i++)
		{
			if(nome == _passagens.get(i).getNome())
			{
				_passagens.get(i).efetuarPagamento();
				return;
			}
		}
	}

	@Override
	public void adicionarPassageiros()
	{
		System.out.println("Digite o nome do Passageiro:");
		String nome = in.toString();
		
		System.out.println("Digite o local de origem da viagem:");
		String origem = in.toString();
		
		System.out.println("Digite o destino da viagem:");
		String destino = in.toString();
		
		System.out.println("Digite o preço da passagem:");
		float preco = in.nextFloat();
		
		PassagemOnibusInterurbano passagem = new PassagemOnibusInterurbano(nome, origem, destino, preco);
		
		_passagens.add(passagem);
	}	
}
