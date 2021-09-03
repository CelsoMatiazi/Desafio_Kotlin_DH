package classes

class DigitalHouseManager(
    val professores: MutableList<Professor>,
    val alunos: MutableList<Aluno>,
    val cursos: MutableList<Curso>,
    val matriculas: MutableList<Matricula>
) {

    fun registrarCurso(nome: String, codCurso: Int, qtdMaxAlunos: Int){
        cursos.add(Curso(
            nome = nome,
            codCurso = codCurso,
            qtdMaxAlunos = qtdMaxAlunos)
        )
    }

    fun excluirCurso(codCurso: Int){
       for(curso in cursos){
           if(curso.codCurso == codCurso){
               cursos.remove(curso)
           }
       }
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codProfessor: Int,
        qtdDeHoras: Int){

        professores.add(ProfessorAdjunto(
            nome = nome,
            sobrenome = sobrenome,
            codProfessor = codProfessor,
            horasDeMentoria = qtdDeHoras
        ))
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codProfessor: Int,
        especialidade: String,
        tempoDeCasa: Int){

        professores.add(ProfessorTitular(
            nome = nome,
            sobrenome = sobrenome,
            codProfessor = codProfessor,
            especialidade =  especialidade,
            tempoDeCasa = tempoDeCasa
        ))

    }


    fun excluirProfessor(codProfessor: Int){
        for(professor in professores){
            if(professor.codProfessor == codProfessor){
                professores.remove(professor)
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codAluno: Int){
        alunos.add(Aluno(nome, sobrenome, codAluno))
    }

    fun matricularAluno(codAluno: Int, codCurso: Int){

        for(curso in cursos){
            if(curso.codCurso == codCurso){
                for(aluno in alunos){
                    if(aluno.codAluno == codAluno){
                        if(curso.adicionarUmAluno(aluno)){
                            matriculas.add(Matricula(aluno, curso,))
                            println("O Aluno ${aluno.nome} ${aluno.sobrenome} foi matriculado com SUCESSO no curso de ${curso.nome}!!")
                        }else{
                            println("A matricula do aluno ${aluno.nome} ${aluno.sobrenome} não foi realizada, NÃO HÁ VAGAS!!")
                        }
                    }
                }
            }
        }
    }

    fun alocarProfessor(
        codCurso: Int,
        codProfessorTitular: Int,
        codProfessorAdjunto: Int){

        for(professorTitular in professores){
            if(professorTitular.codProfessor == codProfessorTitular){
                for(professorAdjunto in professores){
                    if(professorAdjunto.codProfessor == codProfessorAdjunto){
                        for(curso in cursos){
                            if(curso.codCurso == codCurso){
                                curso.professorTitular = professorTitular
                                curso.professorAdjunto = professorAdjunto
                            }
                        }
                    }
                }
            }
        }

    }


    fun consultarCurso(codAluno: Int){

        for (matricula in matriculas){
            if(matricula.aluno.codAluno == codAluno){
                println("O aluno ${matricula.aluno.nome} ${matricula.aluno.sobrenome} esta matriculado no curso de ${matricula.curso.nome} ")
            }
        }
    }

}