public class ExemploforArry {
    public static void main(String[] args) {
        String alunos[]={"Felipe","Jonas","Julia","Marcos","Everton","Bruna"};

       //for tradicional 
        for (int x=0; x<alunos.length;x++){
            System.out.println("o aluno do indice x = "+ x +" é "+ alunos[x]);
        }
        
        //for each
        for(String aluno :alunos){
               System.out.println("Nome do aluno é " + aluno);
         
        }
    }
}
