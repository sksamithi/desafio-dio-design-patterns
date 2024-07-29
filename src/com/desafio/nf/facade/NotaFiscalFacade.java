package com.desafio.nf.facade;

import com.desafio.nf.model.NotaFiscal;
import com.desafio.nf.model.Produto;
import com.desafio.nf.singleton.NotaFiscalManager;
import java.util.List;

public class NotaFiscalFacade {
    private NotaFiscalManager notaFiscalManager;

    public NotaFiscalFacade() {
        this.notaFiscalManager = NotaFiscalManager.getInstance();
    }

    public NotaFiscalManager getNotaFiscalManager() {
        return notaFiscalManager;
    }

    public void setNotaFiscalManager(NotaFiscalManager notaFiscalManager) {
        this.notaFiscalManager = notaFiscalManager;
    }

    public void emitirNota(List<Produto> produtos) {
        NotaFiscal notaFiscal = new NotaFiscal();
        for (Produto produto : produtos) {
            notaFiscal.adicionarProduto(produto);
        }
        notaFiscalManager.emitirNotaFiscal(notaFiscal);
    }
}
