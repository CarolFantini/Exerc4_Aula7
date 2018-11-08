package exerc4;

import java.util.ArrayList;
import java.util.Collections;

public class Campeonato {

	public static ArrayList<Time> classificacao = new ArrayList<>();
	private String nome;

	Campeonato() {
		this.nome = "Campeonato Brasileiro";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Time checaTime(String time) {
		Time timeEncontrado;
		int aux = 0;

		for (Time cont : classificacao) {
			if (classificacao.contains(time)) {
				timeEncontrado = classificacao.get(aux);
				return timeEncontrado;
			}
			aux++;
		}
		return null;
	}

	public void organizaClassificacao(Time time) {
		for (int aux = 0; aux < classificacao.size(); aux++) {
			if (classificacao.get(aux).getPontos() <= classificacao.get(aux + 1).getPontos()) {
				if (classificacao.get(aux).getVitorias() <= classificacao.get(aux + 1).getVitorias()) {
					if (classificacao.get(aux).getSaldoGols() <= classificacao.get(aux + 1).getSaldoGols()) {
						if (classificacao.get(aux).getGolsPro() <= classificacao.get(aux + 1).getGolsPro()) {
							Collections.swap(classificacao, aux, aux + 1);
						}
					}
				}

			}
			System.out.println("O campeão é: " + classificacao.get(0));
		}
	}
}