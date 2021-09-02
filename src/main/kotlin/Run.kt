import classes.*

fun main() {

    val aluno1 = Aluno("jose", "alencar", 123)
    val aluno2 = Aluno("jose", "alencar", 123)

    println(aluno1 == aluno2)

    val prof3 = ProfessorTitular("Romoaldo", "Jose", 2, 124,"matermatica")
    val prof4 = ProfessorAdjunto("Romildo", "Mustafá", 2, 127,10)

    val curso1 = Curso("FullStack", 123, prof3, prof4, 15, listOf(aluno1,aluno2))
    //val curso2 = Curso("FullStack2", 123)

    //println(curso1 == curso2)


    val prof1 = ProfessorTitular(
        "Almeida",
        "alencar",
        2,
        123,
        "Android")

    val prof2 = ProfessorTitular(
        "AndAlmeidaroid",
        "alencar",
        2,
        123,
        "Android")

    println(prof1 == prof2)
}
