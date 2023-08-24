package com.executaveis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.classes.Alternativas;
import com.classes.Questao;

public class exe {

	public static void main(String[] args) {

		// Lista de questoes
		List<Questao> questoes = new ArrayList<>();

		// Quantidade de questões que o usuario deseja criar
		String quantia = JOptionPane.showInputDialog("Quantas questões deseja criar ? Digite o numero : ");
		int quantidade = Integer.valueOf(quantia);

		// laço para capturar o numero de questoes que o usuario escolheu
		for (int i = 0; i < quantidade; i++) {

			// Capturando o enunciado da questão.
			String enunciado = JOptionPane.showInputDialog("DIGITE SUA " + (i + 1) + "º PERGUNTA AQUI: ");

			// estanciado a class questão para armazenar as perguntas junto com a resposta
			// correta
			Questao questao = new Questao();
			questao.setPergunta(enunciado);

			// Loop de repetição para capturar as opções das alternativas da letra 'A' até a
			// letra 'D'.
			for (char j = 'A'; j <= 'D'; j++) {

				Alternativas corretaA = new Alternativas();

				String alternativa = JOptionPane.showInputDialog("Digite sua alternativa, letra " + j);
				corretaA.setAlternativa(j + ") " + alternativa);

				// Adicionando as alternativas à questão atual.
				questao.getAlternativas().add(corretaA);

				// Verificando se já existe uma resposta correta armazenada; se for verdadeiro,
				// o fluxo segue para o bloco "else".
				// Se for falso, o programa entra no bloco "if" e pergunta ao usuário se a
				// resposta atual é a correta.
				if (questao.estaRespondida() == false) {

					String respostaCorreta = JOptionPane
							.showInputDialog("Esta é a alternativa correta? digite (sim) ou (nao)");

					// Se for 'sim', o programa entra no bloco "if" e armazena a alternativa atual
					// como a resposta correta.
					if (respostaCorreta.equalsIgnoreCase("sim")) {

						// Ação de assinalar a presença de uma resposta correta na questão atual,
						// evitando conter duas questões em uma única pergunta.
						questao.armazenarCorreta();

						// Adicionando-a à lista de respostas corretas.
						questao.setCorreta(alternativa);

					}
				}

			}
			questoes.add(questao);
		}

		// Uso do loop "foreach" para exibir as perguntas no terminal.

		for (Questao questaoo : questoes) {
			System.out.println("Perguntas : " + questaoo.getPergunta());

			System.out.println("--------------------------------");

			// Mostrar as alternativas no terminal.
			for (Alternativas alter : questaoo.getAlternativas()) {
				System.out.println("Alternativas :" + alter.getAlternativa());

			}
			// Exibir a resposta correta da pergunta atual no terminal.
			System.out.println("------------------------------------");
			System.out.println("A resposta correta é " + questaoo.getCorreta());
			System.out.println("-------------------------------------");

		}

	}
}
