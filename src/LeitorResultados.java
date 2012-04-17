public class LeitorResultados {
	int[] votos;

	public boolean validaEntrada(String entrada) {

		String[] linha;
		String[] matrizAluno = entrada.split("\n");

		int quantidadeDeAlunos = Integer.parseInt(matrizAluno[0]);
		int contadorQuantidadeDeLinhas = 0;

		votos = new int[quantidadeDeAlunos];

		for (int i = 1; i < matrizAluno.length; i++) {
			contadorQuantidadeDeLinhas++;

			if (matrizAluno[i].replace(" ", "").length() != quantidadeDeAlunos) {
				return false;
			}

			linha = matrizAluno[i].split(" ");
			for (int j = 0; j < linha.length; j++) {

				votos[j] += Integer.parseInt(linha[j]);
			}

		}

		if (quantidadeDeAlunos != contadorQuantidadeDeLinhas) {
			return false;
		}

		return true;

	}

	public int calculaMaiorQuantidadeVotos(String entrada) {
		int maiorValor = 0;
		if (validaEntrada(entrada)) {
			for (int i = 0; i < votos.length; i++) {
				if (votos[i] > maiorValor) {
					maiorValor = votos[i];
				}
			}
		}
		return maiorValor;
	}

}
