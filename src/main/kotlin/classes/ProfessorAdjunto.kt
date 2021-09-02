package classes

class ProfessorAdjunto(
    nome : String,
    sobrenome: String,
    tempoDeCasa: Int,
    codProfessor: Int,
    val horasDeMentoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codProfessor)
