/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Injecção de Dependência
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package a11_injeccao_dependencia;

public class Controle {

	public static void main(String[] args) {
		
		// criar a dependência
		Boletim boletim = new Boletim("Ngola Mbande");
		
		// injectar a dependência
		Professor professor = new Professor(boletim);
		
		professor.apresentarBoletim();
		professor.alterarBoletim(19);
		professor.apresentarBoletim();
		
		// injectar a dependência
		Aluno aluno = new Aluno(boletim);
		
		aluno.apresentarBoletim();
	}
}
