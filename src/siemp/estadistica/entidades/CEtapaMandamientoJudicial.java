package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_etapa_mandamiento_judicial database table.
 * 
 */
@Entity
@Table(name="c_etapa_mandamiento_judicial")
@NamedQuery(name="CEtapaMandamientoJudicial.findAll", query="SELECT c FROM CEtapaMandamientoJudicial c")
public class CEtapaMandamientoJudicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_etapa_mandamiento_judicial_id")
	private String cnEtapaMandamientoJudicialId;

	@Column(name="cs_etapa_mandamiento_judicial")
	private String csEtapaMandamientoJudicial;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CEtapaMandamientoJudicial")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TProcesoJudicial
	@OneToMany(mappedBy="CEtapaMandamientoJudicial")
	private List<TProcesoJudicial> TProcesoJudicials;

	public CEtapaMandamientoJudicial() {
	}

	public String getCnEtapaMandamientoJudicialId() {
		return this.cnEtapaMandamientoJudicialId;
	}

	public void setCnEtapaMandamientoJudicialId(String cnEtapaMandamientoJudicialId) {
		this.cnEtapaMandamientoJudicialId = cnEtapaMandamientoJudicialId;
	}

	public String getCsEtapaMandamientoJudicial() {
		return this.csEtapaMandamientoJudicial;
	}

	public void setCsEtapaMandamientoJudicial(String csEtapaMandamientoJudicial) {
		this.csEtapaMandamientoJudicial = csEtapaMandamientoJudicial;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCEtapaMandamientoJudicial(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCEtapaMandamientoJudicial(null);

		return COtro;
	}

	public List<TProcesoJudicial> getTProcesoJudicials() {
		return this.TProcesoJudicials;
	}

	public void setTProcesoJudicials(List<TProcesoJudicial> TProcesoJudicials) {
		this.TProcesoJudicials = TProcesoJudicials;
	}

	public TProcesoJudicial addTProcesoJudicial(TProcesoJudicial TProcesoJudicial) {
		getTProcesoJudicials().add(TProcesoJudicial);
		TProcesoJudicial.setCEtapaMandamientoJudicial(this);

		return TProcesoJudicial;
	}

	public TProcesoJudicial removeTProcesoJudicial(TProcesoJudicial TProcesoJudicial) {
		getTProcesoJudicials().remove(TProcesoJudicial);
		TProcesoJudicial.setCEtapaMandamientoJudicial(null);

		return TProcesoJudicial;
	}

}