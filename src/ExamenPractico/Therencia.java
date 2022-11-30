package ExamenPractico;

public class Therencia {
    public static void main(String[]args){
        ProductoCongelado ramyon = new ProductoCongelado("25-08-2022","L1608004");
        ProductoFresh durazno = new ProductoFresh("28-10-2022","L1910067");
        PRefigerado refresco = new PRefigerado("12-10-2022","L1567006");
        ramyon.setTemperaturaRecomendada(-18);
        durazno.setFechaEnvasado("03-10-2021");
        durazno.setPaisDeOrigen("Corea");
        refresco.setCodigoSupervisionAlimentaria("B#8897");
        System.out.println("Producto Congelado: ");
        ramyon.imprimirDatos();
        System.out.println("Producto Fresco: ");
        durazno.imprimirDatos();
        System.out.println("Producto Refrigerado: ");
        refresco.imprimirDatos();
    }
}
