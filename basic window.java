import javax.swing.*;

public class Main {
	
	private static JFrame frame;
	private static JButton button;
	
	public static void main(String[] args) {
		frame = new JFrame("Java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		button = new JButton("JButton");
		
		frame.add(button);
		frame.setVisible(true);
  }
}
