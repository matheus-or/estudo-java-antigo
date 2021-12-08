class TesteDeArray {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Matheus Oliveira Rodrigues";
        aluno1.idade = 15;
        
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana Carolina";
        aluno2.idade = 15;
        
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro";
        aluno3.idade = 20;
       
        Escola escola = new Escola();
        Aluno[] variosAlunos = new Aluno[3];
        variosAlunos[0] = aluno1;
        variosAlunos[1] = aluno2;
        variosAlunos[2] = aluno3;
        
        escola.imprimirArray(variosAlunos);
    }
}