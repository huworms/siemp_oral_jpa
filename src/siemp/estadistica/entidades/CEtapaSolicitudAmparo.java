package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_etapa_solicitud_amparo database table.
 * 
 */
@Entity
@Table(name="c_etapa_solicitud_amparo")
@NamedQuery(name="CEtapaSolicitudAmparo.findAll", query="SELECT c FROM CEtapaSolicitudAmparo c")
public class CEtapaSolicitudAmparo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_etapa_solicitud_amparo_id")
	private String cnEtapaSolicitudAmparoId;

	@Column(name="cs_etapa_solicitud_amparo")
	private String csEtapaSolicitudAmparo;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CEtapaSolicitudAmparo")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TAmparo
	@OneToMany(mappedBy="CEtapaSolicitudAmparo")
	private List<TAmparo> TAmparos;

	public CEtapaSolicitudAmparo() {
	}

	public String getCnEtapaSolicitudAmparoId() {
		return this.cnEtapaSolicitudAmparoId;
	}

	public void setCnEtapaSolicitudAmparoId(String cnEtapaSolicitudAmparoId) {
		this.cnEtapaSolicitudAmparoId = cnEtapaSolicitudAmparoId;
	}

	public String getCsEtapaSolicitudAmparo() {
		return this.csEtapaSolicitudAmparo;
	}

	public void setCsEtapaSolicitudAmparo(String csEtapaSolicitudAmparo) {
		this.csEtapaSolicitudAmparo = csEtapaSolicitudAmparo;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCEtapaSolicitudAmparo(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCEtapaSolicitudAmparo(null);

		return COtro;
	}

	public List<TAmparo> getTAmparos() {
		return this.TAmparos;
	}

	public void setTAmparos(List<TAmparo> TAmparos) {
		this.TAmparos = TAmparos;
	}

	public TAmparo addTAmparo(TAmparo TAmparo) {
		getTAmparos().add(TAmparo);
		TAmparo.setCEtapaSolicitudAmparo(this);

		return TAmparo;
	}

	public TAmparo removeTAmparo(TAmparo TAmparo) {
		getTAmparos().remove(TAmparo);
		TAmparo.setCEtapaSolicitudAmparo(null);

		return TAmparo;
	}

}