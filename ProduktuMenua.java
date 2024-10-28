package erronka;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ProduktuMenua {

	private JFrame frame;
	private JButton btnsexshop;
	private JButton btnedaria;
	private JButton btnBack;
	private JPanel panelEdariak;
	private JPanel panelJanaria;
	private JButton btnjanaria;
	private JPanel panelSexShop;
	private JPanel panelArtFumador;
	private JButton btnerretzaile;
	private Katalogoa generator = new Katalogoa();

	/**
	 * @wbp.parser.entryPoint
	 */
	public void show() {
		initialize();
		frame.setVisible(true);// hace que el JFrame de esta pagina sea visible
	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlightText);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panelEdariak = new JPanel();
		panelEdariak.setBackground(SystemColor.controlLtHighlight);
		panelEdariak.setBounds(10, 11, 81, 109);
		frame.getContentPane().add(panelEdariak);
		panelEdariak.setLayout(null);

		btnedaria = new JButton("New button");
		btnedaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//generator.panelGenerator("edaria");
				Katalogoa katalogoa = new Katalogoa();
				katalogoa.show();
				frame.dispose();
			}
		});
		btnedaria.setIcon(new ImageIcon(ProduktuMenua.class.getResource("/chocoBoombl.jpg")));
		btnedaria.setBackground(SystemColor.controlLtHighlight);
		btnedaria.setBounds(0, 0, 81, 109);
		panelEdariak.add(btnedaria);

		panelJanaria = new JPanel();
		panelJanaria.setBackground(SystemColor.controlLtHighlight);
		panelJanaria.setBounds(115, 11, 81, 109);
		frame.getContentPane().add(panelJanaria);
		panelJanaria.setLayout(null);

		btnjanaria = new JButton("New button");
		btnjanaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//generator.panelGenerator("janaria");
				Katalogoa katalogoa = new Katalogoa();
				katalogoa.show();
				frame.dispose();
			}
		});
		btnjanaria.setBackground(SystemColor.controlLtHighlight);
		btnjanaria.setBounds(0, 0, 81, 109);
		panelJanaria.add(btnjanaria);

		panelSexShop = new JPanel();
		panelSexShop.setBackground(SystemColor.controlLtHighlight);
		panelSexShop.setBounds(222, 11, 81, 109);
		frame.getContentPane().add(panelSexShop);
		panelSexShop.setLayout(null);

		btnsexshop = new JButton("New button");
		btnsexshop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//generator.panelGenerator("sexshop");
				Katalogoa katalogoa = new Katalogoa();
				katalogoa.show();
				frame.dispose();
			}
		});
		btnsexshop.setIcon(new ImageIcon(ProduktuMenua.class.getResource("/chocoBoombl.jpg")));
		btnsexshop.setBackground(SystemColor.controlLtHighlight);
		btnsexshop.setBounds(0, 0, 81, 109);
		panelSexShop.add(btnsexshop);

		panelArtFumador = new JPanel();
		panelArtFumador.setBackground(SystemColor.controlLtHighlight);
		panelArtFumador.setBounds(328, 11, 81, 109);
		frame.getContentPane().add(panelArtFumador);
		panelArtFumador.setLayout(null);

		btnerretzaile = new JButton("New button");
		btnerretzaile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//generator.panelGenerator("e");
				Katalogoa katalogoa = new Katalogoa();
				katalogoa.show();
				frame.dispose();
			}
		});
		btnerretzaile.setIcon(new ImageIcon(ProduktuMenua.class.getResource("/chocoBoombl.jpg")));
		btnerretzaile.setBackground(SystemColor.controlLtHighlight);
		btnerretzaile.setBounds(0, 0, 81, 109);
		panelArtFumador.add(btnerretzaile);

		btnBack = new JButton("Atzera");
		btnBack.setBounds(141, 200, 150, 50);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.frame.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnBack);

		ImageIcon imageIcon1 = new ImageIcon(this.getClass().getResource("/torolocoopalo.jpg"));
		Image image = imageIcon1.getImage().getScaledInstance(panelEdariak.getWidth(), panelEdariak.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon1.setImage(image);
		btnedaria.setIcon(imageIcon1);

		ImageIcon imageIcon2 = new ImageIcon(this.getClass().getResource("/chocoBoombl.jpg"));
		Image image2 = imageIcon2.getImage().getScaledInstance(panelJanaria.getWidth(), panelJanaria.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon2.setImage(image2);
		btnjanaria.setIcon(imageIcon2);

		ImageIcon imageIcon3 = new ImageIcon(this.getClass().getResource("/condonesdurex1.jpg"));
		Image image3 = imageIcon3.getImage().getScaledInstance(panelSexShop.getWidth(), panelSexShop.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon3.setImage(image3);
		btnsexshop.setIcon(imageIcon3);

		ImageIcon imageIcon4 = new ImageIcon(this.getClass().getResource("/fumarMata.jpg"));
		Image image4 = imageIcon4.getImage().getScaledInstance(panelArtFumador.getWidth(), panelArtFumador.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon4.setImage(image4);
		btnerretzaile.setIcon(imageIcon4);

		JLabel lblEdariak = new JLabel("EDARIAK");
		lblEdariak.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblEdariak.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdariak.setBounds(10, 131, 81, 14);
		frame.getContentPane().add(lblEdariak);

		JLabel lblJanaria = new JLabel("JANARIA");
		lblJanaria.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblJanaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblJanaria.setBounds(115, 131, 81, 14);
		frame.getContentPane().add(lblJanaria);

		JLabel lblSexShop = new JLabel("SEXSHOP");
		lblSexShop.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblSexShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexShop.setBounds(222, 131, 81, 14);
		frame.getContentPane().add(lblSexShop);

		JLabel lblErretzaileak = new JLabel("ERRETZAILEAK");
		lblErretzaileak.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblErretzaileak.setHorizontalAlignment(SwingConstants.CENTER);
		lblErretzaileak.setBounds(313, 131, 111, 14);
		frame.getContentPane().add(lblErretzaileak);

	}
}
