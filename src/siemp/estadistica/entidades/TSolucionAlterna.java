package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the t_solucion_alterna database table.
 * 
 */
@Entity
@Table(name="t_solucion_alterna")
@NamedQuery(name="TSolucionAlterna.findAll", query="SELECT t FROM TSolucionAlterna t")
public class TSolucionAlterna implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_acto_procesal")
	private String idActoProcesal;

	@Column(name="caracter_recuperado")
	private String caracterRecuperado;

	private String cumplimiento;

	@Column(name="monto_pecuniario")
	private BigDecimal montoPecuniario;

	@Column(name="monto_recuperado")
	private BigDecimal montoRecuperado;

	@Column(name="tipo_solucion")
	private int tipoSolucion;

	//bi-directional one-to-one association to TActoProcesal
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acto_procesal")
	private TActoProcesal TActoProcesal;

	public TSolucionAlterna() {
	}

	public String getIdActoProcesal() {
		return this.idActoProcesal;
	}

	public void setIdActoProcesal(String idActoProcesal) {
		this.idActoProcesal = idActoProcesal;
	}

	public String getCaracterRecuperado() {
		return this.caracterRecuperado;
	}

	public void setCaracterRecuperado(String caracterRecuperado) {
		this.caracterRecuperado = caracterRecuperado;
	}

	public String getCumplimiento() {
		return this.cumplimiento;
	}

	public void setCumplimiento(String cumplimiento) {
		this.cumplimiento = cumplimiento;
	}

	public BigDecimal getMontoPecuniario() {
		return this.montoPecuniario;
	}

	public void setMontoPecuniario(BigDecimal montoPecuniario) {
		this.montoPecuniario = montoPecuniario;
	}

	public BigDecimal getMontoRecuperado() {
		return this.montoRecuperado;
	}

	public void setMontoRecuperado(BigDecimal montoRecuperado) {
		this.montoRecuperado = montoRecuperado;
	}

	public int getTipoSolucion() {
		return this.tipoSolucion;
	}

	public void setTipoSolucion(int tipoSolucion) {
		this.tipoSolucion = tipoSolucion;
	}

	public TActoProcesal getTActoProcesal() {
		return this.TActoProcesal;
	}

	public void setTActoProcesal(TActoProcesal TActoProcesal) {
		this.TActoProcesal = TActoProcesal;
	}

}