package Switch.com;

import java.util.Scanner;

public class SwitchCas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//           switch (fruit){
//               case "mango " :
//                   System.out.println("King of all fruits");
//                   break ;
//               case "apple" :
//                   System.out.println("A sweet red fruit ");
//                   break;
//               case "orange" :
//                   System.out.println("Round fruit");
//                   break;
//               case "grapes":
//                   System.out.println("Small fruits ");
//                   break;
//               default :
//                   System.out.println("Enter a valid number ");
//        }


// CAN ALSO WRITE IN THIS FORMAT
        switch (fruit) {
            case "mango " -> System.out.println("King of all fruits");
            case "apple" -> System.out.println("A sweet red fruit ");
            case "orange" -> System.out.println("Round fruit");
            case "grapes" -> System.out.println("Small fruits ");
            default -> System.out.println("Enter a valid number ");
        }
    }
}