package cursojava.classes;

public class Aluno {

	private String nome;
	private int idade;
	private String nascimento;
	private String rg;
	private String cpf;
	private String mae;
	private String pai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public Aluno() { // Cria dados na memório (este aqui é um construtor que define o comportamento)

	}
	// Parametro

	// Métodos setter e getters do obj receber e retornar dados
	// SET é para adicionar ou receber dados para os atributos
	// GET é para resgatar ou obter o valor do atributo

	// SET recebe dados
	public void setNome(String nome) {
		this.nome = nome; // this.nome faz referencia ao nome do objeto Aluno
							// nome faz referencia ao método
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getMae() {
		return mae;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getPai() {
		return pai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	// Nesse caso não utilizamos o void, pois ele é um método que apenas recebe
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	public boolean getAlunoAprovado() {

		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {

		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno está aprovado";
		} else {
			return "Aluno está reprovado";
		}

	}

}
