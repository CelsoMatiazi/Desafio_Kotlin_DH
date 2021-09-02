package classes

class Curso(
    val nome: String,
    val codCurso: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val qtdMaxAlunos: Int,
    val listaDeAlunos: List<Aluno>
    ) {

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codCurso == this.codCurso)
    }

    fun adicionarUmAluno(umAluno: Aluno) : Boolean{ return true }

    fun excluirAluno(umAluno: Aluno) {}



}