import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JToggleButton;


public class MusicProgram {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicProgram window = new MusicProgram();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MusicProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(178, 28, 262, 212);
		frame.getContentPane().add(textArea);
		
		JLabel lblResults = new JLabel("RESULTS");
		lblResults.setBounds(278, 6, 61, 16);
		frame.getContentPane().add(lblResults);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("E");
		tglbtnNewToggleButton.setBounds(0, 85, 84, 29);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnF = new JToggleButton("F");
		tglbtnF.setBounds(0, 123, 84, 29);
		frame.getContentPane().add(tglbtnF);
		
		JToggleButton tglbtnD = new JToggleButton("D");
		tglbtnD.setBounds(0, 47, 84, 29);
		frame.getContentPane().add(tglbtnD);
		
		JToggleButton tglbtnG = new JToggleButton("G");
		tglbtnG.setBounds(0, 161, 84, 29);
		frame.getContentPane().add(tglbtnG);
		
		JToggleButton tglbtnA = new JToggleButton("A");
		tglbtnA.setBounds(0, 199, 84, 29);
		frame.getContentPane().add(tglbtnA);
		
		JToggleButton tglbtnB = new JToggleButton("B");
		tglbtnB.setBounds(0, 237, 84, 29);
		frame.getContentPane().add(tglbtnB);
		
		JToggleButton tglbtnC = new JToggleButton("C");
		tglbtnC.setBounds(0, 9, 84, 29);
		frame.getContentPane().add(tglbtnC);
		
		JToggleButton tglbtnCdb = new JToggleButton("C#/Db");
		tglbtnCdb.setBounds(88, 28, 84, 29);
		frame.getContentPane().add(tglbtnCdb);
		
		JToggleButton tglbtnDeb = new JToggleButton("D#/Eb");
		tglbtnDeb.setBounds(88, 69, 84, 29);
		frame.getContentPane().add(tglbtnDeb);
		
		JToggleButton tglbtnFgb = new JToggleButton("F#/Gb");
		tglbtnFgb.setBounds(88, 143, 84, 29);
		frame.getContentPane().add(tglbtnFgb);
		
		JToggleButton tglbtnGab = new JToggleButton("G#/Ab");
		tglbtnGab.setBounds(88, 184, 84, 29);
		frame.getContentPane().add(tglbtnGab);
		
		JToggleButton tglbtnAbb = new JToggleButton("A#/Bb");
		tglbtnAbb.setBounds(88, 225, 84, 29);
		frame.getContentPane().add(tglbtnAbb);
	}
}
