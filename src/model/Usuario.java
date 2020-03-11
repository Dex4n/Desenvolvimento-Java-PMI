package model;

import java.util.ArrayList;

public abstract class Usuario {
	
	protected String nomeUsuario;
	protected int idUsuario;
	protected String emailUsuario;
	protected String cpfUsuario;
	protected String cnpjUsuario;
	protected boolean perfilUsuario;
	protected String loginUsuario;
	protected String senhaUsuario;

	// Método abstrato que não tem implementação na classe onde ele é definido.
	// Obrigatoriamente será implementado em uma subclasse.
	public abstract void cadastrarUsuario
			(String nomeUsuario, 
			String emailUsuario, 
			String cpfUsuario, 
			String cnpjUsuario, 
			boolean perfilUsuario, 
			String loginUsuario, 
			String senhaUsuario);
	
	public abstract void alterarUsuario
			(String nomeUsuario, 
			String emailUsuario, 
			String cpfUsuario, 
			String cnpjUsuario, 
			boolean perfilUsuario, 
			String loginUsuario, 
			String senhaUsuario);

	public abstract void listarUsuario
			(String nomeUsuario, 
			String emailUsuario, 
			String cpfUsuario, 
			String cnpjUsuario, 
			boolean perfilUsuario, 
			String loginUsuario, 
			String senhaUsuario);
	
	public abstract void excluirUsuario
			(String nomeUsuario, 
			String emailUsuario, 
			String cpfUsuario, 
			String cnpjUsuario, 
			boolean perfilUsuario, 
			String loginUsuario, 
			String senhaUsuario);
	
	public abstract ArrayList<Usuario> listarUsuariosComFiltro();
	
	public abstract void efetuarLogin();
	
	public abstract void alterarSenha();
	
}