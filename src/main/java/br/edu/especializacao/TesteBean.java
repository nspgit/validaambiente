package br.edu.especializacao;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

    @Named
	@RequestScoped
	public class TesteBean implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		private String texto = "Spinner do Primefaces";

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

	}
