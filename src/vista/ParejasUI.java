package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.Dificultades;

import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class ParejasUI extends JFrame {

	protected JPanel contentPane;
	protected Botonera botonera;
	protected int altobotonera=100;
	protected int anchobotonera=100;
	static Dificultades dificultad;
	protected JButton[][] botones = new JButton[3][4];
	private JButton btnJugar;
	private JMenuItem facil;
	private JMenuItem medio;
	private JMenuItem dificil;
	
	

	/**
	 * Create the frame.
	 */
	public ParejasUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(110, 110, 455, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblSeleccioneLaDificultad = new JLabel("Seleccione la dificultad:");
		lblSeleccioneLaDificultad.setFont(new Font("Arimo", Font.BOLD, 17));
		lblSeleccioneLaDificultad.setBounds(51, 21, 219, 35);
		//lblSeleccioneLaDificultad.setVisible(false);
		contentPane.add(lblSeleccioneLaDificultad);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.BLACK);
		menuBar.setBounds(260, 36, 84, 21);
		menuBar.setPreferredSize(new Dimension(15, 25));
		//menuBar.setVisible(false);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("Dificultad");
		menu.setForeground(Color.WHITE);
		menuBar.add(menu);
		
		facil = new JMenuItem("F\u00E1cil");
		facil.setForeground(Color.YELLOW);
		facil.setBackground(Color.BLACK);
		menu.add(facil);
		
		medio = new JMenuItem("Medio");
		medio.setForeground(Color.YELLOW);
		medio.setBackground(Color.BLACK);
		menu.add(medio);
		
		dificil = new JMenuItem("Dif\u00EDcil");
		dificil.setForeground(Color.YELLOW);
		dificil.setBackground(Color.BLACK);
		menu.add(dificil);
		
		btnJugar = new JButton("Jugar!!");
		btnJugar.setFont(new Font("Sitka Text", Font.BOLD, 30));
		btnJugar.setBackground(Color.MAGENTA);
		btnJugar.setBounds(65, 97, 137, 117);
		//btnJugar.setVisible(false);
		contentPane.add(btnJugar);
		
		 
		for (int i = 0; i < botones.length; i++) { //que sea tablero.length...
			for (int j = 0; j < botones.length; j++) {
				botones[i][j] = new JButton();
				botones[i][j].setBackground(Color.getHSBColor(234, 243, 92));
				botones[i][j].setName(i+","+j);
				contentPane.add(botones[i][j]);
				
				 
			}
		}
       
        
        
    
		
		
	}
}

