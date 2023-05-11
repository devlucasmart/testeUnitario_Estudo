package br.ce.wcaquino.entidades;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Filme {
	private String nome;
	private Integer estoque;
	private Double precoLocacao;

}