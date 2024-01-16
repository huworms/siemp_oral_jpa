package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_acto database table.
 * 
 */
@Entity
@Table(name="c_tipo_acto")
@NamedQuery(name="CTipoActo.findAll", query="SELECT c FROM CTipoActo c")
public class CTipoActo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_acto")
	private int idTipoActo;

	private String descripcion;

	@Column(name="id_tipo_audiencia")
	private int idTipoAudiencia;

	private int orden;

	//bi-directional many-to-one association to TActoProcesal
	@OneToMany(mappedBy="CTipoActo")
	private List<TActoProcesal> TActoProcesals;

	public CTipoActo() {
	}

	public int getIdTipoActo() {
		return this.idTipoActo;
	}

	public void setIdTipoActo(int idTipoActo) {
		this.idTipoActo = idTipoActo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdTipoAudiencia() {
		return this.idTipoAudiencia;
	}

	public void setIdTipoAudiencia(int idTipoAudiencia) {
		this.idTipoAudiencia = idTipoAudiencia;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public List<TActoProcesal> getTActoProcesals() {
		return this.TActoProcesals;
	}

	public void setTActoProcesals(List<TActoProcesal> TActoProcesals) {
		this.TActoProcesals = TActoProcesals;
	}

	public TActoProcesal addTActoProcesal(TActoProcesal TActoProcesal) {
		getTActoProcesals().add(TActoProcesal);
		TActoProcesal.setCTipoActo(this);

		return TActoProcesal;
	}

	public TActoProcesal removeTActoProcesal(TActoProcesal TActoProcesal) {
		getTActoProcesals().remove(TActoProcesal);
		TActoProcesal.setCTipoActo(null);

		return TActoProcesal;
	}

}