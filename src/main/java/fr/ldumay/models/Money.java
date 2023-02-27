package fr.ldumay.models;

/**
 * Classe : Money
 * <br/>Description : Classe représentant un montant
 * <ul>
 *     <li>amount : int - Dois être positif</li>
 *     <li>currency : String - Doit être chaîne de caractères de 3 caractères (norme ISO)</li>
 *     <li>
 *         <ul>
 *             <li>EUR - euro</li>
 *             <li>USD - dollar</li>
 *             <li>CHF - franc suisse</li>
 *             <li>GBP - livre sterling</li>
 *         </ul>
 *     </li>
 *     <li>add(Money m) : Money - Addition de deux money (même devise)</li>
 * </ul>
 *
 * @author ldumay
 */
public class Money {

	private int fAmount;
	private String fCurrency;

	/**
	 * @param amount
	 * @param currency
	 */
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}

	/**
	 * @return
	 */
	public int amount() {
		return fAmount;
	}

	/**
	 * @return
	 */
	public String currency() {
		return fCurrency;
	}

	/**
	 * @param m
	 * @return
	 */
	public Money add(Money m) {
		if (currency().equals(m.currency())) {
			this.fAmount += m.amount();
		}
		return this;
	}

	/**
	 * namout négatif possibl
	 *
	 * @param nAmount
	 * @param nCurrency
	 * @return
	 */
	public Money add(int nAmount, String nCurrency) {
		if (currency().equals(nCurrency)) {
			this.fAmount += nAmount;
		}
		return this;

	}

}
