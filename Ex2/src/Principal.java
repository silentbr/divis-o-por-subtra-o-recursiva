import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		DivisaoExata div = new DivisaoExata();
		int A; int B;
		
		A = Integer.parseInt(JOptionPane.showInputDialog("digite o valor do dividendo"));
		B = Integer.parseInt(JOptionPane.showInputDialog("digite o valor do divisor"));
		div.divisor(A, B);
	}
}
