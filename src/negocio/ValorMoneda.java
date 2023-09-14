package negocio;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Yeison
 */
public class ValorMoneda {
    private final Map<String, Double> VALORES_DIVISAS = Map.ofEntries(
        //valor Peso
        Map.entry("COPUSD", 0.00025D),
        Map.entry("COPEUR", 0.00023D),
        Map.entry("COPGBP", 0.00020D),
        Map.entry("COPJPY", 0.037D),
        Map.entry("COPKRW", 0.33D),
        //valor Dolar
        Map.entry("USDCOP", 3988.36D),
        Map.entry("USDEUR", 0.93D),
        Map.entry("USDGBP", 0.80D),
        Map.entry("USDJPY", 146.36D),
        Map.entry("USDKRW", 1327.11D),
        //Valor Euro
        Map.entry("EURCOP", 4287.34D),
        Map.entry("EURUSD", 1.08D),
        Map.entry("EURGBP", 0.86D),
        Map.entry("EURJPY", 157.45D),
        Map.entry("EURKRW", 1427.37D),
        //Valor Libra esterlina
        Map.entry("GBPCOP", 4985.56D),
        Map.entry("GBPUSD", 1.25D),
        Map.entry("GBPEUR", 1.16D),
        Map.entry("GBPJPY", 183.47D),
        Map.entry("GBPKRW", 1661.91D),
        //Valor Yen japones
        Map.entry("JPYCOP", 27.22D),
        Map.entry("JPYUSD", 0.0068D),
        Map.entry("JPYEUR", 0.0063D),
        Map.entry("JPYGBP", 0.0055D),
        Map.entry("JPYKRW", 9.06D),
        //Valor Won surcoreano
        Map.entry("KRWCOP", 3.00D),
        Map.entry("KRWUSD", 0.00075D),
        Map.entry("KRWEUR", 0.00070D),
        Map.entry("KRWGBP", 0.0000060D),
        Map.entry("KRWJPY", 0.11D)
    );
    
    public double getNuevoValor(String divisa, String valorConvertir){
        try{
            double valor = Double.parseDouble(valorConvertir);
            return this.VALORES_DIVISAS.getOrDefault(divisa,0.0) * valor;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "No puede ingresar cadenas de textos / caracteres especiales. \n" + e.getMessage());
        }
        return 0;
    }
}
