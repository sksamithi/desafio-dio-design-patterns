import com.desafio.nf.facade.NotaFiscalFacade;
import com.desafio.nf.model.Produto;
import com.desafio.nf.strategy.Icms;
import com.desafio.nf.strategy.Iss;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 20.0, new Icms());
        Produto produto2 = new Produto("Feijão", 10.0, new Iss());
        Produto produto3 = new Produto("Macarrão", 5.0, new Icms());

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        NotaFiscalFacade notaFiscalFacade = new NotaFiscalFacade();
        notaFiscalFacade.emitirNota(produtos);
    }
}
