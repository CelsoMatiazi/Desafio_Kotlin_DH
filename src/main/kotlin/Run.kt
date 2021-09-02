import classes.Aluno
import classes.Curso

fun main() {

    val aluno1 = Aluno("jose", "alencar", 123)
    val aluno2 = Aluno("jose", "alencar", 123)

    println(aluno1 == aluno2)

    val curso1 = Curso("FullStack", 123)
    val curso2 = Curso("FullStack2", 123)

    println(curso1 == curso2)
}
