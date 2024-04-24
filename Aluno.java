/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Injecção de Dependência
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package a11_injeccao_dependencia;

public class Aluno 
{
	private IGestao iGestao;
	public Aluno(IGestao iGestao) // receber injecção de dependência
	{
		this.iGestao = iGestao;
	}
	
	public void apresentarBoletim()
	{
		String nome = this.iGestao.getNome();
		float nota = this.iGestao.getNota();
		
		System.out.println(nome + ": " + nota);
	}
}
