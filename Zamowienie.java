public class Zamowienie
{
    private String id;
    private Klient klient;
    private Produkt[] Produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

//metoda1
    public double obliczWartoscZamowienia()
        {
            double suma = 0;
            for (int i = 0; i < Produkty.length; i++){
                suma += Produkty[i].getCena() * ilosci[i];
            }
            return suma;
        }
//koniecMetody1

//metoda2
    public double zastosujZnizke()
    {
        if (klient.isCzyStaly()){

        }

    }
//koniecMetody2

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
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
