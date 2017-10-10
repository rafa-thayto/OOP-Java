package br.com.senai.sp.informatica.alg.vetor;

public class Vetor {

	// Vetor onde os dados ser�o armazenados
    private Cliente[] dados = new Cliente[2];

    // Armazena a quantidade de elementos da estrutura
    private int tamanho;

    /**
     * Adiciona um elemento no final do vetor
     * @param obj - O elemento que ser� adicionado
     */
    public void adicionar(Cliente obj) {
        this.garantirEspaco();

        // Adiciona o objeto no vetor
        this.dados[tamanho] = obj;

        // Incrementa a vari�vel tamanho
        this.tamanho++;
    }

    /**
     * Pega o elemento do vetor
     * @param posicao - Aposi��o onde est� alocado o elemento
     * @return
     */
    public Cliente pegar(int posicao) {
        return this.dados[posicao];
    }

    /**
     * Garante que o vetor interno tenha sempre
     * capacidade de alocar um novo elemento
     */
    private void garantirEspaco() {
        // Verificando se � necess�rio dobrar o espa�o do vetor
        if (this.tamanho == this.dados.length) {
            // Cria um novo vetor com o dobro de tamanho
            Cliente[] novoVetor = new Cliente[tamanho * 2];

            // Aplicando os dados do vetor antigo no novo
            for (int i = 0; i < this.tamanho; i++) {
                novoVetor[i] = this.dados[i];
            }
            // Determina que os dados ser� o novo vetor
            this.dados = novoVetor;
        }
    }

    /**
     * Se a posi��o for inv�lida, dispara uma Exception
     * @param posicao
     */
    private void validarPosicao(int posicao) {
        if (posicao >= this.tamanho || posicao < 0) {
            throw new ArrayIndexOutOfBoundsException("A posi��o " + posicao
                                                        + " � inv�lida");
        }
    }
	
}
