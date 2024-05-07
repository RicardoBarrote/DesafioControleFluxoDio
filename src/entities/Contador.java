package entities;

import excecao.ParametrosInvalidosException;

public class Contador {

	private int parametroUm;
	private int parametroDois;

	public Contador() {

	}

	public Contador(int parametroUm, int parametroDois) {
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}

	public int getParametroUm() {
		return parametroUm;
	}

	public void setParametroUm(int parametroUm) {
		this.parametroUm = parametroUm;
	}

	public int getParametroDois() {
		return parametroDois;
	}

	public void setParametroDois(int parametroDois) {
		this.parametroDois = parametroDois;
	}

	public  void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm < parametroDois) {
			throw new ParametrosInvalidosException("Erro: parametroUm não pode ser menor que o parametroDois. ");
		}
		
		else {
			 int  contador  = parametroUm - parametroDois;
			 for (int i = 0; i < contador; i++) {
				 System.out.println("Número: " + (i + 1));
			 }
		}

	}

}
