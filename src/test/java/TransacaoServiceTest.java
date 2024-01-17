import br.com.alura.modelo.Usuario;
import br.com.alura.service.java.TransacaoService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.mockito.Mockito.mock;


//import java.util.Scanner;

public class TransacaoServiceTest {
   // Scanner entrada = new Scanner(System.in);
    
    @Test
    public void testandoATransferenciadoUsuarioComSaldoSuficiente(){
       Scanner entrada = mock(Scanner.class);
       Mockito.when(entrada.nextInt()).thenReturn(50);
        Usuario usuario = new Usuario("Maria", "corrente", 2000);
        TransacaoService transacaoService = new TransacaoService();
      boolean transacaoRealizada =  transacaoService.transfereValor(usuario);
        Assertions.assertTrue(transacaoRealizada);

    }
    @Test
    public void testandoATransferenciadoUsuarioComSaldoInsuficiente(){
        Scanner entrada = mock(Scanner.class);
        Mockito.when(entrada.nextInt()).thenReturn(3000);
        Usuario usuario = new Usuario("Maria", "corrente", 2000);
        TransacaoService transacaoService = new TransacaoService();
        boolean transacaoRealizada =  transacaoService.transfereValor(usuario);
        Assertions.assertTrue(transacaoRealizada);

    }
}
