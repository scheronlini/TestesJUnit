import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa =  new Pessoa("julia", LocalDate.of(1990,12,11));
        Assertions.assertEquals(32,pessoa.getIdade());
    }
    @Test
    void validarEhMaiorDeIdade(){
        Pessoa pessoa1 =  new Pessoa("julia", LocalDate.of(1990,12,11));
        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());
    }
}
