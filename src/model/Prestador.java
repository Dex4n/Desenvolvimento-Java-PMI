package model;

import java.util.ArrayList;

public class Prestador extends Usuario {
	
	private String avaliacaoServico;
	private int idAvaliacao;
	
	public Prestador(String avaliacaoServico, int idAvaliacao) {
		super();
		this.avaliacaoServico = avaliacaoServico;
		this.idAvaliacao = idAvaliacao;
	}
	
	@Override
	public void cadastrarUsuario(String nomeUsuario, String emailUsuario, String cpfUsuario, String cnpjUsuario,
			boolean perfilUsuario, String loginUsuario, String senhaUsuario) {
		// TODO Auto-generated method stub
		
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;

	}

	@Override
	public void alterarUsuario(String nomeUsuario, String emailUsuario, String cpfUsuario, String cnpjUsuario,
			boolean perfilUsuario, String loginUsuario, String senhaUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listarUsuario(String nomeUsuario, String emailUsuario, String cpfUsuario, String cnpjUsuario,
			boolean perfilUsuario, String loginUsuario, String senhaUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluirUsuario(String nomeUsuario, String emailUsuario, String cpfUsuario, String cnpjUsuario,
			boolean perfilUsuario, String loginUsuario, String senhaUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Usuario> listarUsuariosComFiltro() {
		// TODO Auto-generated method stub
		//ArrayList<Usuario> retornoEntrega = new ArrayList<Usuario>();
		ArrayList<Usuario> retornoUsuario = null;
		return retornoUsuario;
		
	}

	@Override
	public void efetuarLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarSenha() {
		// TODO Auto-generated method stub
		
	}
	
	public void visualizarContratos() {
		
	}
	
	public void listarAvaliacoesRecebidas() {
		
	}
	
	public void obterAvaliacaoPrestador() {
		
	}
	
	public void visualizarDadosPrestador() {
		
	}
	
	public void visualizarServicosPrestados() {
		
	}

}