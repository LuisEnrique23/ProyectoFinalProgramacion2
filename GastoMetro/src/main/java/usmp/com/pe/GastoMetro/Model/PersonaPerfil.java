package usmp.com.pe.GastoMetro.Model;

public class PersonaPerfil {
	String nombre;
	int IdPersona;
	int IdPerfil;
	String estadoPerf;
	Persona persona;
	Perfil perfil;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdPersona() {
		return IdPersona;
	}
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}
	public int getIdPerfil() {
		return IdPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		IdPerfil = idPerfil;
	}
	public String getEstadoPerf() {
		return estadoPerf;
	}
	public void setEstadoPerf(String estadoPerf) {
		this.estadoPerf = estadoPerf;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}
