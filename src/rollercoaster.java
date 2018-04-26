import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
String height=JOptionPane.showInputDialog("What is your height in inches?");
int num = Integer.parseInt(height);
if(num >48) {	
JOptionPane.showMessageDialog(null, "You are tall enoiugh to ride the rollercoaster. Have fun!");}	
else {
	JOptionPane.showMessageDialog(null, "Sorry, you are not tall enough to ride the rollercoaster.");
}
}}
