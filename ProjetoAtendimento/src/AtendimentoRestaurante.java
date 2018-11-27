
import java.util.ArrayList;
import java.util.Scanner;

public class AtendimentoRestaurante {
    ArrayList<Atendimento> vetAtendimento = new ArrayList<Atendimento>();
    
  
     
    public void novoAtdPresencial(){
       
    	AtendimentoPresencial objAtdPresecinal = new AtendimentoPresencial();
                    
        Scanner inputCliente = new Scanner(System.in);
        Scanner inputPedido = new Scanner(System.in);
        Scanner inputMesa = new Scanner(System.in);
        
        
        objAtdPresecinal.setNumero(1);
        
        System.out.print("Informe o nome do cliente: ");
        objAtdPresecinal.setCliente(inputCliente.nextLine()); 
        
        System.out.print("Informe o pedido desejado: ");
        objAtdPresecinal.setPedido(inputPedido.nextLine()); 
        
        System.out.print("Informe sua mesa: ");
        objAtdPresecinal.setMesa(inputMesa.next()); 
        
        vetAtendimento.add(objAtdPresecinal);
    }
    
    public void listAtendimento(){
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<vetAtendimento.size(); i++){
            Atendimento buscarAtendimento = vetAtendimento.get(i);
            if(buscarAtendimento.getNumero()==1){
                System.out.println((i+1)+"-"+ vetAtendimento.get(i));
            }
        }
        System.out.print("Pressione ENTER para continuar...");
        
		input .nextLine();
    }
    
    public void alterAtendimento(){
    	Scanner inputCliente = new Scanner(System.in);
        Scanner inputPedido = new Scanner(System.in);
        Scanner inputMesa = new Scanner(System.in);
        
        
        listAtendimento();
        
        System.out.print("Digite o número do atendimento que deseja alterar:  ");
        Scanner inputOp = new Scanner(System.in);
		int numero = inputOp .nextInt();
        numero--;
        
    
        Atendimento alterAtendimento = vetAtendimento.get(numero);
    
        System.out.print(alterAtendimento.getCliente()+ ", modificar para: ");
        alterAtendimento.setCliente(inputCliente.nextLine());
    
        System.out.print(alterAtendimento.getPedido()+ ", modificar para: ");
        alterAtendimento.setPedido(inputPedido.nextLine());
        
       /* System.out.print(alterAtendimento.getMesa()+ ", modificar para: ");
        alterAtendimento.setMesa(inputMesa.next());*/
        
        
    
        System.out.printf("\n Atendimento: %d  Alterado com sucesso!",++numero); 
    }
        

    public void removerAtendimento(){
        Scanner input = new Scanner(System.in);
        listAtendimento();
        
        System.out.println("Informe o numero que deseja remover: ");
        vetAtendimento.remove(input.nextInt()-1);
                
        System.out.println("\nAtendimento removido do sistema!");
    }


    
}
