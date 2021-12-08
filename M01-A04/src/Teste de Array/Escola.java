class Escola {
    Aluno[] variosAlunos;
    
    void imprimirArray(Aluno[] array){
        for (int i = 0; i < array.length; i++) {
            array[i].mostraAluno();
        }  
    }
}
