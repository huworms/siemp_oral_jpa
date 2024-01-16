package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_asunto database table.
 * 
 */
@Entity
@Table(name="c_tipo_asunto")
@NamedQuery(name="CTipoAsunto.findAll", query="SELECT c FROM CTipoAsunto c")
public class CTipoAsunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_asunto")
	private int idTipoAsunto;

	private String descripcion;

	//bi-directional many-to-one association to TIngreso
	@OneToMany(mappedBy="CTipoAsunto")
	private List<TIngreso> TIngresos;

	public CTipoAsunto() {
	}

	public int getIdTipoAsunto() {
		return this.idTipoAsunto;
	}

	public void setIdTipoAsunto(int idTipoAsunto) {
		this.idTipoAsunto = idTipoAsunto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TIngreso> getTIngresos() {
		return this.TIngresos;
	}

	public void setTIngresos(List<TIngreso> TIngresos) {
		this.TIngresos = TIngresos;
	}

	public TIngreso addTIngreso(TIngreso TIngreso) {
		getTIngresos().add(TIngreso);
		TIngreso.setCTipoAsunto(this);

		return TIngreso;
	}

	public TIngreso removeTIngreso(TIngreso TIngreso) {
		getTIngresos().remove(TIngreso);
		TIngreso.setCTipoAsunto(null);

		return TIngreso;
	}

}