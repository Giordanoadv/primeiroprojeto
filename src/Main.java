//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ConversorTemperatura {
    public static void main(String[] args) {


        // Temperatura em Celsius
        double temperaturaCelsius = 30.0;

        // Conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exibindo o valor com casas decimais
        System.out.println("Temperatura em Fahrenheit (com casas decimais): " + temperaturaFahrenheit);

        // Casting para inteiro (sem casas decimais)
        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;

        // Exibindo o valor sem casas decimais
        System.out.println("Temperatura em Fahrenheit (sem casas decimais): " + temperaturaFahrenheitInteira);

// conversor de temperatura
    }
}

