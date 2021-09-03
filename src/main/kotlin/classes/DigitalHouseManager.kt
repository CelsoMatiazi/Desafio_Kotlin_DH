package classes

import java.lang.Exception

class DigitalHouseManager(
    val professores: MutableList<Professor>,
    val alunos: MutableList<Aluno>,
    val cursos: MutableList<Curso>,
    val matriculas: MutableList<Matricula>
) {

    fun registrarCurso(nome: String, codCurso: Int, qtdMaxAlunos: Int){

        val curso = Curso(
            nome = nome,
            codCurso = codCurso,
            qtdMaxAlunos = qtdMaxAlunos
        )

        if(cursos.contains(curso)){
            println("Curso ja cadastrado!")
        }else{
            cursos.add(curso)
        }
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

        val professor = ProfessorAdjunto(nome = nome,
            sobrenome = sobrenome,
            codProfessor = codProfessor,
            horasDeMentoria = qtdDeHoras
        )
        if(professores.contains(professor)){
            println("Professor ja cadastrado")
        }else {
            professores.add(professor)
        }

    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codProfessor: Int,
        especialidade: String,
        tempoDeCasa: Int){

        val professor = ProfessorTitular(
            nome,
            sobrenome,
            tempoDeCasa,
            codProfessor,
            especialidade
        )

        if(professores.contains(professor)){
            println("Professor ja cadastrado")
        }else {
            professores.add(professor)
        }

    }


    fun excluirProfessor(codProfessor: Int){

        var professorExiste = false

        for(i in 0 until professores.size){
            if(professores[i].codProfessor == codProfessor){
                try {
                    professorExiste = true;
                    professores.removeAt(i)
                }catch (e: Exception){
                    println("Erro ao excluir")
                }
            }
        }

        if(!professorExiste){
            println("Professor não encontrado!!")
        }

//        for(professor in professores){
//            if(professor.codProfessor == codProfessor){
//                println("remove ${professor.nome}")
//                try {
//                professores.remove(professor)
//                }catch (e: Exception){
//                    println(e)
//                }
//            }
//        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codAluno: Int){
        val aluno = Aluno(nome, sobrenome, codAluno)

        if(alunos.contains(aluno)){
            println("Aluno ja matriculado")
        }else{
            alunos.add(aluno)
        }
    }

    fun matricularAluno(codAluno: Int, codCurso: Int){

        var cursoExistente = false
        var alunoExistente = false

        for(curso in cursos){
            if(curso.codCurso == codCurso){
                cursoExistente = true
                for(aluno in alunos){
                    if(aluno.codAluno == codAluno){
                        alunoExistente = true
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

        if(!alunoExistente && cursoExistente){
            println("Codigo do aluno invalido")
        }
        if(!cursoExistente){
            println("Codigo do curso invalido")
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

        var alunoExistente = false

        for (matricula in matriculas){
            if(matricula.aluno.codAluno == codAluno){
                alunoExistente = true
                println("O aluno ${matricula.aluno.nome} ${matricula.aluno.sobrenome} esta matriculado no curso de ${matricula.curso.nome} ")
            }
        }

        if(!alunoExistente){
            println("Codigo do aluno invalido!!")
        }
    }

}