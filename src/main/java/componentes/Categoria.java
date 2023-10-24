
package componentes;
import jakarta.persistence.*;

@Entity
@Table(name="Categorias")
public class Categoria {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	private String tipo;
	private String imagen;
	
	
	
	public Categoria(Long idCategoria, String tipo, String imagen) {
		this.idCategoria = idCategoria;
		this.tipo = tipo;
		this.imagen = imagen;
	}
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
