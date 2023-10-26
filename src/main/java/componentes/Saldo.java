package componentes;
import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name="Saldos")
public class Saldo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSaldo;
	private BigDecimal monto;
	@ManyToOne
	private Usuario usuario;
	
	public Saldo() {
		super();
	}
	
	public Saldo(Long idSaldo, BigDecimal monto, Usuario usuario) {
		this.setIdSaldo(idSaldo);
		this.setMonto(monto);
		this.setUsuario(usuario);
	}


	public Long getIdSaldo() {
		return idSaldo;
	}

	
	public void setIdSaldo(Long idSaldo) { this.idSaldo = idSaldo; }
	
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
