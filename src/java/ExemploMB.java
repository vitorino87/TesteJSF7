
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author tiago.lucas
 */
@RequestScoped
@ManagedBean
public class ExemploMB {
    private String texto;
    private int numero;
    public ExemploMB(){
        
    }
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void processar(){
        this.texto = this.texto.toUpperCase();
        this.numero = this.numero * this.numero;
    }
}
