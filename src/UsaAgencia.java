import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsaAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente conta = new ContaCorrente();
		Menu menu = new Menu();
		int opcao;
		String inputText;
		float valorOperacao = 0.0f;
		
		while(true){
			inputText = menu.menuPrincipal(); 
			opcao = Integer.parseInt(inputText);
			//Sacar
			if(opcao == 1){
				inputText = menu.inputValar();
				valorOperacao = Float.parseFloat(inputText);
				valorOperacao = conta.getSaldo() - valorOperacao;
				conta.setSaldo(valorOperacao);
				
				JOptionPane.showMessageDialog(null, "Esse é o seu saldo, seu cabaço: "+conta.getSaldo());
			}
			if(opcao == 4){
				String msg = "Obrigado pos usar MeuSystem";
				JOptionPane.showMessageDialog(null, msg);
				System.exit(1);
			}
			
		}

	}
}


