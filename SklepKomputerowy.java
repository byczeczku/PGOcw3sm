public class SklepKomputerowy
{
    private Produkt[] produkty= new Produkt[100];
    private Klient[] klienci= new Klient[50];
    private Zamowienie[] zamowienia= new Zamowienie[200];
    private int liczbaProduktow= 0, liczbaKlientow= 0, liczbaZamowien= 0;

    public void dodajProdukt(Produkt produkt)
    {
        produkty[liczbaProduktow++] = produkt;
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        for (int i = 0; i < liczbaProduktow; i++)
            if (produkty[i].getKategoria().equalsIgnoreCase(kategoria))
                produkty[i].wyswietlInformacje();
    }

    public void dodajKlienta(Klient klient) {
        klienci[liczbaKlientow++] = klient;
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie zamowienie = new Zamowienie( liczbaZamowien + 1, klient, produkty, ilosci);
        zamowienia[liczbaZamowien++] = zamowienie;
        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.getProdukty().length; i++)
            zamowienie.getProdukty()[i].setIloscWMagazynie(
                    zamowienie.getProdukty()[i].getIloscWMagazynie() - zamowienie.getIlosci()[i]);
    }

    public void zmienStatusZamowienia( int id, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++)
            if (zamowienia[i].getId() == id)
                zamowienia[i].setStatus(nowyStatus);
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (int i = 0; i < liczbaZamowien; i++)
            if (zamowienia[i].getKlient().getId() == idKlienta)
                zamowienia[i].wyswietlSzczegoly();
    }
}