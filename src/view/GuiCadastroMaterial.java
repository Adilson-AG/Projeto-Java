package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import java.awt.SystemColor;

public class GuiCadastroMaterial extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoMaterial;
	private JTextField txtDescricaoMaterial;
	private JTextField txtQuantidadeMaterial;
	private JTextField txtCodSubCategoriaMaterial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCadastroMaterial frame = new GuiCadastroMaterial();
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
	public GuiCadastroMaterial() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100,800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de  material");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setBounds(186, 61, 393, 46);
		lblNewLabel.setIcon(new ImageIcon(GuiCadastroMaterial.class.getResource("/view/cadastro.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setBounds(73, 174, 66, 14);
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel_1_1.setBounds(78, 209, 66, 14);
		lblNewLabel_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantidade:");
		lblNewLabel_1_1_1.setBounds(250, 174, 87, 14);
		lblNewLabel_1_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("C\u00F3digo subcategoria :");
		lblNewLabel_1_1_2.setBounds(445, 174, 139, 14);
		lblNewLabel_1_1_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1_2);
		
		txtCodigoMaterial = new JTextField();
		txtCodigoMaterial.setBounds(121, 172, 86, 20);
		contentPane.add(txtCodigoMaterial);
		txtCodigoMaterial.setColumns(10);
		
		txtDescricaoMaterial = new JTextField();
		txtDescricaoMaterial.setBounds(141, 207, 526, 20);
		txtDescricaoMaterial.setColumns(10);
		contentPane.add(txtDescricaoMaterial);
		
		txtQuantidadeMaterial = new JTextField();
		txtQuantidadeMaterial.setBounds(333, 172, 54, 20);
		txtQuantidadeMaterial.setColumns(10);
		contentPane.add(txtQuantidadeMaterial);
		
		txtCodSubCategoriaMaterial = new JTextField();
		txtCodSubCategoriaMaterial.setBounds(583, 172, 86, 20);
		txtCodSubCategoriaMaterial.setColumns(10);
		contentPane.add(txtCodSubCategoriaMaterial);
		
		JButton btnCadastrarMaterial = new JButton("Cadastrar");
		btnCadastrarMaterial.setForeground(new Color(0, 100, 0));
		btnCadastrarMaterial.setBackground(new Color(153, 204, 153));
		btnCadastrarMaterial.setBounds(73, 466, 103, 23);
		contentPane.add(btnCadastrarMaterial);
		
		JButton btnAlterarMaterial = new JButton("Alterar");
		btnAlterarMaterial.setForeground(new Color(0, 100, 0));
		btnAlterarMaterial.setBackground(new Color(153, 204, 153));
		btnAlterarMaterial.setBounds(186, 466, 112, 23);
		contentPane.add(btnAlterarMaterial);
		
		JButton btnExcluirMaterial = new JButton("Excluir");
		btnExcluirMaterial.setForeground(new Color(0, 100, 0));
		btnExcluirMaterial.setBackground(new Color(153, 204, 153));
		btnExcluirMaterial.setBounds(625, 408, 89, 23);
		contentPane.add(btnExcluirMaterial);
		
		JButton btnCancelarMaterial = new JButton("Cancelar");
		btnCancelarMaterial.setForeground(new Color(0, 100, 0));
		btnCancelarMaterial.setBackground(new Color(153, 204, 153));
		btnCancelarMaterial.setBounds(308, 466, 103, 23);
		contentPane.add(btnCancelarMaterial);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(new Color(0, 100, 0));
		btnConsultar.setBackground(new Color(153, 204, 153));
		btnConsultar.setBounds(526, 408, 89, 23);
		contentPane.add(btnConsultar);
		
		JList listConsultaMaterial = new JList();
		listConsultaMaterial.setBackground(Color.WHITE);
		listConsultaMaterial.setBounds(62, 248, 661, 149);
		contentPane.add(listConsultaMaterial);
	}
}
