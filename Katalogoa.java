package vendingMaquina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import vendingMaquina.ProduktuMenua;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;


public class Katalogoa {

	private JFrame frame;
	private JTextField textselecnum;
	private JPanel panela;
	private JPanel panelb;
	private JPanel panelc;
	private JButton btn0;
	private JButton btn3;
	private JButton btnC;
	private JLabel lblVending;
	int button = 0;
	private JButton btn2;
	private JButton btn1;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btnatzera;
	private JTextField txtprezio;
	private JPanel panelProd;
	private JLabel lblProd;
	private ImageIcon imageIcon1;
	private JLabel imgLabelProd;
	//instancia la clase.
	private Metodoak kontsola = new Metodoak();

	
	
	/*
	private JPanel panelProd2;
	private JPanel panelProd3;
	private JPanel panelProd4;
	private JPanel panelProd5;
	private JPanel panelProd6;
	private JPanel panelProd7;
	private JPanel panelProd8;
	private JPanel panelProd9;
	private JLabel lblProd2;
	private JLabel lblProd3;
	private JLabel lblProd4;
	private JLabel lblProd5;
	private JLabel lblProd6;
	private JLabel lblProd7;
	private JLabel lblProd8;
	private JLabel lblProd9;
	*/

	public void show() {
		initialize(null);
		frame.setVisible(true);// hace que el JFrame de esta pagina sea visible
	}

