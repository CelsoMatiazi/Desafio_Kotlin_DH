package classes

class Aluno(val nome: String, val sobrenome: String, val codAluno: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Aluno && other.codAluno == this.codAluno)
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + sobrenome.hashCode()
        result = 31 * result + codAluno
        return result
    }
}