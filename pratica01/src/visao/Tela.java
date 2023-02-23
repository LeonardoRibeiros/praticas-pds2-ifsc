package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField nometxt;
	private JTextField cpftxt;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nometxt = new JTextField();
		nometxt.setBounds(39, 112, 328, 32);
		contentPane.add(nometxt);
		nometxt.setColumns(10);
		
		cpftxt = new JTextField();
		cpftxt.setBounds(39, 167, 328, 32);
		contentPane.add(cpftxt);
		cpftxt.setColumns(10);
		
		JButton btcadastrar = new JButton("Cadastrar");
		btcadastrar.setFocusPainted(false);
		btcadastrar.setForeground(new Color(255, 255, 255));
		btcadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btcadastrar.setBackground(new Color(205, 92, 92));
		btcadastrar.setBorder(null);
		btcadastrar.setBounds(39, 258, 328, 32);
		contentPane.add(btcadastrar);
		
		lblNewLabel = new JLabel("CADASTRO");
		lblNewLabel.setBorder(null);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 27, 328, 45);
		contentPane.add(lblNewLabel);
	}
}
