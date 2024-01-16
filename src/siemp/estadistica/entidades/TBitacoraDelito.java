package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_bitacora_delito database table.
 * 
 */
@Entity
@Table(name="t_bitacora_delito")
@NamedQuery(name="TBitacoraDelito.findAll", query="SELECT t FROM TBitacoraDelito t")
public class TBitacoraDelito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento")
	private String idEvento;

	private String estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_movimiento")
	private Date fechaMovimiento;

	@Column(name="id_movimiento")
	private int idMovimiento;

	@Column(name="id_usuario")
	private int idUsuario;

	//bi-directional many-to-one association to TDelito
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_delito")
	private TDelito TDelito;

	public TBitacoraDelito() {
	}

	public String getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaMovimiento() {
		return this.fechaMovimiento;
	}

	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
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

	public TDelito getTDelito() {
		return this.TDelito;
	}

	public void setTDelito(TDelito TDelito) {
		this.TDelito = TDelito;
	}

}