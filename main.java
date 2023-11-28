import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pessoa p = new pessoa();
        aluno al = new aluno();
        professor prof = new professor();

        System.out.println("BEM-VINDO AO PORTAL DO UNIVERSITÁRIO!");
        System.out.println("QUAL LOGIN VOCÊ GOSTARIA DE FAZER? (Aluno ou Professor)");
        p.setCargo(sc.next());

        if (Objects.equals(p.getCargo(), "Aluno")){
            System.out.print("INFORME A SUA NOTA NA AV1: ");
            al.setNota1(sc.nextDouble());
            System.out.print("INFORME A SUA NOTA NA AV2: ");
            al.setNota2(sc.nextDouble());
            al.calcularMedia();
        } else if (Objects.equals(p.getCargo(), "Professor")) {
            System.out.println("A MÉDIA DO ALUNO FOI: 6,5");
            System.out.println("VOCÊ DESEJA APROVAR ESTE ALUNO? (sim ou nao)");
            prof.setSituacaoAluno(sc.next());
            prof.julgar();
        } else{
            System.out.println("CARGO INVÁLIDO");
        }
    }
}
