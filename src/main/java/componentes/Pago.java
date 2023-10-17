package componentes;

import java.math.BigDecimal;

public class Pago {
	private Long idPago;
	private BigDecimal monto;
	private Grupo grupo;
	private Usuario usuario;
	private Usuario usuarioDestino;
	
	public Pago (Long idPago, BigDecimal monto, Grupo grupo, Usuario usuario, Usuario usuarioDestino) {
		this.idPago = idPago;
		this.monto = monto;
		this.grupo = grupo;
		this.usuario = usuario;
		this.usuarioDestino = usuarioDestino;
	}
	
	
	public Long getIdPago() {
		return idPago;
	}
	public void setIdPago(Long idPago) {
		this.idPago = idPago;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Usuario getUsuarioDestino() {
		return usuarioDestino;
	}
	public void setUsuarioDestino(Usuario usuarioDestino) {
		this.usuarioDestino = usuarioDestino;
	}
	
	public void efectuarPago() {
		//reduce deudas en saldos correspondientes
	}
	
	public Boolean tieneGrupo() {
		if(this.getGrupo()!=null) {
			return true;
		}
		else {
			return false;
		}
	}
}
