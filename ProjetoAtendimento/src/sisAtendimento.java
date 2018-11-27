
import java.util.Scanner;

public class sisAtendimento {
    
    public static void main(String[] args) {
        
    	AtendimentoRestaurante sisAtendimento = new AtendimentoRestaurante();
        Scanner inputOp = new Scanner(System.in);
       
        int op;
        
        
        do{
        	 System.out.printf("\t\t%s ","Bem vindo ao atendimento de Restaurante Bom Prato\n");
             System.out.println("[1]-Criar atendimento");
             System.out.println("[2]-Listar atendimento");
             System.out.println("[3]-Alterar dados de atendimento");
             System.out.println("[4]-Remover atendimento");
            op = inputOp.nextInt();
            
 
                    Scanner leOp = new Scanner(System.in);
					
                    
                    switch(op){
                        case 1:
                        	sisAtendimento.novoAtdPresencial();
                        break;
                        
                        case 2:
                        	sisAtendimento.listAtendimento();
                        break;
                        
                        case 3:
                        	sisAtendimento.alterAtendimento();
                        break;
                        
                        case 4:
                        	sisAtendimento.removerAtendimento();
                        break;
                        
                    
             
                
                default:
                    System.out.print("OPÇÃO INVALIDA!!");
                break;
            }
            
        }while(op !=0);
        
        
    }
    
}