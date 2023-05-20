package br.ce.wcaquino.builders;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Usuario;
import java.util.Arrays;
import java.lang.Double;
import java.util.Date;
import java.util.List;

import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.utils.DataUtils;

import static br.ce.wcaquino.builders.FilmeBuilder.umFilme;
import static br.ce.wcaquino.builders.UsuarioBuilder.umUsuario;
import static br.ce.wcaquino.utils.DataUtils.obterDataComDiferencaDias;


public class LocacaoBuilder {
    private Locacao locacao;
    private LocacaoBuilder(){}

    public static LocacaoBuilder umLocacao() {
        LocacaoBuilder builder = new LocacaoBuilder();
        inicializarDadosPadroes(builder);
        return builder;
    }

    public static void inicializarDadosPadroes(LocacaoBuilder builder) {
        builder.locacao = new Locacao();
        Locacao locacao = builder.locacao;


        locacao.setUsuario(umUsuario().agora());
        locacao.setFilmes(Arrays.asList(umFilme().agora()));
        locacao.setDataLocacao(new Date());
        locacao.setDataRetorno(obterDataComDiferencaDias(1));
        locacao.setValor(4.0);
    }

    public LocacaoBuilder comUsuario(Usuario usuario) {
        locacao.setUsuario(usuario);
        return this;
    }

    public LocacaoBuilder comListaFilmes(Filme filmes) {
        locacao.setFilmes(Arrays.asList(filmes));
        return this;
    }

    public LocacaoBuilder comDataLocacao(Date data) {
        locacao.setDataLocacao(data);
        return this;
    }

    public LocacaoBuilder comDataRetorno(Date data) {
        locacao.setDataRetorno(data);
        return this;
    }

    public LocacaoBuilder comValor(Double valor) {
        locacao.setValor(valor);
        return this;
    }

    public Locacao agora() {
        return locacao;
    }
    public LocacaoBuilder atrasado(){
        locacao.setDataLocacao(obterDataComDiferencaDias(-4));
        locacao.setDataRetorno(obterDataComDiferencaDias(-2));
        return this;
    }
}