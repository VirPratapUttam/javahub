package datastructure.graph;
class Vertex1
{
	private char label;
	private boolean visited;
	
	public Vertex1(char label) {
		this.label = label;
		this.visited = false;
	}
	public char getLabel() {
		return label;
	}
	public void setLabel(char label) {
		this.label = label;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
}

