package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_delito_victima database table.
 * 
 */
@Entity
@Table(name="t_delito_victima")
@NamedQuery(name="TDelitoVictima.findAll", query="SELECT t FROM TDelitoVictima t")
public class TDelitoVictima implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TDelitoVictimaPK id;

	//bi-directional many-to-one association to TDelito
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_delito", insertable=false, updatable=false)
	private TDelito TDelito;

	public TDelitoVictima() {
	}

	public TDelitoVictimaPK getId() {
		return this.id;
	}

	public void setId(TDelitoVictimaPK id) {
		this.id = id;
	}

	public TDelito getTDelito() {
		return this.TDelito;
	}

	public void setTDelito(TDelito TDelito) {
		this.TDelito = TDelito;
	}

}