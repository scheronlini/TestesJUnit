import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "scheronlini") // somente roda se for neste usuario
    void validarAlgoSomenteNoUsuarioScheronlini(){
        Assertions.assertTrue(true);
    }
}
