package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_lengua_indigena_ugj database table.
 * 
 */
@Entity
@Table(name="c_lengua_indigena_ugj")
@NamedQuery(name="CLenguaIndigenaUgj.findAll", query="SELECT c FROM CLenguaIndigenaUgj c")
public class CLenguaIndigenaUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_lengua_indigena_id")
	private String cnLenguaIndigenaId;

	@Column(name="cs_ad_li")
	private String csAdLi;

	@Column(name="cs_agrupacion")
	private String csAgrupacion;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_familia_inegi")
	private String csFamiliaInegi;

	@Column(name="cs_fl_inali")
	private String csFlInali;

	@Column(name="cs_grupo_inegi")
	private String csGrupoInegi;

	@Column(name="cs_li_espanol")
	private String csLiEspanol;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CLenguaIndigenaUgj")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CLenguaIndigenaUgj")
	private List<TPersonaUgj> TPersonaUgjs;

	public CLenguaIndigenaUgj() {
	}

	public String getCnLenguaIndigenaId() {
		return this.cnLenguaIndigenaId;
	}

	public void setCnLenguaIndigenaId(String cnLenguaIndigenaId) {
		this.cnLenguaIndigenaId = cnLenguaIndigenaId;
	}

	public String getCsAdLi() {
		return this.csAdLi;
	}

	public void setCsAdLi(String csAdLi) {
		this.csAdLi = csAdLi;
	}

	public String getCsAgrupacion() {
		return this.csAgrupacion;
	}

	public void setCsAgrupacion(String csAgrupacion) {
		this.csAgrupacion = csAgrupacion;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsFamiliaInegi() {
		return this.csFamiliaInegi;
	}

	public void setCsFamiliaInegi(String csFamiliaInegi) {
		this.csFamiliaInegi = csFamiliaInegi;
	}

	public String getCsFlInali() {
		return this.csFlInali;
	}

	public void setCsFlInali(String csFlInali) {
		this.csFlInali = csFlInali;
	}

	public String getCsGrupoInegi() {
		return this.csGrupoInegi;
	}

	public void setCsGrupoInegi(String csGrupoInegi) {
		this.csGrupoInegi = csGrupoInegi;
	}

	public String getCsLiEspanol() {
		return this.csLiEspanol;
	}

	public void setCsLiEspanol(String csLiEspanol) {
		this.csLiEspanol = csLiEspanol;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCLenguaIndigenaUgj(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCLenguaIndigenaUgj(null);

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
		TPersonaUgj.setCLenguaIndigenaUgj(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCLenguaIndigenaUgj(null);

		return TPersonaUgj;
	}

}