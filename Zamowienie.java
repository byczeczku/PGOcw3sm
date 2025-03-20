public class Zamowienie
{
    private String id;
    private String klient;
    private Produkt[] Produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getKlient() {
        return klient;
    }
    public void setKlient(String klient) {
        this.klient = klient;
    }
    public Produkt[] getProdukty() {
        return Produkty;
    }
    public void setProdukty(Produkt[] produkty) {
        Produkty = produkty;
    }
    public int[] getIlosci() {
        return ilosci;
    }
    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }
    public String getDataZamowienia() {
        return dataZamowienia;
    }
    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
