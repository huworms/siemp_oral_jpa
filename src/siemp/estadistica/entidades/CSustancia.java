package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_sustancia database table.
 * 
 */
@Entity
@Table(name="c_sustancia")
@NamedQuery(name="CSustancia.findAll", query="SELECT c FROM CSustancia c")
public class CSustancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_sustancia_id")
	private String cnSustanciaId;

	@Column(name="cs_tipo")
	private String csTipo;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CSustancia")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TConsumo
	@OneToMany(mappedBy="CSustancia")
	private List<TConsumo> TConsumos;

	public CSustancia() {
	}

	public String getCnSustanciaId() {
		return this.cnSustanciaId;
	}

	public void setCnSustanciaId(String cnSustanciaId) {
		this.cnSustanciaId = cnSustanciaId;
	}

	public String getCsTipo() {
		return this.csTipo;
	}

	public void setCsTipo(String csTipo) {
		this.csTipo = csTipo;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCSustancia(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCSustancia(null);

		return COtro;
	}

	public List<TConsumo> getTConsumos() {
		return this.TConsumos;
	}

	public void setTConsumos(List<TConsumo> TConsumos) {
		this.TConsumos = TConsumos;
	}

	public TConsumo addTConsumo(TConsumo TConsumo) {
		getTConsumos().add(TConsumo);
		TConsumo.setCSustancia(this);

		return TConsumo;
	}

	public TConsumo removeTConsumo(TConsumo TConsumo) {
		getTConsumos().remove(TConsumo);
		TConsumo.setCSustancia(null);

		return TConsumo;
	}

}