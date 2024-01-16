package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_grado_participacion database table.
 * 
 */
@Entity
@Table(name="c_grado_participacion")
@NamedQuery(name="CGradoParticipacion.findAll", query="SELECT c FROM CGradoParticipacion c")
public class CGradoParticipacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_grado_participacion")
	private int idGradoParticipacion;

	private String descripcion;

	//bi-directional many-to-one association to TImputado
	@OneToMany(mappedBy="CGradoParticipacion")
	private List<TImputado> TImputados;

	public CGradoParticipacion() {
	}

	public int getIdGradoParticipacion() {
		return this.idGradoParticipacion;
	}

	public void setIdGradoParticipacion(int idGradoParticipacion) {
		this.idGradoParticipacion = idGradoParticipacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TImputado> getTImputados() {
		return this.TImputados;
	}

	public void setTImputados(List<TImputado> TImputados) {
		this.TImputados = TImputados;
	}

	public TImputado addTImputado(TImputado TImputado) {
		getTImputados().add(TImputado);
		TImputado.setCGradoParticipacion(this);

		return TImputado;
	}

	public TImputado removeTImputado(TImputado TImputado) {
		getTImputados().remove(TImputado);
		TImputado.setCGradoParticipacion(null);

		return TImputado;
	}

}