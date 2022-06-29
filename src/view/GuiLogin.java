package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiLogin frame = new GuiLogin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiLogin() {
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setName("frLogin\r\n");
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setForeground(new Color(0, 128, 0));
		panel.setBounds(0, 0, 384, 561);
		contentPane.add(panel);
		panel.setLayout(null);

		JTextArea txtrBemVindoDe = new JTextArea();
		txtrBemVindoDe.setEditable(false);
		txtrBemVindoDe.setLineWrap(true);
		txtrBemVindoDe.setBackground(new Color(0, 100, 0));
		txtrBemVindoDe.setForeground(new Color(255, 255, 255));
		txtrBemVindoDe.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtrBemVindoDe.setText("Bem vindo de           volta");
		txtrBemVindoDe.setBounds(70, 142, 250, 99);
		panel.add(txtrBemVindoDe);

		JLabel lbltexto = new JLabel("Acesse sua conta.");
		lbltexto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbltexto.setForeground(new Color(255, 255, 255));
		lbltexto.setBounds(130, 287, 121, 14);
		panel.add(lbltexto);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



				GuiHome home = new GuiHome();
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();

			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(0, 100, 0));
		btnEntrar.setBounds(new Rectangle(50, 50, 50, 50));
		btnEntrar.setBounds(145, 341, 89, 23);
		panel.add(btnEntrar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                dispose();
				
			}

		});
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setBounds(new Rectangle(50, 50, 50, 50));
		btnCancelar.setBackground(new Color(0, 100, 0));
		btnCancelar.setBounds(145, 375, 89, 23);
		panel.add(btnCancelar);

		JLabel lblNewLabel = new JLabel("IntelSinal");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.ITALIC, 42));
		lblNewLabel.setBounds(475, 128, 232, 33);
		contentPane.add(lblNewLabel);

		JLabel lblSistemas = new JLabel("sistemas");
		lblSistemas.setForeground(new Color(0, 100, 0));
		lblSistemas.setFont(new Font("Eras Bold ITC", Font.ITALIC, 16));
		lblSistemas.setBounds(610, 159, 78, 19);
		contentPane.add(lblSistemas);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(0, 100, 0));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(434, 300, 46, 14);
		contentPane.add(lblNome);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(0, 100, 0));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(434, 336, 46, 14);
		contentPane.add(lblSenha);

		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNome.setBounds(492, 299, 215, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtsenha = new JPasswordField();
		txtsenha.setFont(new Font("Arial", Font.PLAIN, 12));
		txtsenha.setBounds(490, 335, 217, 20);
		contentPane.add(txtsenha);

		JLabel lblPara = new JLabel("Para cria\u00E7\u00E3o de usu\u00E1rios contate o administrador.");
		lblPara.setForeground(new Color(0, 100, 0));
		lblPara.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPara.setBounds(475, 486, 247, 14);
		contentPane.add(lblPara);
	}
}
