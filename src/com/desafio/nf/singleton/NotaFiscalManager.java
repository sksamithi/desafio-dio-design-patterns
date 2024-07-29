package com.desafio.nf.singleton;

import com.desafio.nf.model.NotaFiscal;

public class NotaFiscalManager {
    private static NotaFiscalManager instance;

    private NotaFiscalManager() {}

    public static NotaFiscalManager getInstance() {
        if (instance == null) {
            instance = new NotaFiscalManager();
        }
        return instance;
    }

    public void emitirNotaFiscal(NotaFiscal notaFiscal) {
        System.out.println("Nota Fiscal emitida: ");
        System.out.println(notaFiscal);
    }
}
