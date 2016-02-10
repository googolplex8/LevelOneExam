import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelOneExam implements ActionListener {
	public static void main(String[] args) {
		new LevelOneExam().createUI();
	}

	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(yellow);
		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		panel.add(red);
		red.setBackground(Color.red);
		red.setOpaque(true);
		panel.add(blue);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		panel.add(green);
		green.setBackground(Color.green);
		green.setOpaque(true);
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		frame.pack();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==yellow){
			speak("yellow");
		}
		if(buttonPressed==red){
			speak("red");
		}
		if(buttonPressed==blue){
			speak("blue");
		}
		if(buttonPressed==green){
			speak("green");
		}

	}
}
