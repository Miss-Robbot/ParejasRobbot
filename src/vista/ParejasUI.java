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

import controlador.ParaUI;
import codigo.Dificultades;
import codigo.Tablero;

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
	private int tamano=5;
	public JButton[][] botones = new JButton[tamano][tamano];
	protected JLabel lblNewLabel;
	protected JMenuItem facil;
	protected JMenuItem medio;
	protected JMenuItem dificil;
	protected JLabel lblEncuentraLasParejas;
	public JButton btnJugar;
	protected JPanel botonera;
	

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
		panelSeleccion.setLayout(null);
		
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
		btnJugar.setEnabled(false);
		btnJugar.setBackground(Color.getHSBColor(243, 34, 72));
		panelSeleccion.add(btnJugar);
		
		panelJuego = new JPanel();
		contentPane.add(panelJuego, "name_1178292567460895");
		panelJuego.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panelJuego.setMaximumSize(new Dimension(120, 120));
		panelJuego.setVisible(false);
		panelJuego.setLayout(null);
		
		JLabel lblEncuentraLasParejas_1 = new JLabel("Encuentra las parejas");
		lblEncuentraLasParejas_1.setBounds(66, 11, 296, 33);
		lblEncuentraLasParejas_1.setFont(new Font("Stencil", Font.PLAIN, 22));
		panelJuego.add(lblEncuentraLasParejas_1);
		
		botonera = new JPanel();
		botonera.setBounds(10, 44, 404, 196);
		panelJuego.add(botonera);
		botonera.setLayout(new GridLayout(0, tamano, 0, 0));
		
	
	}
}

