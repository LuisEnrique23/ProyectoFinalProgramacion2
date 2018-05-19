package usmp.com.pe.GastoMetro.Model;

public class RegistroCredito {
	String IdRegCred;
	String clave;
	String fecReg;
	String pin;
	String tipoReg;
	String estado;
	Persona persona;
	public String getIdRegCred() {
		return IdRegCred;
	}
	public void setIdRegCred(String idRegCred) {
		IdRegCred = idRegCred;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFecReg() {
		return fecReg;
	}
	public void setFecReg(String fecReg) {
		this.fecReg = fecReg;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getTipoReg() {
		return tipoReg;
	}
	public void setTipoReg(String tipoReg) {
		this.tipoReg = tipoReg;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
