import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame Bryan = new JFrame("Hello, world!");
		Bryan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Bryan.setLocation(865, 420);
		Bryan.setSize(500, 500);
		MyPanelClass myPanel = new MyPanelClass();
        Bryan.getContentPane().add(myPanel);
		Bryan.setVisible(true);
	}
}