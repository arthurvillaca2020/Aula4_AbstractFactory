package org.example;

public class FabricaEstagiario implements FabricaAbstrata{
    @Override
    public Tarefas createTarefas() {
        return new TarefasEstagiario();
    }

    @Override
    public HistoricoDeTarefas createHistoricoDeTarefas() {
        return new HistoricoDeTarefasEstagiario();
    }
}
