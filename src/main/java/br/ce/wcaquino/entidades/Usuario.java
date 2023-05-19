package br.ce.wcaquino.entidades;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Usuario {
	private String nome;
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Usuario)) return false;
		Usuario usuario = (Usuario) o;
		return Objects.equals(getNome(), usuario.getNome());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getNome());
	}
}