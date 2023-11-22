public class Hanoi {
    static void Hanoi(int n, char src, char aux, char dest){
        if(n==1){
            System.out.println(src+" --> "+dest);
            return;
        }
        else{
            Hanoi(n-1, src, dest, aux);
            Hanoi(1, src, aux, dest);
            Hanoi(n-1, aux, src, dest);
        }
    }
    public static void main(String[] args) {
        Hanoi(3,'A','B','C');
    }
}
