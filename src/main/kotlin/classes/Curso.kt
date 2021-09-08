package classes

class Curso(
    val nome: String,
    val codCurso: Int,
    var professorTitular: Professor? = null,
    var professorAdjunto: Professor? = null,
    private val qtdMaxAlunos: Int,
    private val listaDeAlunos: MutableList<Aluno> = mutableListOf()
    ) {

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codCurso == this.codCurso)
    }

    fun adicionarUmAluno(umAluno: Aluno) : Boolean{
        return if(listaDeAlunos.size < qtdMaxAlunos){

            try {
                listaDeAlunos.add(umAluno)
                true
            }catch (e: Exception){
                println("Erro ao cadastrar novo aluno!!")
                false
            }

        }else{
            false
        }
    }

    fun excluirAluno(umAluno: Aluno) {

        try {
        listaDeAlunos.remove(umAluno)
        }catch (e: Exception){
            println("falha ao excluir aluno!!!")
        }
    }

}