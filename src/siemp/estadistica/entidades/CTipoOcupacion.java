package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_ocupacion database table.
 * 
 */
@Entity
@Table(name="c_tipo_ocupacion")
@NamedQuery(name="CTipoOcupacion.findAll", query="SELECT c FROM CTipoOcupacion c")
public class CTipoOcupacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_ocupacion_id")
	private String cnTipoOcupacionId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_tipo_ocupacion")
	private String csTipoOcupacion;

	//bi-directional many-to-one association to COcupacionUgj
	@OneToMany(mappedBy="CTipoOcupacion")
	private List<COcupacionUgj> COcupacionUgjs;

	public CTipoOcupacion() {
	}

	public String getCnTipoOcupacionId() {
		return this.cnTipoOcupacionId;
	}

	public void setCnTipoOcupacionId(String cnTipoOcupacionId) {
		this.cnTipoOcupacionId = cnTipoOcupacionId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsTipoOcupacion() {
		return this.csTipoOcupacion;
	}

	public void setCsTipoOcupacion(String csTipoOcupacion) {
		this.csTipoOcupacion = csTipoOcupacion;
	}

	public List<COcupacionUgj> getCOcupacionUgjs() {
		return this.COcupacionUgjs;
	}

	public void setCOcupacionUgjs(List<COcupacionUgj> COcupacionUgjs) {
		this.COcupacionUgjs = COcupacionUgjs;
	}

	public COcupacionUgj addCOcupacionUgj(COcupacionUgj COcupacionUgj) {
		getCOcupacionUgjs().add(COcupacionUgj);
		COcupacionUgj.setCTipoOcupacion(this);

		return COcupacionUgj;
	}

	public COcupacionUgj removeCOcupacionUgj(COcupacionUgj COcupacionUgj) {
		getCOcupacionUgjs().remove(COcupacionUgj);
		COcupacionUgj.setCTipoOcupacion(null);

		return COcupacionUgj;
	}

}