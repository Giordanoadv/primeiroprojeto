//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // variável sempre inicia com letra minúcula, já classe maiúscula
    public static void main(String[] args) {

        System.out.printf("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLançamento = 2022;
        System.out.println("ano de lançamento: "+ anoDeLançamento);
        boolean incluídoNoPlano = false;
        double notaDofilme = 8.1;
        // Média calculada pela jaque, paulo e gio 
        double media = (9.8 + 6.3 + 8.0) / 3; // para priorizar a soma colocou o parenteses
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de galã dos anos 80
                Muito Bom
                nostalgia
                Ano de Lançamento               
                """ + anoDeLançamento;

        System.out.println(sinopse);

        int classificação;
        classificação = (int) (media /2);
        System.out.println(classificação); // casting
    }
}

