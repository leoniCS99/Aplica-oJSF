package br.com.leoni.primeiraAplicacaoJSF.mapper;

import br.com.leoni.primeiraAplicacaoJSF.Lembrete;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LembreteMapper {


    private final List<Lembrete> lembretes = new ArrayList<Lembrete>();

    public LembreteMapper() {
        Instant agora = LocalDate.now().atStartOfDay()
                .atZone(ZoneId.systemDefault()).toInstant();

        Lembrete lembrete = new Lembrete();
        lembrete.setId(1L);
        lembrete.setTitulo("Comprar leite");
        lembrete.setDescricao("Hoje, 11h");
        lembrete.setDataCadastro(Date.from(agora));
        lembrete.setDataInicio(Date.from(agora));

        adicionar(lembrete);
    }

    public List<Lembrete> getLembretes() {
        return lembretes;
    }

    public void adicionar(Lembrete lembrete) {
        lembrete.setId(lembrete.size() + 1);


        Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date hoje = Date.from(agora);
        lembrete.setDataCadastro(hoje);

        lembretes.add(lembrete);
    }

    public void remover(Lembrete lembrete) {
        try {
            buscar(lembrete.getId());

            lembretes.remove(lembrete);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void buscar(long id) {

    }


    private void editar(Lembrete lembrete) {
        try {
            for (Lembrete it : lembretes) {
                if (it.getIdI() == lembrete.getId()) {
                    it = lembrete;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Lembrete busca(long id) {
        Lembrete lembrete = null;

        try {
            for (Lembrete it : lembretes) {
                if (it.getId() == id) {
                    lembrete = it;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lembrete;
    }
}


