package classes

class ProfessorAdjunto(
    nome : String,
    sobrenome: String,
    tempoDeCasa: Int = 0,
    codProfessor: Int,
    val horasDeMentoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codProfessor)
