package erronka;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JPanel;

public class OngiEtorri {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OngiEtorri window = new OngiEtorri();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void show() {
		OngiEtorria();
		frame.setVisible(true);// hace que el JFrame de esta pagina sea visible
	}

	/**
	 * Create the application.
	 */
	public OngiEtorri() {
		OngiEtorria();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void OngiEtorria() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlLtHighlight);
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\in1dm3-d.ELORRIETA\\Downloads\\pilasalcalinasaaa88.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("ONGI ETORRI");
		btnNewButton.setFont(new Font("Leelawadee", Font.BOLD, 28));
		btnNewButton.addActionListener(new ActionListener() {
			// klikatxean produktuen menua erakutziko du
			public void actionPerformed(ActionEvent e) {
				ProduktuMenua produktuMenua = new ProduktuMenua(); // crea una insttancia de la clase ProduktuMenua, el
																	// objeto produktuMenua es inicilizado
				produktuMenua.show(); // llama al metodo show(), el cual inicializa y hace visible elJFrame de
										// produktuMenua
				frame.dispose(); // este metodo cerrara y libeerara los recuersos utilizados por elactual JFrame
									// (OngiEtorri)
			}
		});
		btnNewButton.setBounds(84, 43, 314, 182);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(frame.getContentPane().getBackground()); // Mismo color que el fondo
		btnNewButton_1.setBorderPainted(false); // Sin borde
		btnNewButton_1.setContentAreaFilled(false); // Sin área de contenido
		btnNewButton_1.setOpaque(false); // Opaco falso para que no se vea
		btnNewButton_1.setFont(new Font("Sitka Small", Font.PLAIN, 5));
		btnNewButton_1.setBounds(0, 0, 33, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				AdminKontsola admin = new AdminKontsola();
				admin.Gakoa();
			}

		});

	}

}
