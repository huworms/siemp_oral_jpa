package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_opp database table.
 * 
 */
@Entity
@Table(name="c_tipo_opp")
@NamedQuery(name="CTipoOpp.findAll", query="SELECT c FROM CTipoOpp c")
public class CTipoOpp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_opp")
	private String cnTipoOpp;

	@Lob
	@Column(name="cs_tipo_opp")
	private String csTipoOpp;

	//bi-directional many-to-one association to TListadoTipoOpp
	@OneToMany(mappedBy="CTipoOpp")
	private List<TListadoTipoOpp> TListadoTipoOpps;

	public CTipoOpp() {
	}

	public String getCnTipoOpp() {
		return this.cnTipoOpp;
	}

	public void setCnTipoOpp(String cnTipoOpp) {
		this.cnTipoOpp = cnTipoOpp;
	}

	public String getCsTipoOpp() {
		return this.csTipoOpp;
	}

	public void setCsTipoOpp(String csTipoOpp) {
		this.csTipoOpp = csTipoOpp;
	}

	public List<TListadoTipoOpp> getTListadoTipoOpps() {
		return this.TListadoTipoOpps;
	}

	public void setTListadoTipoOpps(List<TListadoTipoOpp> TListadoTipoOpps) {
		this.TListadoTipoOpps = TListadoTipoOpps;
	}

	public TListadoTipoOpp addTListadoTipoOpp(TListadoTipoOpp TListadoTipoOpp) {
		getTListadoTipoOpps().add(TListadoTipoOpp);
		TListadoTipoOpp.setCTipoOpp(this);

		return TListadoTipoOpp;
	}

	public TListadoTipoOpp removeTListadoTipoOpp(TListadoTipoOpp TListadoTipoOpp) {
		getTListadoTipoOpps().remove(TListadoTipoOpp);
		TListadoTipoOpp.setCTipoOpp(null);

		return TListadoTipoOpp;
	}

}