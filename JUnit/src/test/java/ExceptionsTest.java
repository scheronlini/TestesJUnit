import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioExcecaoTransferencia(){

       Conta contaOrigem = new Conta("111111",0);
       Conta contaDestino = new Conta("555551",100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        //espera que a excessão seja lançada
        Assertions.assertThrows(IllegalArgumentException.class,() -> transferenciaEntreContas.transfere(contaOrigem,contaDestino,-5));

        //não espera que a excessão seja lançada
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem,contaDestino,5));

    }
}
