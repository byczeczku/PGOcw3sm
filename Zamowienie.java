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
            for (int i = 0; i < Produkty.length; i++)
            {
                suma += Produkty[i].getCena() * ilosci[i];
            }
            return suma;
        }
//koniecMetody1

//metoda2
    public void zastosujZnizke()
    {
        if (klient.isCzyStaly())
        {
            double sumaPoZnizce = 0;
            for (int i = 0; i < Produkty.length; i++)
            {
                double cenaPoZnizce = Produkty[i].getCena() * 0.9;
                sumaPoZnizce += cenaPoZnizce * ilosci[i];
            }
            System.out.println("Zniżka 10% została zastosowana. Nowa wartość zamówienia: " + sumaPoZnizce + " PLN");
        } else {
            System.out.println("Brak zniżki – klient nie jest stałym klientem.");
        }
    }
//koniecMetody2

// metoda3
    public void wyswietlSzczegoly()
    {
        System.out.println("Zamówienie ID: " + id);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        System.out.println("Data zamówienia: " + dataZamowienia);
        System.out.println("Status: " + status);
        System.out.println("Produkty:");
        for (int i = 0; i < Produkty.length; i++) {
            System.out.println("- " + Produkty[i].getNazwa() + " (x" + ilosci[i] + ") - " + Produkty[i].getCena() + " PLN");
        }
        System.out.println("Łączna wartość zamówienia: " + obliczWartoscZamowienia() + " PLN");
    }
//koniecMetody3

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
