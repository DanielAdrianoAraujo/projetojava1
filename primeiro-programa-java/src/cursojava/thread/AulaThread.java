package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNf = new Thread(thread2);
		threadNf.start();

		System.out.println("Chegou ao Fim");
		JOptionPane.showMessageDialog(null, "Sistema Continua Executando");
	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 5; pos++) {
				System.out.println("Testando Thread 2");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			for (int pos = 0; pos < 5; pos++) {
				System.out.println("Testando Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};

}
