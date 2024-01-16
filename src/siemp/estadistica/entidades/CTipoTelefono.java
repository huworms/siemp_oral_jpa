package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_telefono database table.
 * 
 */
@Entity
@Table(name="c_tipo_telefono")
@NamedQuery(name="CTipoTelefono.findAll", query="SELECT c FROM CTipoTelefono c")
public class CTipoTelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_telefono_id")
	private String cnTipoTelefonoId;

	@Column(name="cs_tipo_telefono")
	private String csTipoTelefono;

	//bi-directional many-to-one association to TTelefono
	@OneToMany(mappedBy="CTipoTelefono")
	private List<TTelefono> TTelefonos;

	public CTipoTelefono() {
	}

	public String getCnTipoTelefonoId() {
		return this.cnTipoTelefonoId;
	}

	public void setCnTipoTelefonoId(String cnTipoTelefonoId) {
		this.cnTipoTelefonoId = cnTipoTelefonoId;
	}

	public String getCsTipoTelefono() {
		return this.csTipoTelefono;
	}

	public void setCsTipoTelefono(String csTipoTelefono) {
		this.csTipoTelefono = csTipoTelefono;
	}

	public List<TTelefono> getTTelefonos() {
		return this.TTelefonos;
	}

	public void setTTelefonos(List<TTelefono> TTelefonos) {
		this.TTelefonos = TTelefonos;
	}

	public TTelefono addTTelefono(TTelefono TTelefono) {
		getTTelefonos().add(TTelefono);
		TTelefono.setCTipoTelefono(this);

		return TTelefono;
	}

	public TTelefono removeTTelefono(TTelefono TTelefono) {
		getTTelefonos().remove(TTelefono);
		TTelefono.setCTipoTelefono(null);

		return TTelefono;
	}

}