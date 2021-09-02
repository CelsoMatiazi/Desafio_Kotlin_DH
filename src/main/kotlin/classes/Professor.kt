package classes

abstract class Professor(
    val nome: String,
    val sobrenome: String,
    val tempoDeCasa: Int,
    val codProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Professor && other.codProfessor == this.codProfessor)
    }
}