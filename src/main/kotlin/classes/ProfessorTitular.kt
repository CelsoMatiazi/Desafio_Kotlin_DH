package classes

class ProfessorTitular(
    nome : String,
    sobrenome: String,
    tempoDeCasa: Int,
    codProfessor: Int,
    val especialidade: String,
    ) : Professor(nome, sobrenome, tempoDeCasa, codProfessor)