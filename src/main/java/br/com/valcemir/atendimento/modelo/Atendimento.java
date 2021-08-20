package br.com.valcemir.atendimento.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int tempo;
	private Date data;
	private String obs;
	@ManyToOne
	@JoinColumn(name = "parciente_id")
	private Parciente parciente;

	public Atendimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Atendimento(Integer id, int tempo, Date data, String obs, Parciente parciente) {
		super();
		this.id = id;
		this.tempo = tempo;
		this.data = data;
		this.obs = obs;
		this.parciente = parciente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Parciente getParciente() {
		return parciente;
	}

	public void setParciente(Parciente parciente) {
		this.parciente = parciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendimento other = (Atendimento) obj;
		return Objects.equals(id, other.id);
	}
}
