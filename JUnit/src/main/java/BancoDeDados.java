import java.time.LocalDate;
import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexaoBancoDeDados(){
        //fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexaoBancoDeDados(){
        //fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereBancoDeDados(Pessoa pessoa){

        LOGGER.info("Inseriu Dados");
    }

    public static void removeBancoDeDados(Pessoa pessoa){
        LOGGER.info("Removeu Dados");
    }
}
