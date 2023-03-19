import org.example.FabricaSenior;
import org.example.Funcionario;
import org.example.FabricaAbstrata;
import org.example.FabricaEstagiario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
    @Test
    void deveEmitirHistoricoDeTarefasEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Histórico de tarefas de estagiario", funcionario.emitirHistoricoDeTarefas());
    }
    @Test
    void deveEmitirHistoricoDeTarefasSenior() {
        FabricaAbstrata fabrica = new FabricaSenior();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Histórico de tarefas de senior", funcionario.emitirHistoricoDeTarefas());
    }

    @Test
    void deveEmitirTarefasEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Tarefas do Estagiario", funcionario.emitirTarefas());
    }

    @Test
    void deveEmitirTarefasSenior() {
        FabricaAbstrata fabrica = new FabricaSenior();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Tarefas do Senior", funcionario.emitirTarefas());
    }
}
