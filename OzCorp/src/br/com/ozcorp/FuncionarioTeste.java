package br.com.ozcorp;
/**
 * 
 * @author Rafael Thayto
 *
 */
public class FuncionarioTeste {

	public static void main(String[] args) {

		// Secretario
		Secretario vianinha = new Secretario("Vianinha", "183.054.456-X", "689.524.628-45", "123456789", "vianinha@email.com", "vianinha321bolada1", TipoSanguineo.A_POSITIVO, Sexo.OUTRO, 4, new Departamento("Recursos Humanos", "RH", new Cargo("Secretario", 92_000.57)));
		
		// Analista 
		Analista felipinho = new Analista("Felipinho", "27.081.375-5", "794.650.320-26", "987654321", "felipinho@email.com", "felipinho@132", TipoSanguineo.A_NEGATIVO, Sexo.OUTRO, 3, new Departamento("Sistemas", "TI", new Cargo("Analista", 18_000.27)));
		
		// Engenheiro
		Engenheiro jorginho = new Engenheiro("Jorginho", "13.087.435-8", "074.923.900-09", "123987456", "jorginho@email.com", "jorginho@312", TipoSanguineo.B_POSITIVO, Sexo.OUTRO, 2, new Departamento("Sistemas", "TI", new Cargo("Engenheiro", 520_000.10)));
		
		// Gerente
		Gerente thayto = new Gerente("Rafael Title", "22.544.177-X", "069.297.499-74", "987123746", "rafa.thayto@gmail.com", "senha@978", TipoSanguineo.A_POSITIVO, Sexo.OUTRO, 1, new Departamento("Gerencia", "VTNC", new Cargo("Gerente", 95_000.95)));
		 
		// Diretor
		Diretor jose = new Diretor("José Ricardo", "18.347.141-6", "100.574.530-71", "912837465", "jose-o-diretor-fodao@email.com", "diretor@132", TipoSanguineo.O_NEGATIVO, Sexo.OUTRO, 0, new Departamento("Direção", "S.A.L.V.E", new Cargo("Diretor", 10_000.23)));
		
		
		//*// 0/\o Dados do funcionário o/\0 //*//
		vianinha.dadosFuncionario();
		felipinho.dadosFuncionario();
		jorginho.dadosFuncionario();
		thayto.dadosFuncionario();
		jose.dadosFuncionario();
		
		
	}

}
