import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTest {

    @Test
    void validarLancamentos(){
        int [] primeiroLancamento = {1,2,3,4,5};
        int [] segundoLancamento = {1,2,3,4,5};

        Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarObjetoNull(){
        Pessoa pessoa  = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Olivia", LocalDate.of(2000,8,8));
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarDiferentesTipos(){
        double a = 2.0;
        double b = 2.0;

        Assertions.assertEquals(a,b);
    }



}
