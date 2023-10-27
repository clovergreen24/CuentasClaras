package componentes;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="Usuarios")
public class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;  
	private String usuario;  
	private String nombre;
	private String contraseña;
	private String email;
	private String foto;
	
	@ManyToMany
	@JoinTable(
			name= "GruposDelUsuario",
			joinColumns = @JoinColumn(name="idUsuario"),
			inverseJoinColumns= @JoinColumn(name="idGrupo"))
	private List<Grupo> grupos;
	
	@OneToMany(mappedBy="usuario")
	private List<Pago> pagos;
	
	@OneToMany(mappedBy="usuario")
	private List<Gasto> gastos;
	
	@ManyToMany(cascade=CascadeType.MERGE)
	@JoinTable(
			name= "Amigos",
			joinColumns = @JoinColumn(name="idUsuario"),
			inverseJoinColumns= @JoinColumn(name="idAmigo"))
	private List<Usuario> amigos;
	
	@OneToMany(cascade=CascadeType.MERGE)
	@JoinColumn(name="idSaldo")
	private List<Saldo> saldos;
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(String usuario, String nombre, String contraseña, String email, String foto,
			List<Grupo> grupos, List<Pago> pagos, List<Gasto> gastos, List<Usuario> amigos, List<Saldo> saldos) {
		super();
		setUsuario(usuario);
		setNombre(nombre);
		setContraseña(contraseña);
		setEmail(email);
		setFoto(foto);
		setGrupos(grupos);
		setPagos(pagos);
		setGastos(gastos);
		setAmigos(amigos);
		setSaldos(saldos);
	}

	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	public List<Pago> getPagos() {
		return pagos;
	}
	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}
	public List<Gasto> getGastos() {
		return gastos;
	}
	public void setGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}
	public List<Usuario> getAmigos() {
		return amigos;
	}
	public void setAmigos(List<Usuario> amigos) {
		this.amigos = amigos;
	}
	public List<Saldo> getSaldos() {
		return saldos;
	}
	public void setSaldos(List<Saldo> saldos) {
		this.saldos = saldos;
	}
}
