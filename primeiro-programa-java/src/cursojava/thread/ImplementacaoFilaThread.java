package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedDeque<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedDeque<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila Rodando");


		while(true) {
			

			synchronized (pilha_fila) { // Bloquear o acesso a esta lista por outros processos
				
				Iterator iteracao = pilha_fila.iterator();

				while (iteracao.hasNext()) { // Enquanto conter dados na lista ira processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // Pega o Objeto Atual

					System.out.println("---------------------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());

					iteracao.remove();

					try {
						Thread.sleep(1000); // Dar um tempo para descarga de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}


		try {
			Thread.sleep(1000); // Processo toda a lista, da um tempo para limpeza de memoria
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		}
	}
}
