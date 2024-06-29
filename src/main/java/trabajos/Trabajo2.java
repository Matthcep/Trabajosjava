package trabajos;

public class Trabajo2 {
    Trabajo2(String color, String llantas,String tipoDeTraccion ,String TipoDeCombustible, int placa, String marca,String TipodeCambios){
        this.color =color;
        this.llantas =llantas;
        this.tipoDeTraccion = tipoDeTraccion;
        this.TipoDeCombustible = TipoDeCombustible;
        this.placa = placa;
        this.marca = marca;
        this.TipodeCambios = TipodeCambios;

    }
    private String puertas;
    private String color;
    private String llantas;
    private String tipoDeTraccion;
    private String TipoDeCombustible;
    private int placa;
    private String clase;
    private String marca;
    private String TipodeCambios;

    public String getpuertas() {
        return puertas;
    }

    public void setpuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getTipoDeTraccion() {
        return tipoDeTraccion;
    }

    public void setTipoDeTraccion(String tipoDeTraccion) {
        this.tipoDeTraccion = tipoDeTraccion;
    }

    public String getTipoDeCombustible() {
        return TipoDeCombustible;
    }

    public void setTipoDeCombustible(String TipodeCombustible) {
        this.TipoDeCombustible = TipodeCombustible;

    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public String getTipodeCambios() {
        return TipodeCambios;
    }

    public void setTipodeCambios(String tipodeCambios) {
        this.TipodeCambios = tipodeCambios;
    }
}

