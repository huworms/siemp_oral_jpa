package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_relacion_victima database table.
 * 
 */
@Entity
@Table(name="c_relacion_victima")
@NamedQuery(name="CRelacionVictima.findAll", query="SELECT c FROM CRelacionVictima c")
public class CRelacionVictima implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_relacion_victima")
	private int idRelacionVictima;

	private String descripcion;

	public CRelacionVictima() {
	}

	public int getIdRelacionVictima() {
		return this.idRelacionVictima;
	}

	public void setIdRelacionVictima(int idRelacionVictima) {
		this.idRelacionVictima = idRelacionVictima;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}