package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
public class GuiHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiHome frame = new GuiHome();
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
	public GuiHome() {
		setTitle("Home");
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(0, 0));
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(UIManager.getBorder("Menu.border"));
		menuBar.setPreferredSize(new Dimension(0, 0));
		menuBar.setMinimumSize(new Dimension(0, 0));
		menuBar.setMaximumSize(new Dimension(0, 0));
		menuBar.setBackground(new Color(153, 204, 153));

		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio:");
		lblNewLabel_1.setForeground(new Color(102, 153, 102));

		JLabel lblNewLabel = new JLabel("IntelSinal");
		lblNewLabel.setDisplayedMnemonic(KeyEvent.VK_UP);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(153, 204, 153));
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.ITALIC, 46));

		JLabel lblSistemas = new JLabel("sistemas");
		lblSistemas.setDisplayedMnemonic(KeyEvent.VK_UP);
		lblSistemas.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSistemas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemas.setForeground(new Color(153, 204, 153));
		lblSistemas.setFont(new Font("Eras Bold ITC", Font.ITALIC, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(21)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addGap(272)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(142)
										.addComponent(lblSistemas, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
						.addGap(262))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGap(187)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(41)
										.addComponent(lblSistemas))
								.addComponent(lblNewLabel))
						.addPreferredGap(ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1)
						.addGap(1))
				);

		JMenu mnCadastro = new JMenu("Cadastro");
		mnCadastro.setMargin(new Insets(0, 0, 2, 2));
		menuBar.add(mnCadastro);
		mnCadastro.setIcon(new ImageIcon(GuiHome.class.getResource("/view/cadastro.png")));
		mnCadastro.setBorderPainted(true);
		mnCadastro.setFont(new Font("Tahoma", Font.BOLD, 13));
		mnCadastro.setBackground(new Color(153, 204, 153));

		JMenuItem mnConsultaPedido = new JMenuItem("Pedido");
		mnConsultaPedido.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnConsultaPedido.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastro.add(mnConsultaPedido);

		JMenuItem mnConsultaFuncionario = new JMenuItem("Funcionario");
		mnConsultaFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnConsultaFuncionario.setBorderPainted(true);
		mnConsultaFuncionario.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastro.add(mnConsultaFuncionario);
		mnConsultaFuncionario.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCadastroFuncionario frame = new GuiCadastroFuncionario();
				frame.setVisible(true);

			}
		});

		JMenuItem mnCadastroFornecedor = new JMenuItem("Fornecedor");
		mnCadastroFornecedor.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastroFornecedor.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastroFornecedor.setActionCommand("");
		mnCadastro.add(mnCadastroFornecedor);

		mnCadastroFornecedor.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCadastroFornecedor frame = new GuiCadastroFornecedor();
				frame.setVisible(true);

			}
		});



		JMenuItem mnCadastroNF = new JMenuItem("Nota Fiscal");
		mnCadastroNF.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastroNF.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastro.add(mnCadastroNF);
		mnCadastroNF.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiNotaFiscal frame = new GuiNotaFiscal();
				frame.setVisible(true);

			}
		});

		JMenuItem mnCadastroCategoria = new JMenuItem("Categoria");
		mnCadastroCategoria.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastroCategoria.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastro.add(mnCadastroCategoria);
		mnCadastroCategoria.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCadastroCategoria frame = new GuiCadastroCategoria();
				frame.setVisible(true);

			}
		});

		JMenuItem mnCadastroSubCategoria = new JMenuItem("SubCategoria");
		mnCadastroSubCategoria.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastroSubCategoria.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastro.add(mnCadastroSubCategoria);
		mnCadastroSubCategoria.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCadastroSubCategoria frame = new GuiCadastroSubCategoria();
				frame.setVisible(true);

			}
		});


		JMenuItem mnCadastroMaterial = new JMenuItem("Material");
		mnCadastroMaterial.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastroMaterial.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastro.add(mnCadastroMaterial);
		contentPane.setLayout(gl_contentPane);
		mnCadastroMaterial.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCadastroMaterial frame = new GuiCadastroMaterial();
				frame.setVisible(true);

			}
		});
	}
}
