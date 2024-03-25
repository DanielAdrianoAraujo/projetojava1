package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() {
				for (int pos = 0; pos < 5; pos++) {
					System.out.println("Testando Thread");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

		}.start(); // Start liga a thread e fica processando

		
		
//		****************Thread 2*****************************************************
		
		new Thread() {
			public void run() {
				for (int pos = 0; pos < 5; pos++) {
					System.out.println("Testando Thread 2");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

		}.start(); // Start liga a thread e fica processando

		
		System.out.println("Chegou ao Fim");
		JOptionPane.showMessageDialog(null, "Sistema Continua Executando");
	}

}
