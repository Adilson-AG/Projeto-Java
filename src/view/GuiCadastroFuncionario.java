package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class GuiCadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodFuncionario;
	private JTextField txtLoginFuncionario;
	private JTextField txtCadastroSenha;
	private JTextField txtEmailFuncinario;
	private JTextField txtCadastroNomeFuncionario;
	private JTextField txtCadastroCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCadastroFuncionario frame = new GuiCadastroFuncionario();
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
	public GuiCadastroFuncionario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeFuncionrios = new JLabel("Cadastro de Funcion\u00E1rios ");
		lblCadastroDeFuncionrios.setIcon(new ImageIcon(GuiCadastroFuncionario.class.getResource("/view/cadastro.png")));
		lblCadastroDeFuncionrios.setForeground(new Color(0, 100, 0));
		lblCadastroDeFuncionrios.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblCadastroDeFuncionrios.setBounds(156, 43, 472, 46);
		contentPane.add(lblCadastroDeFuncionrios);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(67, 157, 52, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCodFuncionario = new JTextField();
		txtCodFuncionario.setColumns(10);
		txtCodFuncionario.setBounds(115, 155, 86, 20);
		contentPane.add(txtCodFuncionario);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Login:");
		lblNewLabel_1_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(267, 157, 45, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtLoginFuncionario = new JTextField();
		txtLoginFuncionario.setColumns(10);
		txtLoginFuncionario.setBounds(312, 155, 134, 20);
		contentPane.add(txtLoginFuncionario);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Senha:");
		lblNewLabel_1_1_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(506, 157, 44, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtCadastroSenha = new JTextField();
		txtCadastroSenha.setColumns(10);
		txtCadastroSenha.setBounds(560, 155, 159, 20);
		contentPane.add(txtCadastroSenha);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome :");
		lblNewLabel_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(67, 186, 129, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("E-mail:");
		lblNewLabel_1_1_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3.setBounds(67, 217, 45, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		txtEmailFuncinario = new JTextField();
		txtEmailFuncinario.setColumns(10);
		txtEmailFuncinario.setBounds(111, 215, 280, 20);
		contentPane.add(txtEmailFuncinario);
		
		txtCadastroNomeFuncionario = new JTextField();
		txtCadastroNomeFuncionario.setColumns(10);
		txtCadastroNomeFuncionario.setBounds(115, 184, 392, 20);
		contentPane.add(txtCadastroNomeFuncionario);
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar");
		btnCadastrarFuncionario.setForeground(new Color(0, 100, 0));
		btnCadastrarFuncionario.setBackground(new Color(153, 204, 153));
		btnCadastrarFuncionario.setBounds(67, 465, 103, 23);
		contentPane.add(btnCadastrarFuncionario);
		
		JButton btnAlterarFuncionario = new JButton("Alterar");
		btnAlterarFuncionario.setForeground(new Color(0, 100, 0));
		btnAlterarFuncionario.setBackground(new Color(153, 204, 153));
		btnAlterarFuncionario.setBounds(180, 465, 112, 23);
		contentPane.add(btnAlterarFuncionario);
		
		JList listConsultaFuncionario = new JList();
		listConsultaFuncionario.setBackground(Color.WHITE);
		listConsultaFuncionario.setBounds(61, 249, 661, 131);
		contentPane.add(listConsultaFuncionario);
		
		JButton btnCancelarFuncionario = new JButton("Cancelar");
		btnCancelarFuncionario.setForeground(new Color(0, 100, 0));
		btnCancelarFuncionario.setBackground(new Color(153, 204, 153));
		btnCancelarFuncionario.setBounds(302, 465, 103, 23);
		contentPane.add(btnCancelarFuncionario);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(new Color(0, 100, 0));
		btnConsultar.setBackground(new Color(153, 204, 153));
		btnConsultar.setBounds(519, 391, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnExcluirFuncionario = new JButton("Excluir");
		btnExcluirFuncionario.setForeground(new Color(0, 100, 0));
		btnExcluirFuncionario.setBackground(new Color(153, 204, 153));
		btnExcluirFuncionario.setBounds(618, 391, 89, 23);
		contentPane.add(btnExcluirFuncionario);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Cargo:");
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2_1.setBounds(517, 188, 45, 14);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		txtCadastroCargo = new JTextField();
		txtCadastroCargo.setColumns(10);
		txtCadastroCargo.setBounds(560, 184, 159, 20);
		contentPane.add(txtCadastroCargo);
		
		JCheckBox chckbxAdministrador = new JCheckBox("Administrador ");
		chckbxAdministrador.setForeground(new Color(0, 100, 0));
		chckbxAdministrador.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxAdministrador.setBounds(506, 214, 122, 23);
		contentPane.add(chckbxAdministrador);
	}
}
