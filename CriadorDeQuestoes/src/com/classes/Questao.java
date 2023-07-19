package com.classes;

import java.util.ArrayList;
import java.util.List;

public class Questao {

	String pergunta;
	String respostaCorreta;

	public Questao(String pergunta) {
		this.pergunta = pergunta;
		List<Alternativas> alternativas = new ArrayList<Alternativas>();

	}

	public void adicionarOpcao(String opcao) {
		Alternativas alterna = new Alternativas();
		alterna.setOpcões(opcao);
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

}
