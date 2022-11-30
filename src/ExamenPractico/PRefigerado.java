package ExamenPractico;

public class PRefigerado extends Producto{
    private String codigoSupervisionAlimentaria;

    public PRefigerado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        codigoSupervisionAlimentaria = "Desconocido";
    }

    public void setCodigoSupervisionAlimentaria(String codigo){
        codigoSupervisionAlimentaria = codigo;
    }

    public String getCodigoSupervisionAlimentaria(){
        return codigoSupervisionAlimentaria;
    }

    public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Codigo de Supervision Alimentaria: " + getCodigoSupervisionAlimentaria());
    }
}
