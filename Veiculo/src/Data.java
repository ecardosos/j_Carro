
public class Data 
{	
	  private int _dia;
	  private int _mes;
	  private int _ano;
	  
	  Data(int d, int m, int a)
	  {
		 _dia = d;
		 _mes = m;
		 _ano = a;
	  }

	  public int validacaoData(int dia) 
	  {
		return 0;
	  }
	  
	  void setDia(int diaIn) 
	  { 
		  _dia = validacaoData(diaIn);
	  }
	  
	  void setMes(int mesIn)
	  { 
		  if (mesIn >= 1 && mesIn <= 12) 
			  _mes = mesIn;
	  }
	  
	  void setAno(int anoIn)
	  { 
		  if (anoIn >= 0) 
			  _ano = anoIn; 
	  }

	  int getDia()
	  {
		  return _dia;
	  }
	  
	  int getMes()
	  {
		  return _mes;
	  }
	  
	  int getAno( )
	  {
		  return _ano;
	  }
}
