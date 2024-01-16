package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_audiencia database table.
 * 
 */
@Entity
@Table(name="c_tipo_audiencia")
@NamedQuery(name="CTipoAudiencia.findAll", query="SELECT c FROM CTipoAudiencia c")
public class CTipoAudiencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_audiencia")
	private int idTipoAudiencia;

	private String descripcion;

	//bi-directional many-to-one association to TAudienciaImputado
	@OneToMany(mappedBy="CTipoAudiencia")
	private List<TAudienciaImputado> TAudienciaImputados;

	//bi-directional many-to-one association to TEtapaAudiencia
	@OneToMany(mappedBy="CTipoAudiencia")
	private List<TEtapaAudiencia> TEtapaAudiencias;

	public CTipoAudiencia() {
	}

	public int getIdTipoAudiencia() {
		return this.idTipoAudiencia;
	}

	public void setIdTipoAudiencia(int idTipoAudiencia) {
		this.idTipoAudiencia = idTipoAudiencia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TAudienciaImputado> getTAudienciaImputados() {
		return this.TAudienciaImputados;
	}

	public void setTAudienciaImputados(List<TAudienciaImputado> TAudienciaImputados) {
		this.TAudienciaImputados = TAudienciaImputados;
	}

	public TAudienciaImputado addTAudienciaImputado(TAudienciaImputado TAudienciaImputado) {
		getTAudienciaImputados().add(TAudienciaImputado);
		TAudienciaImputado.setCTipoAudiencia(this);

		return TAudienciaImputado;
	}

	public TAudienciaImputado removeTAudienciaImputado(TAudienciaImputado TAudienciaImputado) {
		getTAudienciaImputados().remove(TAudienciaImputado);
		TAudienciaImputado.setCTipoAudiencia(null);

		return TAudienciaImputado;
	}

	public List<TEtapaAudiencia> getTEtapaAudiencias() {
		return this.TEtapaAudiencias;
	}

	public void setTEtapaAudiencias(List<TEtapaAudiencia> TEtapaAudiencias) {
		this.TEtapaAudiencias = TEtapaAudiencias;
	}

	public TEtapaAudiencia addTEtapaAudiencia(TEtapaAudiencia TEtapaAudiencia) {
		getTEtapaAudiencias().add(TEtapaAudiencia);
		TEtapaAudiencia.setCTipoAudiencia(this);

		return TEtapaAudiencia;
	}

	public TEtapaAudiencia removeTEtapaAudiencia(TEtapaAudiencia TEtapaAudiencia) {
		getTEtapaAudiencias().remove(TEtapaAudiencia);
		TEtapaAudiencia.setCTipoAudiencia(null);

		return TEtapaAudiencia;
	}

}