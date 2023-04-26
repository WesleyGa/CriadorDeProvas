package com.classes;

import java.util.ArrayList;
import java.util.List;

public class Questoes {

	private String pergunta;

	public Questoes() {

	}

	List<Alternativas> alternativa = new ArrayList<Alternativas>();

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public List<Alternativas> getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(List<Alternativas> alternativa) {
		this.alternativa = alternativa;
	}

}
