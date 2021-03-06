public class ScanResult {
	public State lastAccept;
	public int lastPointer;
	public boolean accepts;

	public ScanResult(State lastAccept, int lastPointer, boolean accepts) {
		this.lastAccept = lastAccept;
		this.lastPointer = lastPointer;
		this.accepts = accepts;
	}
	
	public String toString() {
		return "Last accepted "+lastAccept+" up to "+lastPointer+"; "+((accepts) ? "accepted" : "rejected");
	}
}
