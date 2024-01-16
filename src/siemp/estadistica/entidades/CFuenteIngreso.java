package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_fuente_ingresos database table.
 * 
 */
@Entity
@Table(name="c_fuente_ingresos")
@NamedQuery(name="CFuenteIngreso.findAll", query="SELECT c FROM CFuenteIngreso c")
public class CFuenteIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_fuente_ingresos_id")
	private String cnFuenteIngresosId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_fuente_ingresos")
	private String csFuenteIngresos;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CFuenteIngreso")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TListadoFuenteIngreso
	@OneToMany(mappedBy="CFuenteIngreso")
	private List<TListadoFuenteIngreso> TListadoFuenteIngresos;

	public CFuenteIngreso() {
	}

	public String getCnFuenteIngresosId() {
		return this.cnFuenteIngresosId;
	}

	public void setCnFuenteIngresosId(String cnFuenteIngresosId) {
		this.cnFuenteIngresosId = cnFuenteIngresosId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsFuenteIngresos() {
		return this.csFuenteIngresos;
	}

	public void setCsFuenteIngresos(String csFuenteIngresos) {
		this.csFuenteIngresos = csFuenteIngresos;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCFuenteIngreso(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCFuenteIngreso(null);

		return COtro;
	}

	public List<TListadoFuenteIngreso> getTListadoFuenteIngresos() {
		return this.TListadoFuenteIngresos;
	}

	public void setTListadoFuenteIngresos(List<TListadoFuenteIngreso> TListadoFuenteIngresos) {
		this.TListadoFuenteIngresos = TListadoFuenteIngresos;
	}

	public TListadoFuenteIngreso addTListadoFuenteIngreso(TListadoFuenteIngreso TListadoFuenteIngreso) {
		getTListadoFuenteIngresos().add(TListadoFuenteIngreso);
		TListadoFuenteIngreso.setCFuenteIngreso(this);

		return TListadoFuenteIngreso;
	}

	public TListadoFuenteIngreso removeTListadoFuenteIngreso(TListadoFuenteIngreso TListadoFuenteIngreso) {
		getTListadoFuenteIngresos().remove(TListadoFuenteIngreso);
		TListadoFuenteIngreso.setCFuenteIngreso(null);

		return TListadoFuenteIngreso;
	}

}