package org.example;

public class FabricaSenior implements FabricaAbstrata{
    @Override
    public Tarefas createTarefas() {
        return new TarefasSenior();
    }

    @Override
    public HistoricoDeTarefas createHistoricoDeTarefas() {
        return new HistoricoDeTarefasSenior();
    }
}
