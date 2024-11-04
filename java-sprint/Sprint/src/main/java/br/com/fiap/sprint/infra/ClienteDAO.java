package br.com.fiap.sprint.infra;

import br.com.fiap.sprint.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ClienteDAO{

    private Connection conexao;

    public ClienteDAO() {
        conexao = new ConnectionFactory().getConnection();
    }

    public void adicionar(Cliente cliente) {
        try {
            String sql = "INSERT INTO ALUNOS (nome, cpf) VALUES(?, ?)";
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sql);
            comandoDeInsercao.setString(1, cliente.getNome());
            comandoDeInsercao.setString(2, cliente.getCpf());
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public ArrayList<Cliente> listarTodos() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            String sqlSelect = "SELECT * FROM FUNCIONARIOS";
            PreparedStatement comandoDeSelecao =
                    conexao.prepareStatement(sqlSelect);
            ResultSet rs = comandoDeSelecao.executeQuery();
            while(rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));

                clientes.add(cliente);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }
    public Cliente alterarUsuario(Cliente cliente){



        try {
            String sql = "UPDATE usuario SET nome = ?, cpfl = ?, telefone = ? email = ?";
            PreparedStatement comandoDeAlterar = conexao.prepareStatement(sql);

            comandoDeAlterar.setString(1, cliente.getNome());
            comandoDeAlterar.setString(2, cliente.getCpf());
            comandoDeAlterar.setString(3, cliente.getTelefone());
            comandoDeAlterar.setString(4, cliente.getEmail());

            comandoDeAlterar.execute();
            comandoDeAlterar.close();


        }catch(SQLException e) {
            throw new RuntimeException(e);
        }


        return cliente;
    }


    public boolean deletarUsuario(String cpf){
        boolean operacaoDeletar;



        try {
            String sql = "DELETE FROM usuario WHERE id_usuario = ?";
            PreparedStatement comandoDeDeletar = conexao.prepareStatement(sql);

            comandoDeDeletar.setString(1,cpf);

            comandoDeDeletar.execute();
            comandoDeDeletar.close();


        }catch(SQLException e) {
            throw new RuntimeException(e);
        }


        return operacaoDeletar = true;
    }
    

    public void fechar() {
        try {
            conexao.close();
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }


}