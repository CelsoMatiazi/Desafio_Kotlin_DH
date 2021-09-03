import classes.*

fun main() {

    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professor>()
    val cursos = mutableListOf<Curso>()
    val matriculas = mutableListOf<Matricula>()

    val digitalHouseManager = DigitalHouseManager(professores, alunos, cursos, matriculas)

    digitalHouseManager.registrarProfessorTitular(
        "Romario",
        "Rodrigues",
        1023,
        "Android",
        1
    )

    digitalHouseManager.registrarProfessorTitular(
        "Sergio",
        "Moura",
        1283,
        "FullStack",
        5
    )


    digitalHouseManager.registrarProfessorAdjunto(
        "Jonatas",
        "Abreu",
        574,
        15
    )


    digitalHouseManager.registrarProfessorAdjunto(
        "Nathalia",
        "Lira",
        476,
        15
    )

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)


    digitalHouseManager.alocarProfessor(20001,1283, 476)
    digitalHouseManager.alocarProfessor(20002,1023, 574)


    digitalHouseManager.matricularAluno("Celso", "Ricardi", 111)
    digitalHouseManager.matricularAluno("Zeca", "Pagodinho", 222)
    digitalHouseManager.matricularAluno("Paco", "De Lucia", 333)
    digitalHouseManager.matricularAluno("Genival", "Lacerda", 444)
    digitalHouseManager.matricularAluno("Flavio", "Java", 555)


    digitalHouseManager.matricularAluno(333,20001)
    digitalHouseManager.matricularAluno(444,20001)

    digitalHouseManager.matricularAluno(111,20002)
    digitalHouseManager.matricularAluno(555,20002)
    digitalHouseManager.matricularAluno(222,20002)

    digitalHouseManager.consultarCurso(333)

}


