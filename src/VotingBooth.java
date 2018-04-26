import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Welcome to the voting booth. How old are you in years?");
		int num = Integer.parseInt(age);
if(num>17) {
	JOptionPane.showInputDialog("Who do you think should be the next president?");
}else {
	
JOptionPane.showMessageDialog(null, "You are not allowed in here. Please leave or you wwill be destroyed.");	
}
	}
}
