import javax.swing.JOptionPane;

public class DivisaoExata {
	int divisor(int A, int B) {
		if(A < B) {
			JOptionPane.showMessageDialog(null, "O resto foi de: " + A);
			return 0;
		} else {
			return divisor(A - B, B);
		}
	}
}
