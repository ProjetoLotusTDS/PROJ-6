package exercicio21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		int count = 1;
		boolean condition = true;
		String resposta;
		String idade;
		String sexo;
		String saude;

		do {

			Pessoa pessoa = new Pessoa();

			System.out.print("Digite o nome da pessoa " + count + " : ");
			pessoa.setNome(scanner.next());
			System.out.print("Digite a idade da pessoa " + count + " : ");
			idade = scanner.next();
			pessoa.setIdade(RSN.ReceberIntFiltrado("Digite a idade da pessoa " + count + " : ", idade));
			System.out.print("Digite o sexo da pessoa " + count + " [Masculino(M) Feminino(F)]" + " : ");
			sexo = scanner.next();
			pessoa.setSexo(Pessoa
					.verificarSexo("Digite o sexo da pessoa " + count + " [Masculino(M) Feminino(F)]" + " : ", sexo));
			System.out.print("Digite o saude da pessoa " + count + " (saudavel)(doente)" + " : ");
			saude = scanner.next();
			pessoa.setSaude(
					pessoa.verificarSaude("Digite o saude da pessoa " + count + " (saudavel)(doente)" + " : ", saude));
			System.out.print("Deseja continuar?  (S)(N) : ");
			resposta = scanner.next();
			resposta = resposta.toUpperCase();

			boolean condition2 = true;
			do {
				switch (resposta) {
				case "S": {
					condition2 = false;
					condition = true;
					break;
				}
				case "N": {
					condition2 = false;
					condition = false;
					break;
				}
				default:
					condition2 = true;

					System.out.println("Digite somente Sim(S) ou Não(N)");
					System.out.println();
					System.out.print("Deseja continuar ? (S)(N) : ");
					resposta = scanner.next();
					resposta = resposta.toUpperCase();
				}
			} while (condition2);

			count++;
			pessoas.add(pessoa);

		} while (condition);

		System.out.println("------------------------------------");
		for (Pessoa pessoa : pessoas) {

			System.out.println("------------------- " + pessoa.getNome() + " -------------------");
			
			if (pessoa.getSexo().equals("Masculino") && pessoa.getIdade() >= 18 && pessoa.getSaude().equals("Saudavel")) {
				
				System.out.println("Apta para cumprir serviço militar obrigatório");
				
			} else {
				
				System.out.println("Não precisa cumprir serviço militar");
				
			}

		}

		scanner.close();
		
	}
}