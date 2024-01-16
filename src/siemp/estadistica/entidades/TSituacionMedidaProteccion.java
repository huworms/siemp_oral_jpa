package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_situacion_medida_proteccion database table.
 * 
 */
@Entity
@Table(name="t_situacion_medida_proteccion")
@NamedQuery(name="TSituacionMedidaProteccion.findAll", query="SELECT t FROM TSituacionMedidaProteccion t")
public class TSituacionMedidaProteccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TSituacionMedidaProteccionPK id;

	private String estatus;

	@Column(name="id_situacion")
	private int idSituacion;

	public TSituacionMedidaProteccion() {
	}

	public TSituacionMedidaProteccionPK getId() {
		return this.id;
	}

	public void setId(TSituacionMedidaProteccionPK id) {
		this.id = id;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public int getIdSituacion() {
		return this.idSituacion;
	}

	public void setIdSituacion(int idSituacion) {
		this.idSituacion = idSituacion;
	}

}