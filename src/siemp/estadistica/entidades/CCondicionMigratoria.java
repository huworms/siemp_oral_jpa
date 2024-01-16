package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_condicion_migratoria database table.
 * 
 */
@Entity
@Table(name="c_condicion_migratoria")
@NamedQuery(name="CCondicionMigratoria.findAll", query="SELECT c FROM CCondicionMigratoria c")
public class CCondicionMigratoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_condicion_migratoria_id")
	private String cnCondicionMigratoriaId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_condicion_migratoria")
	private String csCondicionMigratoria;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CCondicionMigratoria")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CCondicionMigratoria")
	private List<TPersonaUgj> TPersonaUgjs;

	public CCondicionMigratoria() {
	}

	public String getCnCondicionMigratoriaId() {
		return this.cnCondicionMigratoriaId;
	}

	public void setCnCondicionMigratoriaId(String cnCondicionMigratoriaId) {
		this.cnCondicionMigratoriaId = cnCondicionMigratoriaId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsCondicionMigratoria() {
		return this.csCondicionMigratoria;
	}

	public void setCsCondicionMigratoria(String csCondicionMigratoria) {
		this.csCondicionMigratoria = csCondicionMigratoria;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCCondicionMigratoria(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCCondicionMigratoria(null);

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
		TPersonaUgj.setCCondicionMigratoria(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCCondicionMigratoria(null);

		return TPersonaUgj;
	}

}