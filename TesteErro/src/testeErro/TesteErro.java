package testeErro;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class TesteErro {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		
		System.out.println("Inicio do metodo2");
		ContaCorrente cc = new ContaCorrente("Carlos", "rua 1", "123456", LocalDate.of(1981, 06, 22), LocalDate.of(2019, 10, 31));
		metodo3(cc);

//		for (int i = 0; i <= 15; i++) {
//			cc.deposita(i + 1000);
//			System.out.println(cc.getSaldo());
//			if(i == 5) {
//				cc = null;
//			}
//		}
		
		
		System.out.println("Fim do metodo2");
	}
	
	private static void metodo3(ContaCorrente cc) {
		
		Double valueDeposita = Double.valueOf(JOptionPane.showInputDialog("valor de deposito: "));
		cc.deposita(valueDeposita);
		
		System.out.println("Valor final: ");
		System.out.println(cc.getSaldo());
		
//		ContaCorrente c2 = new ContaCorrente("Jose", "Rua 2", "987654", LocalDate.of(1987, 07, 15), LocalDate.of(2019, 10, 31));
//		boolean cpf = cc.equals(c2);
		
		Double valueSaca = Double.valueOf(JOptionPane.showInputDialog("valor do saque: "));
		try {
			cc.saca(valueSaca);
		} catch(SaldoInsuficiente e) {
			e.printStackTrace();
		}		
		System.out.println("valor final 2: " + cc.getSaldo());
		System.out.println("data nascimento: " + cc.getDataNascimento());
		
		ClassificacaoClientes.BAIXO.isCompatible(cc);
		ClassificacaoClientes.MEDIO.isCompatible(cc);
		ClassificacaoClientes.POTENCIAL.isCompatible(cc);
	}

}
