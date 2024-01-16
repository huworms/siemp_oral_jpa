package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_etapa database table.
 * 
 */
@Entity
@Table(name="c_etapa")
@NamedQuery(name="CEtapa.findAll", query="SELECT c FROM CEtapa c")
public class CEtapa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_etapa")
	private int idEtapa;

	private String descripcion;

	//bi-directional many-to-one association to TEtapaAudiencia
	@OneToMany(mappedBy="CEtapa")
	private List<TEtapaAudiencia> TEtapaAudiencias;

	public CEtapa() {
	}

	public int getIdEtapa() {
		return this.idEtapa;
	}

	public void setIdEtapa(int idEtapa) {
		this.idEtapa = idEtapa;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TEtapaAudiencia> getTEtapaAudiencias() {
		return this.TEtapaAudiencias;
	}

	public void setTEtapaAudiencias(List<TEtapaAudiencia> TEtapaAudiencias) {
		this.TEtapaAudiencias = TEtapaAudiencias;
	}

	public TEtapaAudiencia addTEtapaAudiencia(TEtapaAudiencia TEtapaAudiencia) {
		getTEtapaAudiencias().add(TEtapaAudiencia);
		TEtapaAudiencia.setCEtapa(this);

		return TEtapaAudiencia;
	}

	public TEtapaAudiencia removeTEtapaAudiencia(TEtapaAudiencia TEtapaAudiencia) {
		getTEtapaAudiencias().remove(TEtapaAudiencia);
		TEtapaAudiencia.setCEtapa(null);

		return TEtapaAudiencia;
	}

}