package br.com.fiap.sprint.dominio;

import java.util.ArrayList;

public interface RepositorioCliente {

    void adicionar(Cliente cliente);
    void fechar();

    Aluno buscarAlunosPorTurmaEChamada(String turma, String chamada);

    ArrayList<Cliente> buscarAlunosPorTurma(String turma);
}
