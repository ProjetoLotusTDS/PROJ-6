package exercicio21;

import java.util.Scanner;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	private String saude;

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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSaude() {
		return saude;
	}

	public void setSaude(String saude) {
		this.saude = saude;
	}

	public static String verificarSexo(String frase, String sexo) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		boolean condition = true;
		do {

			try {
				sexo = sexo.toUpperCase();
				if (sexo.equals("M")) {

					condition = false;
					sexo = "Masculino";

				} else if (sexo.equals("F")) {

					condition = false;
					sexo = "Feminino";

				} else {

					System.out.println("Inválido, Digite somente (M)(F) : ");
					System.out.print(frase);
					sexo = scanner.nextLine();

				}

			} catch (Exception e) {
				System.out.println("Inválido, Digite somente (M)(F) : ");
				System.out.print(frase);
				sexo = scanner.nextLine();
			}

		} while (condition);

		return sexo;
	}

	public String verificarSaude(String frase, String saude) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		boolean condition = true;
		do {

			try {
				saude = saude.toUpperCase();
				if (saude.equals("SAUDAVEL")) {
					saude = "Saudavel";
					condition = false;

				} else if (saude.equals("DOENTE")) {
					saude = "Doente";
					condition = false;
				} else {
					
					System.out.println("Inválido, Digite somente (saudavel) (doente) : ");
					System.out.print(frase);
					saude = scanner.nextLine();

				}

			} catch (Exception e) {
				System.out.println("Inválido, Digite somente (saudavel) (doente) : ");
				System.out.print(frase);
				saude = scanner.nextLine();
			}

		} while (condition);

		return saude;
	}

}