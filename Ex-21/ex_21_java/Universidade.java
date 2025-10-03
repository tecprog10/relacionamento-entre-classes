public class Universidade {
    private String nome;
    private static final int MAX_DEPARTAMENTOS = 50;
    private Departamento[] departamentos;
    private int numDepartamentosAtuais;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new Departamento[MAX_DEPARTAMENTOS];
        this.numDepartamentosAtuais = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean adicionarDepartamento(Departamento depto) {
        if (this.numDepartamentosAtuais < MAX_DEPARTAMENTOS) {
            this.departamentos[this.numDepartamentosAtuais] = depto;
            this.numDepartamentosAtuais++;
            
            // A universidade, ao aceitar o departamento, estabelece o vínculo reverso
            depto.setUniversidade(this);
            return true;
        } else {
            System.out.println("Erro: Universidade '" + this.nome + "' já atingiu o limite de " + MAX_DEPARTAMENTOS + " departamentos.");
            return false;
        }
    }

    /**
     * Método para listar os departamentos afiliados a esta universidade.
     */
    public void listarDepartamentos() {
        System.out.println("Departamentos da " + this.nome + ":");
        if (numDepartamentosAtuais == 0) {
            System.out.println("- Nenhum departamento cadastrado.");
            return;
        }
        for (int i = 0; i < this.numDepartamentosAtuais; i++) {
            System.out.println("- " + this.departamentos[i].getNome());
        }
    }
}