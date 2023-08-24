package com.classes;

import java.util.ArrayList;
import java.util.List;

public class Questao {

	String pergunta;
	String correta;
	private boolean corretaRespondida;

	public Questao() {
		corretaRespondida = false;
	}

	// Lista para armazenar as 4 alternativas dentro de uma questão.

	List<Alternativas> alternativas = new ArrayList<Alternativas>();

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public List<Alternativas> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<Alternativas> alternativas) {
		this.alternativas = alternativas;
	}

	public String getCorreta() {
		return correta;
	}

	public void setCorreta(String correta) {
		this.correta = correta;
	}

	// Método para evitar que a pergunta de verificação da resposta correta seja
	// exibida caso já exista uma resposta correta registrada.

	public void armazenarCorreta() {
		if (!corretaRespondida) {
			corretaRespondida = true;
			System.out.println("Armazenando...");

		}

	}

	// Este método está atualmente sem utilidade, no entanto, em breve farei
	// modificações no código para sua utilização.

	public void naoArmazenar() {
		if (corretaRespondida) {
			corretaRespondida = false;
			System.out.println("Outra pegunta");

		} else {
			System.out.println("Ja foi respondida");
		}

	}

	// Retorna se a pergunta já foi respondida ou ainda não recebeu resposta.

	public boolean estaRespondida() {
		return corretaRespondida;
	}

}
