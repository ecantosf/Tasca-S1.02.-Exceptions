package sale.sp1ta2le1;

public class EmptySaleException extends Exception {

    public EmptySaleException() {
        super("Per fer una venda primer has d'afegir productes.");
    }

    // Constructor opcional amb missatge personalitzat
    public EmptySaleException(String message) {
        super(message);
    }

    // Constructor opcional amb missatge i causa
    public EmptySaleException(String message, Throwable cause) {
        super(message, cause);
    }
}

/*
Explicació:

Herència: La classe extén Exception, que la converteix en una excepció comprovada
(checked exception).
Constructor per defecte: El constructor sense paràmetres ja inclou el missatge demanat:
"Per fer una venda primer has d'afegir productes."
Constructors addicionals: He inclòs constructors opcionals per si necessites:
Un constructor que accepta un missatge personalitzat
Un constructor que accepta missatge i causa (útil per encadenar excepcions)
 */