package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es de um funcion�rio
		
		// Tipos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo l�gico
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Identifica��o salarial
		System.out.println("id " + id + " recebe " + salario);
		
		// Relaxamento
		System.out.println("F�rias? " + estaDeFerias);
		
		// Status
		System.out.println("Status: " + status);
		
	}
}
