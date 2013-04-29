
public abstract class Terminal extends RuleItem {
	public boolean isEpsilon() {
		return false;
	}
	
	public boolean isDollar() {
		return false;
	}
	
	public boolean isToken() {
		return false;
	}
	
	public boolean isTerminal() {
		return true;
	}
	
	public String toCleanString() {
		return toString();
	}
}
