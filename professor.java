import java.util.Objects;

public class professor extends pessoa{
    String situacaoAluno;
    String cadastro;

    public void julgar(){
        if(Objects.equals(situacaoAluno, "nao")){
            System.out.println("O ALUNO FOI REPROVADO");
        } else if (Objects.equals(situacaoAluno, "sim")) {
            System.out.println("O ALUNO ESTÁ APROVADO");
        } else {
            System.out.println("COMANDO NÃO RECONHECIDO");
        }
    }

    public String getSituacaoAluno() {
        return situacaoAluno;
    }
    public void setSituacaoAluno(String situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }
    public String getCadastro() {
        return cadastro;
    }
    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }
}