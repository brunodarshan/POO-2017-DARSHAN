package capitulo3;

public class ImprimeSoma {
    public static void main(String[] args){
        int soma = 0;
        for (int i = 1; i <= 1000; ++i) {
            soma += i;
        }
        System.out.println("Soma de 1 a 1000 é "+soma);
    }
}
