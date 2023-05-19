public class Pilloni{
	public static void main(String[] args){
		Gui gui= new Gui();
	}
}// Va bene, ma il tasto "rimuovi" non funziona perchè invece di rimuoverli fisicamente dall'elenco, il codice imposta semplicemente il valore dell'elemento corrispondente a null. 
//E questo può essere un problema se si cerca di visualizzare l'Array dopo aver rimosso un numero, infatti non te lo fà visualizzare!
