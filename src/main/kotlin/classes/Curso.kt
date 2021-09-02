package classes

class Curso(val nome: String, val codCurso: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codCurso == this.codCurso)
    }

}