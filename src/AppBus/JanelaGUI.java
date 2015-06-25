package AppBus;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JanelaGUI extends JFrame {
	private JTextField textField;
	
	Guanabara guanabara = new Guanabara();
	Passageiro p = new Passageiro();
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JanelaGUI frame = new JanelaGUI();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public JanelaGUI() {
		setBounds(100, 100, 450, 308);
		
		JPanel PainelBotao = new JPanel();
		
		JPanel PainelRegistro = new JPanel();
		
		JPanel panel = new JPanel();
		
		JButton btnNewButton = new JButton("Carregar Lista");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guanabara.listarTransporte();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(170)
					.addComponent(btnNewButton)
					.addContainerGap(163, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(PainelRegistro, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(PainelBotao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(PainelBotao, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(PainelRegistro, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(21))
		);
		
		JButton Onibus = new JButton("Passagem de Onibus");
		Onibus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				p.comprarVaga(guanabara.transporte.get(0));
			}
		});
		
		JLabel lblComprarPassagem = new JLabel("Comprar Passagem:");
		
		JButton Topic = new JButton("Passagem de Topic");
		Topic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.comprarVaga(guanabara.transporte.get(1));
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(Onibus)
							.addGap(18)
							.addComponent(Topic))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(75)
							.addComponent(lblComprarPassagem)))
					.addContainerGap(151, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(lblComprarPassagem)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(Onibus)
						.addComponent(Topic))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JLabel lblId = new JLabel("ID onibus:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton NovoOnibus = new JButton("Adicionar Onibus");
		NovoOnibus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				guanabara.adicionarOnibus("075");
			}
		});
		GroupLayout gl_PainelRegistro = new GroupLayout(PainelRegistro);
		gl_PainelRegistro.setHorizontalGroup(
			gl_PainelRegistro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelRegistro.createSequentialGroup()
					.addGap(18)
					.addComponent(lblId)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(NovoOnibus)
					.addContainerGap(102, Short.MAX_VALUE))
		);
		gl_PainelRegistro.setVerticalGroup(
			gl_PainelRegistro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelRegistro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PainelRegistro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(NovoOnibus))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		PainelRegistro.setLayout(gl_PainelRegistro);
		
		JButton NovaTopic = new JButton("Adicionar Topic");
		NovaTopic.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				guanabara.adicionarTopic("06");
			}
		});
		
		JLabel lblIdTopic = new JLabel("ID topic:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_PainelBotao = new GroupLayout(PainelBotao);
		gl_PainelBotao.setHorizontalGroup(
			gl_PainelBotao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelBotao.createSequentialGroup()
					.addGap(18)
					.addComponent(lblIdTopic)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(NovaTopic)
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_PainelBotao.setVerticalGroup(
			gl_PainelBotao.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PainelBotao.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addGroup(gl_PainelBotao.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdTopic)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(NovaTopic))
					.addContainerGap())
		);
		PainelBotao.setLayout(gl_PainelBotao);
		getContentPane().setLayout(groupLayout);

	}
}
