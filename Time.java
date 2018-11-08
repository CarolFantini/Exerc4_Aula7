package exerc4;

import java.util.ArrayList;
import java.util.Scanner;

public class Time {
	
	public static ArrayList<Atleta> atletasDoTime;
	private String nome;
	private int vitorias, derrotas, empates, golsPro, golsContra;

	Time(String nome, int vitorias, int derrotas, int empates, int golsPro, int golsContra) {
		this.nome = nome;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.golsPro = golsPro;
		this.golsContra = golsContra;
		atletasDoTime = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return (vitorias * 3) + empates;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public void addVitoria() {
		this.vitorias++;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void addEmpate() {
		this.empates++;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public void addDerrota() {
		this.derrotas++;
	}

	public int getGolsPro() {
		return golsPro;
	}

	public void setGolsPro(int golspro) {
		this.golsPro = golspro;
	}

	public void addGolsPro(int golspro) {
		this.golsPro += golspro;
	}

	public int getGolsContra() {
		return golsContra;
	}

	public void setGolsContra(int golscontra) {
		this.golsContra = golscontra;
	}

	public void addGolsContra(int golscontra) {
		this.golsContra += golscontra;
	}

	public int getSaldoGols() {
		return golsPro - golsContra;
	}

	public void iniciarTime() {
		Scanner in = new Scanner(System.in);
		String nome;
		int vitorias = 0, derrotas = 0, empates = 0, golsPro = 0, golsContra = 0;

		System.out.println("Insira o nome do time.");
		nome = in.nextLine();

		Time time = new Time(nome, vitorias, derrotas, empates, golsPro, golsContra);
		Campeonato.classificacao.add(time);

		// Estou comparando o nome do time de cada atleta com o nome de cada
		// time.
		// Assim, se o time do atleta for igual ao time em questão, ele é
		// adicionado ao elenco do time.
		for (int cont = 0; cont < Atleta.atletas.size(); cont++) {
			if ((time.getNome().equals(Atleta.atletas.get(cont).getTime()))) {
				atletasDoTime.add(Atleta.atletas.get(cont));
			}
		}
	}
}