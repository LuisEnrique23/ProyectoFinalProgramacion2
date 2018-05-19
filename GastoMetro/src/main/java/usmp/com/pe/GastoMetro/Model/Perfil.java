package usmp.com.pe.GastoMetro.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perfil")
public class Perfil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int IdPerfil;
	
	String nomPerf;
	
	String descPerf;
	
	int estado;
	
	public int getIdPerfil() {
		return IdPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		IdPerfil = idPerfil;
	}
	public String getNomPerf() {
		return nomPerf;
	}
	public void setNomPerf(String nomPerf) {
		this.nomPerf = nomPerf;
	}
	public String getDescPerf() {
		return descPerf;
	}
	public void setDescPerf(String descPerf) {
		this.descPerf = descPerf;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
