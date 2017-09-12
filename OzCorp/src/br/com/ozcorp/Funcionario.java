package br.com.ozcorp;
/**
 * 
 * @author Rafael Thayto
 *
 */
public class Funcionario {
	// Atributos
	protected String nome;
	protected String rg;
	protected String cpf;
	protected String matricula;
	protected String email;
	protected String senha;
	protected TipoSanguineo tipoSanguineo;
	protected Sexo sexo;
	protected int nivelAcesso;
	protected Departamento departamento;
	
	// Constructor
	public Funcionario(String nome, String rg, String cpf, String matricula, String email, String senha,
			TipoSanguineo tipoSanguineo, Sexo sexo, int nivelAcesso, Departamento departamento) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
		this.tipoSanguineo = tipoSanguineo;
		this.sexo = sexo;
		this.nivelAcesso = nivelAcesso;
		this.departamento = departamento;
	}
	
	// Getters & Setters
	
	// Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	// RG
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	// CPF
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	// Matrícula
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	// Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// Senha
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	// Tipo Sanguíneo
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	// Sexo
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	// Nivel de Acesso
	public int getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(int nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	// Departamento
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void dadosFuncionario() {
		System.out.println("---------------------------------------------");
		System.out.println("DADOS DO FUNCIONÁRIO");
		System.out.println("NOME: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("MATRÍCULA: " + this.getMatricula());
		System.out.println("E-MAIL: " + this.getEmail());
		System.out.println("SENHA: " + this.getSenha());
		System.out.println("TIPO SANGUÍNEO: " + this.getTipoSanguineo());
		System.out.println("SEXO: " + this.getSexo());
		System.out.println("NÍVEL DE ACESSO: " + this.getNivelAcesso());
		System.out.println("DEPARTAMENTO: " + this.getDepartamento().nome + " - " + this.getDepartamento().getSigla());
		System.out.println("CARGO: " + this.getDepartamento().getCargo().getTitulo());
		System.out.println("SALÁRIO: " + this.getDepartamento().getCargo().getSalarioBase());
		System.out.println("---------------------------------------------");
	}
}
