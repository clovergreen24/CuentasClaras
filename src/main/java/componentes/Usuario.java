package componentes;

import java.util.List;

import javax.imageio.ImageIO;

public class Usuario {
	private Long idUsuario;  
	private String usuario;  
	private String nombre;
	private String contraseña;
	private String email;
	private String foto;
	private List<Grupo> grupos; 
	private List<Pago> pagos;
	private List<Gasto> gastos;
	private List<Usuario> amigos;
	private List<Saldo> saldos;
	
	
	
	public Usuario(Long idUsuario, String usuario, String nombre, String contraseña, String email, String foto,
			List<Grupo> grupos, List<Pago> pagos, List<Gasto> gastos, List<Usuario> amigos, List<Saldo> saldos) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.email = email;
		this.foto = foto;
		this.grupos = grupos;
		this.pagos = pagos;
		this.gastos = gastos;
		this.amigos = amigos;
		this.saldos = saldos;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }
	
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
