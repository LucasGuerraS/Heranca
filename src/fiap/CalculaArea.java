package fiap;

import javax.swing.JOptionPane;

public class CalculaArea {

	public static void main(String[] args) {
		int escolha;
		String aux, cont = "sim";
		float area, lado, altura;
		while (cont.equalsIgnoreCase("sim")){
			try {
				aux = JOptionPane.showInputDialog("Qual �rea deseja calcular? \n(1) Quadrado \n(2) Ret�ngulo \n(3) Tri�ngulo");
				escolha = Integer.parseInt(aux);
				switch (escolha) {
				case 1:
					Quadrado quad;
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					lado = Float.parseFloat(aux);
					quad = new Quadrado(lado);
					area = quad.calculaArea();
					JOptionPane.showMessageDialog(null, "�rea do quadrado: " + area);
					break;
				case 2:
					Retangulo ret;
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura");
					altura = Float.parseFloat(aux);
					ret = new Retangulo(lado, altura);
					area = ret.calculaArea();
					JOptionPane.showMessageDialog(null, "�rea do ret�ngulo: " + area);
					break;		
				case 3:
					Triangulo tri;
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura");
					altura = Float.parseFloat(aux);
					tri = new Triangulo(lado, altura);
					area = tri.calculaArea();
					JOptionPane.showMessageDialog(null, "�rea do tri�ngulo: " + area);
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
