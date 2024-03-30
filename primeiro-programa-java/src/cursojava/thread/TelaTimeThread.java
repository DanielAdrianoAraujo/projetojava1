package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{

	private JPanel jpanel = new JPanel(new GridBagLayout()); // Paniel de Componente
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
/*	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {  // Fica sempre rodando
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};  */
	
	/*
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {  // Fica sempre rodando
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}; */
	
	/*
	private Thread thread1Time;
	private Thread thread2Time; */
	
	public TelaTimeThread() {
		
		setTitle("Minha Tela de Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Gerenciador Controlador de Componentes
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		//mostraTempo.setEditable(false);
		jpanel.add(mostraTempo, gridBagConstraints);
		
		// Label 2
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		//mostraTempo2.setEditable(false);
		jpanel.add(mostraTempo2, gridBagConstraints);
		
		
		//**************************************
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jpanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jpanel.add(jButton2, gridBagConstraints);
		
		//jButton2.setEnabled(false);
				
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // Executa o Clique no Botao
				
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
					
				}
				
				for (int qtd = 0; qtd < 100; qtd++) { // Simulnado 100 envios em massa
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText() + " - " + qtd);
				
				fila.add(filaThread);
				
				}
				
				/*
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true); */
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // Executa o Clique no Botao
		
				fila.stop();
				fila = null;
				
		/*		
			try {
				thread1Time.stop();
				thread2Time.stop();
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			} catch (Exception e2) {
				e2.printStackTrace();
			} */
			}
		});
		
		fila.start();
		add(jpanel, BorderLayout.WEST);
		setVisible(true);
	
	}
	
}
