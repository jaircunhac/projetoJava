import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        aluno al = new aluno();
        professor prof = new professor();

        System.out.println("BEM-VINDO AO PORTAL DO UNIVERSITÁRIO!");
        System.out.println("QUAL LOGIN VOCÊ GOSTARIA DE FAZER? (Aluno ou Professor)");
        String cargo = sc.next();

        if (Objects.equals(cargo, "Aluno")){
            al.curso();
            System.out.print("INFORME A SUA NOTA NA AV1: ");
            al.setNota1(sc.nextDouble());
            System.out.print("INFORME A SUA NOTA NA AV2: ");
            al.setNota2(sc.nextDouble());
            al.calcularMedia();
        } else if (Objects.equals(cargo, "Professor")) {
            prof.curso();
            prof.lista();
            System.out.println("VOCÊ DESEJA APROVAR ESTE ALUNO? (sim ou nao)");
            prof.setSituacaoAluno(sc.next());
            prof.julgar();
        } else{
            System.out.println("CARGO INVÁLIDO");
        }
    }
}
