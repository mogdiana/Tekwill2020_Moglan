import model.Persoana;
import service.PersoanaService;

public class Test {
    public static void main(String[] args) {
        PersoanaService service = new PersoanaService();
        Persoana persoana1 = new Persoana("Ion", "Bostan");
        Persoana persoana2 = new Persoana("ZZ", "AA");
        service.create(persoana1);
        service.create(persoana2);
        service.printeazaToatePersoanele();

        service.delete(4);
        service.update(2);
        service.printeazaToatePersoanele();
    }
}
