package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_bitacora_libertad database table.
 * 
 */
@Entity
@Table(name="t_bitacora_libertad")
@NamedQuery(name="TBitacoraLibertad.findAll", query="SELECT t FROM TBitacoraLibertad t")
public class TBitacoraLibertad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento")
	private String idEvento;

	@Lob
	private String descripcion;

	private String estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	@Column(name="id_centro_reclusion")
	private int idCentroReclusion;

	@Column(name="id_movimiento")
	private int idMovimiento;

	@Column(name="id_usuario")
	private int idUsuario;

	//bi-directional many-to-one association to TImputado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_persona")
	private TImputado TImputado;

	public TBitacoraLibertad() {
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

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getIdCentroReclusion() {
		return this.idCentroReclusion;
	}

	public void setIdCentroReclusion(int idCentroReclusion) {
		this.idCentroReclusion = idCentroReclusion;
	}

	public int getIdMovimiento() {
		return this.idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public TImputado getTImputado() {
		return this.TImputado;
	}

	public void setTImputado(TImputado TImputado) {
		this.TImputado = TImputado;
	}

}