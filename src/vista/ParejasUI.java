package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
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
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ParejasUI extends JFrame {

	private JPanel contentPane;
	protected JPanel panelJuego;
	protected JPanel panelSeleccion;
	private int tamaño=5;
	protected JButton[][] botones = new JButton[tamaño][tamaño];
	protected JLabel lblNewLabel;
	protected JMenuItem facil;
	protected JMenuItem medio;
	protected JMenuItem dificil;
	protected JButton btnJugar;
	

	/**
	 * Create the frame.
	 */
	public ParejasUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panelSeleccion = new JPanel();
		contentPane.add(panelSeleccion, "name_403440373194313");
		
		panelJuego = new JPanel();
		panelJuego.setBounds(0, 0, 424, 251);
		panelJuego.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panelJuego.setMaximumSize(new Dimension(120, 120));
		panelJuego.setVisible(false);
		panelSeleccion.setLayout(null);
		panelJuego.setLayout(null);
		panelSeleccion.add(panelJuego);
		
		JLabel lblEncuentraLasParejas = new JLabel("Encuentra las parejas");
		lblEncuentraLasParejas.setBounds(66, 11, 296, 33);
		lblEncuentraLasParejas.setFont(new Font("Stencil", Font.PLAIN, 22));
		panelJuego.add(lblEncuentraLasParejas);
		
		JPanel botonera = new JPanel();
		botonera.setBounds(10, 44, 404, 196);
		panelJuego.add(botonera);
		botonera.setLayout(new GridLayout(0, tamaño, 0, 0));
		
		lblNewLabel = new JLabel("Selecciona la  ");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 23));
		lblNewLabel.setBounds(41, 0, 352, 65);
		panelSeleccion.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(230, 20, 148, 30);
		menuBar.setPreferredSize(new Dimension(15, 25));
		
		panelSeleccion.add(menuBar);
		
		JMenu menu = new JMenu("Dificultad");
		menu.setForeground(Color.getHSBColor(243, 34, 72));
		menu.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 23));
		menuBar.add(menu);
		
		facil = new JMenuItem("F\u00E1cil");
		facil.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(243, 34, 72), 3, false));
		menu.add(facil);
		
		medio = new JMenuItem("Medio");
		medio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, false));
		menu.add(medio); 
		
		dificil = new JMenuItem("Dif\u00EDcil");
		dificil.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(243, 34, 72), 3, false));
		menu.add(dificil);
		
		btnJugar = new JButton("\u00A1Jugar!");
		btnJugar.setBounds(12, 120, 398, 91);
		btnJugar.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		//btnJugar.setEnabled(false);
		btnJugar.setBackground(Color.getHSBColor(243, 34, 72));
		panelSeleccion.add(btnJugar);
		
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				botones[i][j] = new JButton();
				botones[i][j].setBackground(Color.getHSBColor(234, 243, 92));
				botonera.add(botones[i][j]);
				botones[i][j].setName(i+","+j);
				 
			}
		}
	}
}

