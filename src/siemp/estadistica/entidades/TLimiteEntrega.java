package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_limite_entrega database table.
 * 
 */
@Entity
@Table(name="t_limite_entrega")
@NamedQuery(name="TLimiteEntrega.findAll", query="SELECT t FROM TLimiteEntrega t")
public class TLimiteEntrega implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TLimiteEntregaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_limite")
	private Date fechaLimite;

	public TLimiteEntrega() {
	}

	public TLimiteEntregaPK getId() {
		return this.id;
	}

	public void setId(TLimiteEntregaPK id) {
		this.id = id;
	}

	public Date getFechaLimite() {
		return this.fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

}