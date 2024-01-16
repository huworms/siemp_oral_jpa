package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_bitacora_imputado database table.
 * 
 */
@Entity
@Table(name="t_bitacora_imputado")
@NamedQuery(name="TBitacoraImputado.findAll", query="SELECT t FROM TBitacoraImputado t")
public class TBitacoraImputado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento")
	private String idEvento;

	@Lob
	private String descripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_movimiento")
	private Date fechaMovimiento;

	@Column(name="id_persona")
	private BigInteger idPersona;

	@Column(name="id_tsjdf")
	private BigInteger idTsjdf;

	@Column(name="id_usuario")
	private int idUsuario;

	//bi-directional many-to-one association to CTipoMovimiento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_movimiento")
	private CTipoMovimiento CTipoMovimiento;

	public TBitacoraImputado() {
	}

	public String getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaMovimiento() {
		return this.fechaMovimiento;
	}

	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	public BigInteger getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(BigInteger idPersona) {
		this.idPersona = idPersona;
	}

	public BigInteger getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(BigInteger idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public CTipoMovimiento getCTipoMovimiento() {
		return this.CTipoMovimiento;
	}

	public void setCTipoMovimiento(CTipoMovimiento CTipoMovimiento) {
		this.CTipoMovimiento = CTipoMovimiento;
	}

}