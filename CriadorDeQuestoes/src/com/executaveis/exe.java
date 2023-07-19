package com.executaveis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.classes.Questao;

public class exe {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Questao> questoes = new ArrayList<>();

		// Criar e adicionar questões à lista

		System.out.println("Quantas questões deseja criar ? Digite o numero : ");

		int quantidade = entrada.nextInt();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("DIGITE SUA PERGUNTA AQUI: ");

			String enunciado = entrada.next();

			Questao questao = new Questao(enunciado);

			for (char j = 'a'; j < 'e'; j++) {

				System.out.println("Digite sua alternativa " + j + "aqui: ");
				String alternativas = entrada.next();
				questao.adicionarOpcao(alternativas);

				System.out.println("Essa é a alternativa correta? Digite Sim ou Nao:");
				String altenativaCorreta = entrada.next();

				if (altenativaCorreta.equalsIgnoreCase("sim")) {

					questao.setRespostaCorreta(String.valueOf(j));
				}
				
				questoes.add(questao);
			}
		}
		entrada.close();
	}

}
