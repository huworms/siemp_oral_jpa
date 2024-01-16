package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_lengua_indigena database table.
 * 
 */
@Entity
@Table(name="c_lengua_indigena")
@NamedQuery(name="CLenguaIndigena.findAll", query="SELECT c FROM CLenguaIndigena c")
public class CLenguaIndigena implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_lengua")
	private int idLengua;

	private String descripcion;

	public CLenguaIndigena() {
	}

	public int getIdLengua() {
		return this.idLengua;
	}

	public void setIdLengua(int idLengua) {
		this.idLengua = idLengua;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}