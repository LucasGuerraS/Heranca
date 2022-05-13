package fiap;

import javax.swing.JOptionPane;

public class Pagamento {

	public static void main(String[] args) {
		String aux, nome, cont = "sim";
		int escolha;
		float valorHora, salario, adicional, comissao;
		
		while (cont.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Que tipo de funcionário deseja saber o salário? \n(1) Funcionário comum "
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
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalário: " + salario);
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
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalário: " + salario); 
					break;
				case 3:
					Vendedor vend;
					nome = JOptionPane.showInputDialog("Digite seu nome");
					aux = JOptionPane.showInputDialog("Digite o valor da hora trabalhada");
					valorHora = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor em porcentagem da comissão");
					comissao = Float.parseFloat(aux);
					vend = new Vendedor(nome, valorHora, comissao);
					salario = vend.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalário: " + salario); 
					break;
				default:
					throw new Exception("Opção inválida!");
				}
				cont = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim de programa! Até breve!");
	}

}
