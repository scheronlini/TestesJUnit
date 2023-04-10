import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTest {

    @Order(1)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }
}
