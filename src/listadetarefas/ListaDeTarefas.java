package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        //declarando e instanciando a lista de tarefas
        ArrayList<String> lista = new ArrayList();
        int opcao;

        do{
            System.out.println("==== Lista de tarefas - Menu =====");
            System.out.println("Escolha a opção desejada");
            System.out.println("[ 1 ] - Adicionar nova tarefa");
            System.out.println("[ 2 ] - Excluir uma tarefa");
            System.out.println("[ 3 ] - Listar tarefas");
            System.out.printf("Opção: ");
            
            opcao = scan.nextInt();
            
            switch(opcao) {
                case 1: 
                    incluir(lista);
                    break;
                case 2:
                    excluir(lista);
                    break;
                case 3:
                    listar(lista);
                    break;
                default:
                    System.out.println("Opção invalida!");
            } 
        }while(opcao != 0);
    }
    
    // Incluir nova tarefa
    public static void incluir(ArrayList<String> lista){
        Scanner incluir = new Scanner(System.in);
        String tarefa;
        
        System.out.println("Informe a sua nova tarefa: ");
        tarefa = incluir.nextLine();
        lista.add(tarefa);
    }
    
    //Excluir tarefa
    public static void excluir(ArrayList<String> lista){
        Scanner del = new Scanner(System.in);
        int i;
        
        System.out.println(" ");
        System.out.printf("Escolha abaixo a tarefa a ser excluida:");
        
        listar(lista);
        System.out.printf("Numero da tarefa: ");
        i = del.nextInt();
        
        try{
            lista.remove(i);
        }catch(IndexOutOfBoundsException e){
            System.out.printf("ERRO: Tarefa invalida: (%s)\n", e.getMessage());
        }
        
    }
    
    //Listar tarefas
    public static void listar(ArrayList<String> lista){
        System.out.println("");
        System.out.println("====== Minhas tarefas ======");
        int i = 0;
        if(lista.size() == 0){
            System.out.println("Nenhuma tarefa até o momento");
        }else{
            for(String mostra : lista){
            System.out.printf("Tarefa ( %d ) - %s\n",i , mostra);
            i++;
            }
        }
        System.out.println("============================");
        System.out.println(" ");
        
    }
    
}
