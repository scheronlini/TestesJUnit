import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioScheronlini(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertTrue(true);
    }
}
