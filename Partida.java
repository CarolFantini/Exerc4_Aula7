package exerc4;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {

	private Time mandante;
	private Time visitante;
	private int golsMandante;
	private int golsVisitante;
	private int publicoPresente;

	Partida(Time mandante, Time visitante, int golsMandante, int golsVisitante, int publicoPresente) {
		this.mandante = mandante;
		this.visitante = visitante;
		this.golsMandante = golsMandante;
		this.golsVisitante = golsVisitante;
		this.publicoPresente = publicoPresente;
	}

	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public int getGolsMandante() {
		return golsMandante;
	}

	public void setGolsVisitante(int golsMandante) {
		this.golsMandante = golsMandante;
	}

	public int getGolsVisitante() {
		return golsVisitante;
	}

	public void setGolsTimeB(int golsVisitante) {
		this.golsVisitante = golsVisitante;
	}

	public int getPublicoPresente() {
		return publicoPresente;
	}

	public void setPublicoPresente(int publicoPresente) {
		this.publicoPresente = publicoPresente;
	}

	public void registrarPartida() {
		Scanner in = new Scanner(System.in);
		String mand, visi, resultado;
		int golsMandante, golsVisitante, publicoPresente;
		Time mandante;
		Time visitante;

		System.out.println("Insira o nome do time mandante.");
		mand = in.nextLine();
		System.out.println("Insira o nome do time visitante.");
		visi = in.nextLine();
		System.out.println("Insira quantos gols o time mandante fez.");
		golsMandante = in.nextInt();
		System.out.println("Insira  quantos gols o time visitante fez.");
		golsVisitante = in.nextInt();
		System.out.println("Insira o público presente da partida.");
		publicoPresente = in.nextInt();

		mandante = Campeonato.checaTime(mand);
		visitante = Campeonato.checaTime(visi);

		if (golsMandante > golsVisitante) {

			resultado = mand + " venceu " + visi + " por: " + golsMandante + " x " + golsVisitante;

			mandante.addVitoria();
			mandante.addGolsPro(golsMandante);
			mandante.addGolsContra(golsVisitante);

			visitante.addDerrota();
			visitante.addGolsPro(golsVisitante);
			visitante.addGolsContra(golsMandante);

		} else if (golsVisitante > golsMandante) {

			resultado = visi + " venceu " + mand + " por: " + golsVisitante + " x " + golsMandante;

			mandante.addDerrota();
			mandante.addGolsPro(golsMandante);
			mandante.addGolsContra(golsVisitante);

			visitante.addVitoria();
			visitante.addGolsPro(golsVisitante);
			visitante.addGolsContra(golsMandante);

		} else {

			resultado = mand + " e " + visi + "empataram.";

			mandante.addEmpate();
			mandante.addGolsPro(golsMandante);
			mandante.addGolsContra(golsVisitante);

			visitante.addEmpate();
			visitante.addGolsPro(golsVisitante);
			visitante.addGolsContra(golsMandante);

		}

		Partida partida = new Partida(mandante, visitante, golsMandante, golsVisitante, publicoPresente);

		System.out.println(resultado);
		Campeonato.classificacao.add(mandante);
		Campeonato.classificacao.add(visitante);
	}
}