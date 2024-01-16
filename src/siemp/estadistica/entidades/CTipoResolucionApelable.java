package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_resolucion_apelable database table.
 * 
 */
@Entity
@Table(name="c_tipo_resolucion_apelable")
@NamedQuery(name="CTipoResolucionApelable.findAll", query="SELECT c FROM CTipoResolucionApelable c")
public class CTipoResolucionApelable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_resolucion_apelable_id")
	private String cnTipoResolucionApelableId;

	@Lob
	@Column(name="cn_tipo_resolucion_apelable")
	private String cnTipoResolucionApelable;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CTipoResolucionApelable")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TApelacionUgj
	@OneToMany(mappedBy="CTipoResolucionApelable")
	private List<TApelacionUgj> TApelacionUgjs;

	public CTipoResolucionApelable() {
	}

	public String getCnTipoResolucionApelableId() {
		return this.cnTipoResolucionApelableId;
	}

	public void setCnTipoResolucionApelableId(String cnTipoResolucionApelableId) {
		this.cnTipoResolucionApelableId = cnTipoResolucionApelableId;
	}

	public String getCnTipoResolucionApelable() {
		return this.cnTipoResolucionApelable;
	}

	public void setCnTipoResolucionApelable(String cnTipoResolucionApelable) {
		this.cnTipoResolucionApelable = cnTipoResolucionApelable;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCTipoResolucionApelable(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCTipoResolucionApelable(null);

		return COtro;
	}

	public List<TApelacionUgj> getTApelacionUgjs() {
		return this.TApelacionUgjs;
	}

	public void setTApelacionUgjs(List<TApelacionUgj> TApelacionUgjs) {
		this.TApelacionUgjs = TApelacionUgjs;
	}

	public TApelacionUgj addTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().add(TApelacionUgj);
		TApelacionUgj.setCTipoResolucionApelable(this);

		return TApelacionUgj;
	}

	public TApelacionUgj removeTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().remove(TApelacionUgj);
		TApelacionUgj.setCTipoResolucionApelable(null);

		return TApelacionUgj;
	}

}