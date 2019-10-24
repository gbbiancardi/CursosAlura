package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;

@ManagedBean
@ViewScoped
public class AutorBean {

	private Autor autor = new Autor();
	
	private Integer autorId;
	
	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		System.out.println("Chamando set");
		this.autorId = autorId;
	}

	public void carregarAutorPelaId() {
		System.out.println("Chamando carregar");
		this.autor = new DAO<Autor>(Autor.class).buscaPorId(autorId);
	}
		
	public List<Autor> getLista() {
        return new DAO<Autor>(Autor.class).listaTodos();
    }
	
	public Autor getAutor() {
		return autor;
	}
	
	public String getNome() {
		return autor.getNome();
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		if (this.autor.getId() == null) {
            new DAO<Autor>(Autor.class).adiciona(this.autor);
            return "autor?faces-redirect=true";
        } else {
            new DAO<Autor>(Autor.class).atualiza(this.autor);
            new FacesMessage("Autor foi atualizado!");
        }

		return "autor?faces-redirect=true";
	}
	
	public void remover(Autor autor) {
		System.out.println("Removendo autor");
		new DAO<Autor>(Autor.class).remove(autor);
	}
	
	public void carregar(Autor autor) {
		System.out.println("Carregando autor");
		this.autor = autor;
	}
}
