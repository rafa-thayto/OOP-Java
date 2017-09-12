package br.com.ozcorp;
/**
 * 
 * @author Rafael Thayto
 *
 */
public class Secretario extends Funcionario{

	public Secretario(String nome, String rg, String cpf, String matricula, String email, String senha,
			TipoSanguineo tipoSanguineo, Sexo sexo, int nivelAcesso, Departamento departamento) {
		super(nome, rg, cpf, matricula, email, senha, tipoSanguineo, sexo, nivelAcesso, departamento);
	}

}
