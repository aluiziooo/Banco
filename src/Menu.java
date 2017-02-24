import javax.swing.JOptionPane;

public class Menu {
	
	public String menuPrincipal(){
		String menu = "1 - Sacar\n";
		menu += "2 - Depositar\n";
		menu += "3 - Exibir Salario\n";
		menu += "4 - Sair\n";
		
		String retorno = JOptionPane.showInputDialog(menu);
		
		return retorno;
	}
	
	public String inputValar(){
		String text = "Informe o valor a ser sacadi";
		String valor = JOptionPane.showInputDialog(text);
		
		return valor;
	}

}
