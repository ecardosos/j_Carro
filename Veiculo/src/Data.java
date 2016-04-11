
public class Data 
{	
	  private int dia;
	  private int mes;
	  private int ano;
	  
	  Data(int d, int m, int a)
	  {
		 dia = d;
		 mes = m;
		 ano = a;
	  }

	  public int validacaoData(int dia) 
	  {
		return 0;
	  }
	  
	  void setDia(int diaIn) 
	  { 
		  dia = validacaoData(diaIn);
	  }
	  
	  void setMes(int mesIn)
	  { 
		  if (mesIn >= 1 && mesIn <= 12) mes = mesIn;
	  }
	  void setAno(int anoIn)
	  { 
		  if (anoIn >= 0) ano = anoIn; 
	  }

	  int getDia()
	  {
		  return dia;
	  }
	  
	  int getMes()
	  {
		  return mes;
	  }
	  
	  int getAno( )
	  {
		  return ano;
	  }
}
