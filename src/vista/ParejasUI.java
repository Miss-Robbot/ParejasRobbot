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
import javax.swing.JButton;

public class ParejasUI extends JFrame {

	private JPanel contentPane;
	protected JPanel panelJuego;
	protected JPanel panelSeleccion;
	private int columnas=3;
	private int filas=3;
	protected JButton[][] botones = new JButton[filas][columnas];
	private JLabel lblNewLabel;
	private JMenuItem facil;
	private JMenuItem medio;
	private JMenuItem dificil;
	private JButton btnJugar;
	

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
		botonera.setLayout(new GridLayout(0, filas, 0, 0));
		
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
		menu.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 23));
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
		
		btnJugar = new JButton("\u00A1Jugar!");
		btnJugar.setBounds(12, 120, 398, 91);
		btnJugar.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnJugar.setEnabled(false);
		panelSeleccion.add(btnJugar);
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				botones[i][j] = new JButton();
				botones[i][j].setBackground(Color.getHSBColor(234, 243, 92));
				botonera.add(botones[i][j]);
				botones[i][j].setName(i+","+j);
				 
			}
		}
	}
}

