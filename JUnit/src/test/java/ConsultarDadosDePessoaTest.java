import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    //beforeAll roda 1 vez antes dos testes
    static void configuraConexao(){
        BancoDeDados.iniciarConexaoBancoDeDados();
    }
    //beforeEach roda antes de cada teste
    @BeforeEach
    void inserirDadosTest(){
        BancoDeDados.insereBancoDeDados(new Pessoa("dalila",LocalDate.of(2000,8,8)));
    }

    @AfterEach
    void removeDadosTest(){
        BancoDeDados.removeBancoDeDados(new Pessoa("dalila",LocalDate.of(2000,8,8)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexaoBancoDeDados();
    }
}
