package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_medida_proteccion database table.
 * 
 */
@Entity
@Table(name="t_medida_proteccion")
@NamedQuery(name="TMedidaProteccion.findAll", query="SELECT t FROM TMedidaProteccion t")
public class TMedidaProteccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tsjdf")
	private Long idTsjdf;

	@Column(name="id_medida_proteccion")
	private String idMedidaProteccion;

	public TMedidaProteccion() {
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getIdMedidaProteccion() {
		return this.idMedidaProteccion;
	}

	public void setIdMedidaProteccion(String idMedidaProteccion) {
		this.idMedidaProteccion = idMedidaProteccion;
	}

}