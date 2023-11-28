public class aluno extends pessoa{
    protected String matricula;
    protected double nota1;
    protected double nota2;
    protected double media;

    public void calcularMedia(){
        media = (nota1 + nota2) / 2;
        System.out.print("SUA MÉDIA É: ");
        System.out.println(media);
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
}
