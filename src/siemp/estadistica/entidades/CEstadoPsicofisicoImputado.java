package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_estado_psicofisico_imputado database table.
 * 
 */
@Entity
@Table(name="c_estado_psicofisico_imputado")
@NamedQuery(name="CEstadoPsicofisicoImputado.findAll", query="SELECT c FROM CEstadoPsicofisicoImputado c")
public class CEstadoPsicofisicoImputado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_estado_psicofisico_imputado_id")
	private String cnEstadoPsicofisicoImputadoId;

	@Column(name="cs_estado_psicofisico_imputado")
	private String csEstadoPsicofisicoImputado;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CEstadoPsicofisicoImputado")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CEstadoPsicofisicoImputado")
	private List<TPersonaUgj> TPersonaUgjs;

	public CEstadoPsicofisicoImputado() {
	}

	public String getCnEstadoPsicofisicoImputadoId() {
		return this.cnEstadoPsicofisicoImputadoId;
	}

	public void setCnEstadoPsicofisicoImputadoId(String cnEstadoPsicofisicoImputadoId) {
		this.cnEstadoPsicofisicoImputadoId = cnEstadoPsicofisicoImputadoId;
	}

	public String getCsEstadoPsicofisicoImputado() {
		return this.csEstadoPsicofisicoImputado;
	}

	public void setCsEstadoPsicofisicoImputado(String csEstadoPsicofisicoImputado) {
		this.csEstadoPsicofisicoImputado = csEstadoPsicofisicoImputado;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCEstadoPsicofisicoImputado(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCEstadoPsicofisicoImputado(null);

		return COtro;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCEstadoPsicofisicoImputado(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCEstadoPsicofisicoImputado(null);

		return TPersonaUgj;
	}

}