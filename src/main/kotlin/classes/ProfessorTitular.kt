package classes

class ProfessorTitular(
    val especialidade: String,
    nome : String,
    sobrenome: String,
    tempoDeCasa: Int,
    codProfessor: Int
    ) : Professor(nome, sobrenome, tempoDeCasa, codProfessor)