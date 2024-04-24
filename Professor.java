/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Injecção de Dependência
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package a11_injeccao_dependencia;

public class Professor 
{
	private IGestao iGestao;
	public Professor(IGestao iGestao) // receber injecção de dependência
	{
		this.iGestao = iGestao;
	}
	
	public void apresentarBoletim()
	{
		String nome = this.iGestao.getNome();
		float nota = this.iGestao.getNota();
		
		System.out.println(nome + ": " + nota);
	}
	
	public void alterarBoletim(float nota)
	{
		this.iGestao.setNota(nota);
	}
}
