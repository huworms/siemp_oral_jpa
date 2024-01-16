package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_listado_fuente_ingresos database table.
 * 
 */
@Entity
@Table(name="t_listado_fuente_ingresos")
@NamedQuery(name="TListadoFuenteIngreso.findAll", query="SELECT t FROM TListadoFuenteIngreso t")
public class TListadoFuenteIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_listado_fuente_ingresos_id")
	private String cnListadoFuenteIngresosId;

	//bi-directional many-to-one association to CFuenteIngreso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_fuente_ingresos_id")
	private CFuenteIngreso CFuenteIngreso;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TListadoFuenteIngreso() {
	}

	public String getCnListadoFuenteIngresosId() {
		return this.cnListadoFuenteIngresosId;
	}

	public void setCnListadoFuenteIngresosId(String cnListadoFuenteIngresosId) {
		this.cnListadoFuenteIngresosId = cnListadoFuenteIngresosId;
	}

	public CFuenteIngreso getCFuenteIngreso() {
		return this.CFuenteIngreso;
	}

	public void setCFuenteIngreso(CFuenteIngreso CFuenteIngreso) {
		this.CFuenteIngreso = CFuenteIngreso;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}