package br.com.fiap.sprint.dominio;

public class Cliente {

    private String nome;
    private String cpf;

    private String telefone;

    private String email;



    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean validarNome(String nome) {

        return nome != null && nome.matches("[a-zA-Z]+") && nome.length() > 2 ;
    }
    public static boolean validarCPF(String cpf) {

        cpf = cpf.replaceAll("[^0-9]", "");


        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }


        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int primeiroDV = 11 - (soma % 11);
        if (primeiroDV >= 10) {
            primeiroDV = 0;
        }
        if (Character.getNumericValue(cpf.charAt(9)) != primeiroDV) {
            return false;
        }


        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int segundoDV = 11 - (soma % 11);
        if (segundoDV >= 10) {
            segundoDV = 0;
        }
        return Character.getNumericValue(cpf.charAt(10)) == segundoDV;
    }

    public boolean validarTelefone(String telefone) {
        if (telefone.length() != 11 ||telefone == null || telefone.isEmpty()) {
            return false;
        }

        for (char c : telefone.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public boolean validarEmail(String email) {
        if (email.length() != 11 ||email == null || email.isEmpty()) {
            return false;
        }

        return true;
    }



}
