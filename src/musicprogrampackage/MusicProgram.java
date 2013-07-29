package musicprogrampackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicProgram {

	private boolean selectednotes[]= new boolean[12];
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
			// noteCheck() goes here?
		});
	}

	/**
	 * Create the application.
	 */
	public MusicProgram() {
		initialize();
		// More stuff added here later for control flow
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(178, 28, 262, 238);
		frame.getContentPane().add(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JLabel lblResults = new JLabel("RESULTS");
		lblResults.setBounds(278, 6, 61, 16);
		frame.getContentPane().add(lblResults);
		
		// Adding Buttons
		JToggleButton tglbtnE = new JToggleButton("E");
		tglbtnE.setBounds(0, 85, 84, 29);
		frame.getContentPane().add(tglbtnE);
		tglbtnE.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				      if (selectednotes[4] == false) {
				    	  selectednotes[4] = true;
				      } else {
				    	  selectednotes[4] = false;
				      }
				    	textArea.setText("");  // Necessary to clear the text area every time a new button is pushed
				    	// recalculate method goes here
				      	textArea.append(String.valueOf(selectednotes[4]));  // This just checks to see that the data change is working after button is pushed.  Delete this later.  		
				    	  
				      }
				    }
				);
		
		JToggleButton tglbtnF = new JToggleButton("F");
		tglbtnF.setBounds(0, 123, 84, 29);
		frame.getContentPane().add(tglbtnF);
		tglbtnF.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	if (selectednotes[5] == false) {
					    	  selectednotes[5] = true;
					      } else {
					    	  selectednotes[5] = false;
					      }
					    	  textArea.append(String.valueOf(selectednotes[5])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
				    }
				  }
				);
		
		JToggleButton tglbtnD = new JToggleButton("D");
		tglbtnD.setBounds(0, 47, 84, 29);
		frame.getContentPane().add(tglbtnD);
		tglbtnD.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	if (selectednotes[2] == false) {
					    	  selectednotes[2] = true;
					      } else {
					    	  selectednotes[2] = false;
					      }
					    	  textArea.append(String.valueOf(selectednotes[2])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
				    }
				  }
				);
		
		JToggleButton tglbtnG = new JToggleButton("G");
		tglbtnG.setBounds(0, 161, 84, 29);
		frame.getContentPane().add(tglbtnG);
		tglbtnG.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[7] == false) {
						    	  selectednotes[7] = true;
						      } else {
						    	  selectednotes[7] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[7])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);
		
		JToggleButton tglbtnA = new JToggleButton("A");
		tglbtnA.setBounds(0, 199, 84, 29);
		frame.getContentPane().add(tglbtnA);
		tglbtnA.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[9] == false) {
						    	  selectednotes[9] = true;
						      } else {
						    	  selectednotes[9] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[9])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);
		
		JToggleButton tglbtnB = new JToggleButton("B");
		tglbtnB.setBounds(0, 237, 84, 29);
		frame.getContentPane().add(tglbtnB);
		tglbtnB.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[11] == false) {
						    	  selectednotes[11] = true;
						      } else {
						    	  selectednotes[11] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[11])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);
				
		JToggleButton tglbtnC = new JToggleButton("C");
		tglbtnC.setBounds(0, 9, 84, 29);
		frame.getContentPane().add(tglbtnC);
		tglbtnC.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[0] == false) {
						    	  selectednotes[0] = true;
						      } else {
						    	  selectednotes[0] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[0])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);
		
		JToggleButton tglbtnCdb = new JToggleButton("C#/Db");
		tglbtnCdb.setBounds(88, 28, 84, 29);
		frame.getContentPane().add(tglbtnCdb);
		tglbtnCdb.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[1] == false) {
						    	  selectednotes[1] = true;
						      } else {
						    	  selectednotes[1] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[1])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);
		
		JToggleButton tglbtnDeb = new JToggleButton("D#/Eb");
		tglbtnDeb.setBounds(88, 69, 84, 29);
		frame.getContentPane().add(tglbtnDeb);
		tglbtnDeb.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[3] == false) {
						    	  selectednotes[3] = true;
						      } else {
						    	  selectednotes[3] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[3])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);
		
		JToggleButton tglbtnFgb = new JToggleButton("F#/Gb");
		tglbtnFgb.setBounds(88, 143, 84, 29);
		frame.getContentPane().add(tglbtnFgb);
		tglbtnFgb.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[6] == false) {
						    	  selectednotes[6] = true;
						      } else {
						    	  selectednotes[6] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[6])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);	
		
		JToggleButton tglbtnGab = new JToggleButton("G#/Ab");
		tglbtnGab.setBounds(88, 184, 84, 29);
		frame.getContentPane().add(tglbtnGab);
		tglbtnGab.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[8] == false) {
						    	  selectednotes[8] = true;
						      } else {
						    	  selectednotes[8] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[8])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);
	
		JToggleButton tglbtnAbb = new JToggleButton("A#/Bb");
		tglbtnAbb.setBounds(88, 225, 84, 29);
		frame.getContentPane().add(tglbtnAbb);
		tglbtnAbb.addActionListener(
				  new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	if (selectednotes[10] == false) {
						    	  selectednotes[10] = true;
						      } else {
						    	  selectednotes[10] = false;
						      }
						    	  textArea.append(String.valueOf(selectednotes[10])); // This just checks to see that the data change is working after button is pushed.  Delete this later.
					    }
					  }
					);	
	}   
	
	/**
	 * Counts the number of notes currently selected
	 */
	public int noteCheck() {
		
		int i = 0; 
		int count = 0;
		
		for (i=0; i<=11; i++) {
			if (selectednotes[i] == true) {
				count++;
			}
		}
		
		return count;
		
	}
	
	/**
	 * Determines which method to call based on the number of notes selected from noteCheck()
	 */
	public void categorize() {
		if (noteCheck() < 3) {
			// call appropriate Scales and/or Chords method to show notes, intervals and inverted intervals
		;}
		else if (noteCheck() == 3) {
			//  call appropriate Scales and/or Chords method to check triads, show notes, intervals?, inverted intervals?
		;}
		else if (noteCheck() == 4) {
			//  call appropriate Scales and/or Chords method to check for 7th chords, triads, show notes, intervals? and inverted intervals?
		;}
		else if (noteCheck() == 5) {
			//  call appropriate Scales and/or Chords method to check for pentatonic scales, chords, show notes, intervals and inverted intervals
			//  make a scaleCheck.pentatonic() method?
		;}
		else if (noteCheck() == 6) {
			//  call appropriate Scales and/or Chords method to check whole tone scale and other 6-note scales, then chords, show notes, intervals? and inverted intervals?
		;}
		else if (noteCheck() == 7) {
			//  call appropriate Scales and/or Chords method to check for all parent scales, chords, show notes, intervals? and inverted intervals?
			//  make scaleCheck.major(), scaleCheck.harmonic() and scaleCheck.melodic() methods?
		;}
		else if (noteCheck() == 8) {
			//  call appropriate Scales and/or Chords method to check for diminished scales, chords, show notes, intervals? and inverted intervals?
		;}
		else if (noteCheck() >=9 && noteCheck() <=11) {
			//  call appropriate Scales and/or Chords method to check for any other scales, chords, show notes, intervals? and inverted intervals?
		;}
		else if (noteCheck() == 12) {
			//  call appropriate Scales and/or Chords method to show chromatic scale and possible chords
		;}
		else {
			System.out.println("An unexpected error occurred.");
		}
		
	}
	

	public void scaleCheck() {
	
		
	}
	
	public void chordCheck() {
		
		
	}
	
}