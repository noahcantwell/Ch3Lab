
public class Stars
{
    public static void main(String[]args) {
        firstPattern();
        secondPattern();
        thirdPattern();
        fourthPattern();
    }
    
    public static void firstPattern() {
        for(int i=10; i>=1; i--){            
            printPart('*',i);
            System.out.println();
        }
    }
    
    public static void secondPattern(){
        for(int i=10; i>=1; i--){
            printPart(' ',i);
            printPart('*',10-i);
            System.out.println();
        }
    }
    
    public static void thirdPattern(){
        for(int i=10; i>=1; i--){
            printPart(' ',10-i);
            printPart('*',i);
            System.out.println();
        }
    }
    
    public static void fourthPattern() {
        for(int i=9; i>=1; i=i-2){
            printPart(' ',i/2);
            printPart('*',10-i);
            printPart(' ',i/2);
            System.out.println();
        }
        
        for(int i=1; i<=9; i=i+2){
            printPart(' ',i/2);
            printPart('*',10-i);
            printPart(' ',i/2);
            System.out.println();
        }
    }
    
    public static void printPart(char letter, int repeat){
        for (int i=repeat; i>0; i--){
            System.out.print(letter);
        }
    }
    
}