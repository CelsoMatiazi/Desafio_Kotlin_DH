package classes

class ProfessorTitular(
    nome : String,
    sobrenome: String,
    tempoDeCasa: Int = 0,
    codProfessor: Int,
    val especialidade: String,
    ) : Professor(nome, sobrenome, tempoDeCasa, codProfessor)