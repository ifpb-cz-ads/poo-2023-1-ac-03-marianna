public class BeMQuestao3 {
    public static void main(String[] args){
        float item1 = 2.95f;
        float item2 = 3.50f;
        System.out.println("O item 1 custa: " +item1 + " e o item 2 custa: " +item2);
        
        float custoTotal = item1 + item2;
        System.out.println("O custo total e: " +custoTotal);

        final float taxa = 0.0825f;
        float taxaCalculada = custoTotal * taxa;
        System.out.println("A taxa de 8.25% e: " + taxaCalculada);
    
        float novoCusto = (item1 + taxaCalculada) + (item2 + taxaCalculada);
        System.out.println("O novo custo e: " +novoCusto);

        boolean muitoCaro = (novoCusto > 10);
        System.out.println("O valor e caro?: " +muitoCaro);


    }
}
