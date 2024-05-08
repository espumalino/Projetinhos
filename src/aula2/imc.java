package aula2;

public class imc {

    public static void main(String[] args) {

        int weight = 73;
        double height = 1.74;

        double imc;

        imc = weight / Math.pow(height, 2);

        System.out.println(imc);
    }

}
