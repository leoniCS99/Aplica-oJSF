package br.com.leoni.primeiraAplicacaoJSF.bean;

import br.com.leoni.primeiraAplicacaoJSF.Lembrete;
import br.com.leoni.primeiraAplicacaoJSF.mapper.LembreteMapper;

import java.util.List;



public class LembreteBean {

    private Lembrete lembrete;
    private final LembreteMapper mapper = new LembreteMapper();



    public Lembrete getLembrete(){
        return lembrete;
    }

    public List<Lembrete> getLembretes(){
        return mapper.getLembretes();
    }
}
