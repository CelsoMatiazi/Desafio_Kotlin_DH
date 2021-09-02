package classes

class DigitalHouseManager(
    val professores: List<Professor>,
    val alunos: List<Aluno>,
    val cursos: List<Curso>,
    val matriculas: List<Matricula>
) {

    fun registrarCurso(nome: String, codCurso: Int, qtdMaxAlunos: Int){}

    fun excluirCurso(codCurso: Int){}

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codProfessor: Int, qtdDeHoras: Int){}

    fun registrarProfessorTitular(nome: String, sobrenome: String, codProfessor: Int, especialidade: String, tempoDeCasa: Int = 0){}

    fun excluirProfessor(codProfessor: Int){}

    fun matricularAluno(nome: String, sobrenome: String, codAluno: Int){}

    fun matricularAluno(codAluno: Int, codCurso: Int){}

    fun alocarProfesses(codCurso: Int, codProfessorTitular: Int, codProfessorAdjunto: Int){}




}