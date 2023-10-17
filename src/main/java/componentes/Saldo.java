package componentes;
import java.math.BigDecimal;

public class Saldo {
	private Long idSaldo;
	private BigDecimal monto;
	
	
	
	public Saldo(Long idSaldo, BigDecimal monto) {
		this.idSaldo = idSaldo;
		this.monto = monto;
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
	

}
