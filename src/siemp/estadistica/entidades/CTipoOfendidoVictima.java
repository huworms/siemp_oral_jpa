package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_ofendido_victima database table.
 * 
 */
@Entity
@Table(name="c_tipo_ofendido_victima")
@NamedQuery(name="CTipoOfendidoVictima.findAll", query="SELECT c FROM CTipoOfendidoVictima c")
public class CTipoOfendidoVictima implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_ofendido_victima_id")
	private String cnTipoOfendidoVictimaId;

	@Column(name="cs_tipo_ofendido_victima")
	private String csTipoOfendidoVictima;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CTipoOfendidoVictima")
	private List<TPersonaUgj> TPersonaUgjs;

	public CTipoOfendidoVictima() {
	}

	public String getCnTipoOfendidoVictimaId() {
		return this.cnTipoOfendidoVictimaId;
	}

	public void setCnTipoOfendidoVictimaId(String cnTipoOfendidoVictimaId) {
		this.cnTipoOfendidoVictimaId = cnTipoOfendidoVictimaId;
	}

	public String getCsTipoOfendidoVictima() {
		return this.csTipoOfendidoVictima;
	}

	public void setCsTipoOfendidoVictima(String csTipoOfendidoVictima) {
		this.csTipoOfendidoVictima = csTipoOfendidoVictima;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCTipoOfendidoVictima(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCTipoOfendidoVictima(null);

		return TPersonaUgj;
	}

}