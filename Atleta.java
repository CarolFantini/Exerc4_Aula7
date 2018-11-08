package exerc4;

import java.util.ArrayList;
import java.util.Scanner;

public class Atleta {
	public static ArrayList<Atleta> atletas = new ArrayList<>();
	private String nome;
	private int idade;
	private String time;
	private String posicao;

	Atleta(String nome, int idade, String time, String posicao) {
		this.nome = nome;
		this.idade = idade;
		this.time = time;
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public void registrarAtleta() {
		Scanner in = new Scanner(System.in);
		String nome, time, posicao;
		int idade;

		System.out.println("Insira o nome do atleta.");
		nome = in.nextLine();
		System.out.println("Insira a idade do atleta");
		idade = in.nextInt();
		System.out.println("Insira o time do atleta.");
		time = in.nextLine();
		System.out.println("Insira a posição do atleta.");
		posicao = in.nextLine();

		Atleta atleta = new Atleta(nome, idade, time, posicao);
		atletas.add(atleta);
	}
}