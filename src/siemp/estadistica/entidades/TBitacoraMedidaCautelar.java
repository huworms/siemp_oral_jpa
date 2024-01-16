package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_bitacora_medida_cautelar database table.
 * 
 */
@Entity
@Table(name="t_bitacora_medida_cautelar")
@NamedQuery(name="TBitacoraMedidaCautelar.findAll", query="SELECT t FROM TBitacoraMedidaCautelar t")
public class TBitacoraMedidaCautelar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento")
	private int idEvento;

	@Lob
	private String descripcion;

	private String estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//bi-directional many-to-one association to TMedida
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_medida_cautelar")
	private TMedida TMedida;

	public TBitacoraMedidaCautelar() {
	}

	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
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

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TMedida getTMedida() {
		return this.TMedida;
	}

	public void setTMedida(TMedida TMedida) {
		this.TMedida = TMedida;
	}

}