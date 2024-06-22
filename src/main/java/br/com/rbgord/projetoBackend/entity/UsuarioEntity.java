package br.com.rbgord.projetoBackend.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
public class UsuarioEntity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(nullable = false, unique =true)
	private String nome;
	
	 @Column(nullable = false, unique = true)
	private String email;
	
	 @Column(nullable = false)
	private String senha;
	
	 @Column(nullable = false)
	 @Enumerated(EnumType.STRING)
	private TipoUsuario tipo;
	 
	    public enum TipoUsuario {
	        ADMINISTRADOR,
	        USUARIO
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public TipoUsuario getTipo() {
			return tipo;
		}

		public void setTipo(TipoUsuario tipo) {
			this.tipo = tipo;
		}

		
		
	    
}
