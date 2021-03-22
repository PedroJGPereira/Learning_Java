public class Conta
{	
	//Variáveis de instancia
	private int numeroConta;
	private String titularConta;
	private double saldoConta;
	
	//Construtores
	public Conta(int num, String tit){
		//Inicializa as variaveis de instancia.
		numeroConta = num;
		titularConta = tit;
		saldoConta = 0;
	}

	//Modificadores
	public void setSaldoDeposito(double montante){
		saldoConta += montante;
		// Ou saldoConta = saldoConta + montante;
	}
	public void setSaldoLevantamento(double montante){
		saldoConta -= montante;
		if(montante>saldoConta){
			System.out.println("Erro. Saldo insuficiente.");
		}else{
			System.out.println("Saldo = "+getSaldo());
		}
	}

	//Seletores
	public double getSaldo(){
		return saldoConta;
	}
	public String getTitular(){
		return titularConta;
	}
}
