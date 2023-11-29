import java.util.Objects;
import java.util.ArrayList;
import java.util.List;


public class professor extends pessoa {
    String situacaoAluno;

    @Override
    public void curso() {
        System.out.println("'Vamos ver as notas dos meus queridos alunos'");
    }

    public void lista(){
        List<String> notas = new ArrayList<>();
        notas.add("6,5");
        notas.add("8,4");
        notas.add("9,5");
        notas.add("10,0");

        System.out.println("A MÉDIA DO ALUNO FOI: " + notas.get(1));
    }

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
}