	/**
	 * Initialize the contents of the frame.
	 */
    // Método de inicialización de la GUI
    private void initialize(String mota) {
        frame = new JFrame();
        frame.setBounds(100, 100, 883, 640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        // Configura tu GUI como lo tenías antes
        panela = new JPanel();
        panela.setBounds(0, 0, 867, 134);
        frame.getContentPane().add(panela);
        panela.setLayout(null);

        panelb = new JPanel();
        panelb.setBounds(0, 133, 586, 468);
        frame.getContentPane().add(panelb);
        panelb.setLayout(null);

        //ºpanelGenerator(mota);
		
		/*
		imageIcon1 = new ImageIcon(this.getClass().getResource("/chocoBoombl.jpg"));
		Image image1 = imageIcon1.getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon1.setImage(image1);
		lbl1.setIcon(imageIcon1);
		
		panelProd2 = new JPanel();
		panelProd2.setBounds(191, 304, 81, 109);
		panelb.add(panelProd2);
		panelProd2.setLayout(null);

		panelProd3 = new JPanel();
		panelProd3.setBounds(335, 304, 81, 109);
		panelb.add(panelProd3);
		panelProd3.setLayout(null);

		panelProd4 = new JPanel();
		panelProd4.setBounds(53, 166, 81, 109);
		panelb.add(panelProd4);
		panelProd4.setLayout(null);

		panelProd5 = new JPanel();
		panelProd5.setBounds(190, 166, 81, 109);
		panelb.add(panelProd5);
		panelProd5.setLayout(null);

		panelProd6 = new JPanel();
		panelProd6.setBounds(334, 166, 81, 109);
		panelb.add(panelProd6);
		panelProd6.setLayout(null);

		panelProd7 = new JPanel();
		panelProd7.setBounds(53, 31, 81, 109);
		panelb.add(panelProd7);
		panelProd7.setLayout(null);

		panelProd8 = new JPanel();
		panelProd8.setBounds(191, 31, 81, 109);
		panelb.add(panelProd8);
		panelProd8.setLayout(null);

		panelProd9 = new JPanel();
		panelProd9.setBounds(335, 31, 81, 109);
		panelb.add(panelProd9);
		panelProd9.setLayout(null);

		lblProd1 = new JLabel("");
		lblProd1.setEnabled(false);
		lblProd1.setBounds(69, 420, 46, 14);
		panelb.add(lblProd1);

		lblProd2 = new JLabel("");
		lblProd2.setEnabled(false);
		lblProd2.setBounds(209, 422, 46, 14);
		panelb.add(lblProd2);

		lblProd3 = new JLabel("");
		lblProd3.setEnabled(false);
		lblProd3.setBounds(354, 422, 46, 14);
		panelb.add(lblProd3);

		lblProd4 = new JLabel("");
		lblProd4.setEnabled(false);
		lblProd4.setBounds(70, 282, 46, 14);
		panelb.add(lblProd4);

		lblProd5 = new JLabel("");
		lblProd5.setEnabled(false);
		lblProd5.setBounds(209, 283, 46, 14);
		panelb.add(lblProd5);

		lblProd6 = new JLabel("");
		lblProd6.setEnabled(false);
		lblProd6.setBounds(352, 283, 46, 14);
		panelb.add(lblProd6);

		lblProd7 = new JLabel("");
		lblProd7.setEnabled(false);
		lblProd7.setBounds(73, 145, 46, 14);
		panelb.add(lblProd7);

		lblProd8 = new JLabel("");
		lblProd8.setEnabled(false);
		lblProd8.setBounds(208, 145, 46, 14);
		panelb.add(lblProd8);

		lblProd9 = new JLabel("");
		lblProd9.setEnabled(false);
		lblProd9.setBounds(353, 145, 46, 14);
		panelb.add(lblProd9);
		*/

		panelc = new JPanel();
		panelc.setBounds(586, 133, 281, 468);
		frame.getContentPane().add(panelc);
		panelc.setLayout(null);

		textselecnum = new JTextField();
		textselecnum.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textselecnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textselecnum.setBounds(65, 94, 133, 38);
		panelc.add(textselecnum);
		textselecnum.setColumns(10);
		textselecnum.setEditable(false);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 0);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn0.setBounds(100, 269, 63, 38);
		panelc.add(btn0);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1.setBounds(32, 227, 63, 38);
		panelc.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn2.setBounds(100, 227, 63, 38);
		panelc.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn3.setBounds(166, 227, 63, 38);
		panelc.add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn4.setBounds(32, 184, 63, 38);
		panelc.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn5.setBounds(100, 184, 63, 38);
		panelc.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn6.setBounds(166, 184, 63, 38);
		panelc.add(btn6);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn7.setBounds(32, 143, 63, 38);
		panelc.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn8.setBounds(100, 143, 63, 38);
		panelc.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText(textselecnum.getText() + 9);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn9.setBounds(166, 143, 63, 38);
		panelc.add(btn9);

		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnC.setBounds(166, 269, 63, 38);
		panelc.add(btnC);

		txtprezio = new JTextField();
		txtprezio.setEditable(false);
		txtprezio.setBounds(105, 349, 86, 20);
		panelc.add(txtprezio);
		txtprezio.setColumns(10);

		JLabel lblNewLabel = new JLabel("Prezioa");
		lblNewLabel.setBounds(129, 330, 46, 14);
		panelc.add(lblNewLabel);

		lblVending = new JLabel("Vending Makina");
		lblVending.setBounds(273, 11, 342, 87);
		panela.add(lblVending);
		lblVending.setFont(new Font("Cooper Black", Font.PLAIN, 41));

		btnatzera = new JButton("<-");
		btnatzera.setForeground(new Color(255, 0, 0));
		btnatzera.setBackground(new Color(255, 69, 0));
		btnatzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProduktuMenua produktumenua = new ProduktuMenua();
				produktumenua.show();
				frame.dispose();
			}
		});
		btnatzera.setBounds(23, 26, 45, 23);
		panela.add(btnatzera);

        frame.setVisible(true); // Asegúrate de que esto esté al final
    }
	public void panelGenerator(String mota) {
	    int width = 100;  // Ancho de cada panel de producto
	    int height = 150; // Altura de cada panel de producto
	    int spacing = 10; // Espacio entre paneles
	    
	    // Configuración de la cuadrícula 3x3
	    int columns = 3;  
	    int rows = 3;  

	    for (int i = 0; i < kontsola.argazkiIzenak.length; i++) {
	        // Calcular la fila y columna actuales
	        int row = i / columns;
	        int col = i % columns;

	        // Calcular la posición del panel dentro de panelb
	        int posX = col * (width + spacing);
	        int posY = row * (height + spacing);
	        // Cargar y añadir la imagen del producto
	        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/sources/chocoBoomBl.jpg"));
	        Image image = imageIcon.getImage().getScaledInstance(width - 10, height - 60, Image.SCALE_SMOOTH);
	        imageIcon.setImage(image);
	        JLabel imgLabelProd = new JLabel(imageIcon);
	        imgLabelProd.setBounds(5, 5, width - 10, height - 60);
	        panelProd.add(imgLabelProd);
	        	 // Crear el panel de cada producto
		        JPanel panelProd = new JPanel();
		        panelProd.setBounds(posX, posY, width, height);
		        panelProd.setLayout(null);
		        panelb.add(panelProd);
		        System.out.println(kontsola.argazkiIzenak[i]);
		        

		        

		        // Añadir etiqueta con el nombre del producto
		        JLabel lblNombre = new JLabel(kontsola.izenak[i]);
		        lblNombre.setBounds(5, height - 45, width - 10, 20);
		        lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		        panelProd.add(lblNombre);

		        // Añadir etiqueta con el precio del producto
		        JLabel lblPrecio = new JLabel("€" + kontsola.prezioak[i]);
		        lblPrecio.setBounds(5, height - 25, width - 10, 20);
		        lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		        panelProd.add(lblPrecio);
	       
	    }}
}
