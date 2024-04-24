/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Injecção de Dependência
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package a11_injeccao_dependencia;

public class Boletim implements IGestao, IConsulta
{
	private String nome;
	private float nota = 15.5f;
	
	public Boletim(String nome)
	{
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
}
