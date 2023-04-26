package com.executaveis;

import com.classes.Questoes;
import com.classes.Alternativas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class exe {

	public static void main(String[] ags) {

		List<Questoes> perguntas = new ArrayList<Questoes>();

		String quantidadeA = JOptionPane.showInputDialog("Quantas questões voce deseja criar ?");

		int quantidade = Integer.valueOf(quantidadeA);

		for (int i = 0; i < quantidade; i++) {
			Questoes questao = new Questoes();
			String pergunta = JOptionPane.showInputDialog("Por favor, digite sua " + (i + 1) + "º" + " pergunta aqui");
			questao.setPergunta(pergunta);
			perguntas.add(questao);

			for (char letras = 'a'; letras <= 'd'; letras++) {
				Alternativas alternativa = new Alternativas();
				String respostas = JOptionPane.showInputDialog(
						"Letra " + letras + ": (Digite a alternativa que deseja incluir na letra " + letras);
				alternativa.setAlternativa(respostas);

				int corretas = JOptionPane.showConfirmDialog(null, "Essa é a resposta correta?");

				if (corretas == 1) {
					alternativa.setCorreta(respostas);
				} else {
				}

				questao.getAlternativa().add(alternativa);

			}

		}

		for (Questoes questoes1 : perguntas) {
			System.out.println(questoes1.getPergunta());
			System.out.println("--------------------------------------");
			for (Alternativas respostas1 : questoes1.getAlternativa()) {
				System.out.println(respostas1.getAlternativa());
				
			}

		}

	}

}
