package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_impugnacion_mp database table.
 * 
 */
@Entity
@Table(name="c_impugnacion_mp")
@NamedQuery(name="CImpugnacionMp.findAll", query="SELECT c FROM CImpugnacionMp c")
public class CImpugnacionMp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo")
	private int idTipo;

	private String descripcion;

	private String estatus;

	//bi-directional many-to-one association to TImpugnacion
	@OneToMany(mappedBy="CImpugnacionMp")
	private List<TImpugnacion> TImpugnacions;

	public CImpugnacionMp() {
	}

	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
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

	public List<TImpugnacion> getTImpugnacions() {
		return this.TImpugnacions;
	}

	public void setTImpugnacions(List<TImpugnacion> TImpugnacions) {
		this.TImpugnacions = TImpugnacions;
	}

	public TImpugnacion addTImpugnacion(TImpugnacion TImpugnacion) {
		getTImpugnacions().add(TImpugnacion);
		TImpugnacion.setCImpugnacionMp(this);

		return TImpugnacion;
	}

	public TImpugnacion removeTImpugnacion(TImpugnacion TImpugnacion) {
		getTImpugnacions().remove(TImpugnacion);
		TImpugnacion.setCImpugnacionMp(null);

		return TImpugnacion;
	}

}