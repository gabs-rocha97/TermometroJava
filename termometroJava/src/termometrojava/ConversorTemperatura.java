package termometrojava;

public class ConversorTemperatura {
    private double valorEntrada;
    private double tempConvertida;
    private String unidadeEntrada;
    private String unidadeSaida;

   
    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getTempConvertida() {
        return tempConvertida;
    }

    public void setTempConvertida(double tempConvertida) {
        this.tempConvertida = tempConvertida;
    }

    public String getUnidadeEntrada() {
        return unidadeEntrada;
    }

    public void setUnidadeEntrada(String unidadeEntrada) {
        this.unidadeEntrada = unidadeEntrada;
    }

    public String getUnidadeSaida() {
        return unidadeSaida;
    }

    public void setUnidadeSaida(String unidadeSaida) {
        this.unidadeSaida = unidadeSaida;
    }
    
    public void celciusParaFireheight(double valorEntrada){
        setTempConvertida((valorEntrada - 32)*(5/9));
    }
    
    public void celciusParaKelvin(double valorEntrada){
        setTempConvertida(valorEntrada - 273.15);
    }
    
    public void FireheightParaCelcius(double valorEntrada){
        setTempConvertida((valorEntrada * (9/5))+32);
    }
    
    public void FireheightParaKelvin(double valorEntrada){
        setTempConvertida(((valorEntrada - 273.15)*(9/5))+32);
    }
    
    public void kelvinParaFireheight(double valorEntrada){
        setTempConvertida(((valorEntrada - 32)*(5/9))+273.15);
    }
    
    public void kelvinParaCelcius(double valorEntrada){
        setTempConvertida(valorEntrada + 273.15);
    }
    
    public void mostraConversao(String unidadeSaida){
        switch (unidadeSaida) {
            case "c":
                System.out.println("O valor convertido para celcius é de: "+getTempConvertida());
                break;
            case "f":
                System.out.println("O valor convertido para Fireheight é de: "+getTempConvertida());
                break;
            case "k":
                System.out.println("O valor convertido para kelvin é de: "+getTempConvertida()); 
                break;
        }
    }
    
    public void escolheFuncao(String unidadeEntrada, String unidadeSaida, double valorEntrada){
        switch (unidadeSaida) {
            case "c":
                switch (unidadeEntrada) {
                    case "k":
                        celciusParaKelvin(valorEntrada);
                        break;
                    case "f":
                        celciusParaFireheight(valorEntrada);
                        break;
                    default:
                        System.out.println("Escolha uma unidade de entrada válida");
                        break;
                }   break;
            case "f":
                switch (unidadeEntrada) {
                    case "c":
                        FireheightParaCelcius(valorEntrada);
                        break;
                    case "k":
                        FireheightParaKelvin(valorEntrada);
                        break;
                    default:
                        System.out.println("Escolha uma unidade de entrada válida");
                        break;
                }   break;
            case "k":
                switch (unidadeEntrada) {
                    case "c":
                        kelvinParaCelcius(valorEntrada);
                        break;
                    case "f":
                        kelvinParaFireheight(valorEntrada);
                        break;
                    default:
                        System.out.println("Escolha uma unidade de entrada válida");
                        break;
                }   break;
            default:
                System.out.println("Escolha uma unidade de saida válida");
                break;
        }
    }
}