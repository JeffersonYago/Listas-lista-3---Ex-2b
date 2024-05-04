package controller;

import model.Lista;

public class Ex2bController {

	public Ex2bController() {
		super();
	}
	
	public void carregaListas() {
		Lista<Integer> a = new Lista<>();
		Lista<Integer> b = new Lista<>();
		try {
		a.addFirst(3);
		a.addLast(5);
		a.addLast(8);
		a.addLast(12);
		a.addLast(9);
		a.addLast(7);
		a.addLast(16);
		b.addFirst(9);
		b.addLast(6);
		b.addLast(2);
		b.addLast(3);
		b.addLast(7);
		}catch (Exception e) {
		}
		manipulaListas(a,b);
	}
	
	private void manipulaListas(Lista<Integer> a, Lista<Integer> b) {
		Lista<Integer> i = new Lista<>();
		Lista<Integer> u = new Lista<>();
		interseccaoListas(a,b,i);
		int tamanho = a.size();
		int percorrer = 0;
		try {
			while(percorrer < tamanho) {
				if(u.isEmpty()) {
					u.addFirst(a.get(percorrer));
					u.addLast(b.get(percorrer));
				} else if (percorrer < b.size()){
					u.addLast(a.get(percorrer));
					u.addLast(b.get(percorrer));
				} else {
					u.addLast(a.get(percorrer));
				}
					percorrer++;
			}
		}catch (Exception e) {
			}
		exibirFilas(i,u);
	}
		
	private void interseccaoListas(Lista<Integer> a, Lista<Integer> b, Lista<Integer> i) {
		int tama = a.size();
		int tamb = b.size();
		for(int z = 0; z < tama; z++) {
			for(int x = 0; x < tamb; x++) {
				try {
				int auxa = a.get(z);
				int auxiliarb = b.get(x);
				if(auxa == auxiliarb && i.isEmpty()) {
					i.addFirst(auxa);
				}else if(auxa == auxiliarb) {
					i.addLast(auxa);
				}
				}catch (Exception e) {
				}
			}
		}
	}
	
	private void exibirFilas(Lista<Integer> i, Lista<Integer> u) {
		int cont = 0;
		try {
			System.out.println("Lista I: ");
		do {
			System.out.print("["+i.get(cont)+"] "+"--> ");
			cont++;
		} while(cont < i.size());
		cont = 0;
		System.out.print("\n\nLista U: \n");
		do {
			System.out.print("["+u.get(cont)+"] "+"--> ");
			cont++;
		} while(cont < u.size());
	}catch (Exception e) {
	}
  }
}