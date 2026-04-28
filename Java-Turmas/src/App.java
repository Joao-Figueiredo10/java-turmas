public class App {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor();
        professor.setNumero(12345);
        professor.setNomeProprio("Luís");
        professor.setNomeApelido("Santos");
        professor.setAnoNascimento(1978);
        professor.setArea("Programação");
        System.out.println(professor.getNomeCompleto());

        Turma turma = new Turma();
        turma.setCodigo("CX12345");
        turma.setNomeCurso("Programação");
        turma.setAnoInicio(2025);
        turma.setAnoFim(2028);
    }
}
