package fr.ldumay.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe : MoneyBag
 * <br/>Description : Classe des sacs de monnaies
 * <ul>
 *     <li>bag : Map<String, Money> - Doit être une map de monnaies</li>
 *     <li>add(Money m) : Money - Ajoute une monnaie au sac</li>
 *     <li>subb(Money m) : Money - Retire une monnaie du sac</li>
 * </ul>
 *
 * @author ldumay
 */
public class MoneyBag {

	private Map<String, Money> bag;

	public MoneyBag() {
		bag = new HashMap<String, Money>();
	}

}
