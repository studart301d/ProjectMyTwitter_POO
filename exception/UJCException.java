package project_my_twitter.exception;

import project_my_twitter.perfil.*;

public class UJCException extends java.lang.Exception{
	private Perfil usuario;
	
	public UJCException (Perfil usuario) {
		super("Usuario ja cadastrado!");
		this.usuario = usuario;
	}
	
	public Perfil getUsuario() {
		return this.usuario;
	}
}