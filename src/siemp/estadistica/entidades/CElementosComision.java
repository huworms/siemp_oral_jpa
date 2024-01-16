package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_elementos_comision database table.
 * 
 */
@Entity
@Table(name="c_elementos_comision")
@NamedQuery(name="CElementosComision.findAll", query="SELECT c FROM CElementosComision c")
public class CElementosComision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_elemento")
	private int idElemento;

	private String descripcion;

	public CElementosComision() {
	}

	public int getIdElemento() {
		return this.idElemento;
	}

	public void setIdElemento(int idElemento) {
		this.idElemento = idElemento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}