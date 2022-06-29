package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.FornecedorControle;
import java.awt.ComponentOrientation;
import java.awt.Window.Type;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GuiCadastroFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCNPJ;
	private JTextField txtTelefone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCadastroFornecedor frame = new GuiCadastroFornecedor();
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
	public GuiCadastroFornecedor() {
		setLocationByPlatform(true);
		setTitle("Cadastro de fornecedor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome /Raz\u00E3o social:");
		lblNome.setForeground(new Color(0, 100, 0));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblCNPJ = new JLabel("CNPJ:");
		lblCNPJ.setForeground(new Color(0, 100, 0));
		lblCNPJ.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtCNPJ = new JTextField();
		txtCNPJ.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(new Color(0, 100, 0));
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar");
		btnCadastrarFornecedor.addActionListener(new ActionListener() {
			
			/**
			 * captura dados inseridos na tela
			 */
			public void actionPerformed(ActionEvent e) {
				boolean sucesso;
				try{
					FornecedorControle fornecedorControle = new FornecedorControle();
					sucesso = fornecedorControle.cadastrarFornecedor(txtNome.getText(),txtCNPJ.getText(),txtTelefone.getText(),txtEmail.getText());
					if(sucesso == true) {
						
						JOptionPane.showMessageDialog(null,"Fornecedor cadastrado com sucesso!!");
						limpaTela(e);
					}
					else {
						JOptionPane.showMessageDialog(null,"Fornecedor não cadastrado, preencha todos os campos!!");
						limpaTela(e);
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Erro: " + ex);
					
				}
				
			}
		});
		btnCadastrarFornecedor.setForeground(new Color(0, 100, 0));
		btnCadastrarFornecedor.setBackground(new Color(153, 204, 153));
		
		JButton btnAlterarFornecedor = new JButton("Alterar");
		btnAlterarFornecedor.setForeground(new Color(0, 100, 0));
		btnAlterarFornecedor.setBackground(new Color(153, 204, 153));
		
		JButton btnCancelarFornecedor = new JButton("Cancelar");
		btnCancelarFornecedor.setForeground(new Color(0, 100, 0));
		btnCancelarFornecedor.setBackground(new Color(153, 204, 153));
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(new Color(0, 100, 0));
		btnConsultar.setBackground(new Color(153, 204, 153));
		
		JButton btnExcluirFornecedor = new JButton("Excluir");
		btnExcluirFornecedor.setForeground(new Color(0, 100, 0));
		btnExcluirFornecedor.setBackground(new Color(153, 204, 153));
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(new Color(0, 100, 0));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		JList listConsultaFornecedor = new JList();
		listConsultaFornecedor.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(173, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblCNPJ, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
							.addComponent(txtCNPJ, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
					.addGap(74)
					.addComponent(lblTelefone)
					.addGap(10)
					.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(223))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)))
					.addGap(223))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(509, Short.MAX_VALUE)
					.addComponent(btnConsultar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnExcluirFornecedor, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(77))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnCadastrarFornecedor, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnAlterarFornecedor, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnCancelarFornecedor, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(listConsultaFornecedor, GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
							.addGap(62))))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(117)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
					.addGap(106))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCNPJ, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtCNPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addComponent(listConsultaFornecedor, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnConsultar)
						.addComponent(btnExcluirFornecedor))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnCadastrarFornecedor)
						.addComponent(btnAlterarFornecedor, Alignment.TRAILING)
						.addComponent(btnCancelarFornecedor, Alignment.TRAILING))
					.addGap(60))
		);
		
		JLabel lblCadastroDeFornecedores = new JLabel("Cadastro de Fornecedores ");
		panel.add(lblCadastroDeFornecedores);
		lblCadastroDeFornecedores.setIcon(new ImageIcon(GuiCadastroFornecedor.class.getResource("/view/cadastro.png")));
		lblCadastroDeFornecedores.setForeground(new Color(0, 153, 51));
		lblCadastroDeFornecedores.setFont(new Font("Tahoma", Font.BOLD, 32));
		contentPane.setLayout(gl_contentPane);
	}
	/**
	 * Limpa campos preenchidos após uma ação
	 * @param e - recebe um evento ocorrido
	 */
	public void limpaTela(ActionEvent e) {
		txtCNPJ.setText(" ");
		txtEmail.setText("");
		txtNome.setText("");
		txtTelefone.setText("");
			
		
	}
}
