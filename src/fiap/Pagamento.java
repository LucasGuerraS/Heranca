package fiap;

import javax.swing.JOptionPane;

public class Pagamento {

	public static void main(String[] args) {
		String aux, nome, cont = "sim";
		int escolha;
		float valorHora, salario, adicional, comissao;
		
		while (cont.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Que tipo de funcion�rio deseja saber o sal�rio? \n(1) Funcion�rio comum "
						+ "\n(2) Vigia noturno \n(3) Vendedor");
				escolha = Integer.parseInt(aux);
				switch (escolha) {
				case 1:
					Funcionario func;
					nome = JOptionPane.showInputDialog("Digite seu nome");
					aux = JOptionPane.showInputDialog("Digite o valor da hora trabalhada");
					valorHora = Float.parseFloat(aux);
					func = new Funcionario(nome, valorHora);
					salario = func.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSal�rio: " + salario);
					break;
				case 2:
					VigiaNoturno vigia;
					nome = JOptionPane.showInputDialog("Digite seu nome");
					aux = JOptionPane.showInputDialog("Digite o valor da hora trabalhada");
					valorHora = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do adicional");
					adicional = Float.parseFloat(aux);
					vigia = new VigiaNoturno(nome, valorHora, adicional);
					salario = vigia.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSal�rio: " + salario); 
					break;
				case 3:
					Vendedor vend;
					nome = JOptionPane.showInputDialog("Digite seu nome");
					aux = JOptionPane.showInputDialog("Digite o valor da hora trabalhada");
					valorHora = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor em porcentagem da comiss�o");
					comissao = Float.parseFloat(aux);
					vend = new Vendedor(nome, valorHora, comissao);
					salario = vend.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSal�rio: " + salario); 
					break;
				default:
					throw new Exception("Op��o inv�lida!");
				}
				cont = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim de programa! At� breve!");
	}

}
