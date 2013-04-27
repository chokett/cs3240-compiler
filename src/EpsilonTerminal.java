import java.util.HashSet;
import java.util.Set;


public class EpsilonTerminal extends Terminal {
	// Keyword for epsilon variable
	public static final String EPSILON = "epsilon";
	
	private Grammar grammar;

	public EpsilonTerminal(Grammar grammar) {
		//super(grammar, "epsilon");
		this.grammar = grammar;
	}
	
	// Getters/setters
	public Grammar getGrammar() {
		return grammar;
	}

	public Set<Terminal> getFirst() {
		return new HashSet<Terminal>();
	}
	
	public Set<Terminal> getFollow() {
		return new HashSet<Terminal>();
	}
	
	public String toString() {
		return "<epsilon>";
	}
	
	public boolean isEpsilon() {
		return true;
	}
	
	// As long as it's the same grammar, they're equal.
	public int hashCode() {
		return EPSILON.hashCode() + grammar.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof EpsilonTerminal))
			return false;

		return true;
	}
}