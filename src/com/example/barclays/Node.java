package com.example.barclays;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {

	private String name;
	private List<Path> destinations = new ArrayList<>();
	private double minimumDistance = Double.POSITIVE_INFINITY;
	private Node prev;

	public Node(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Path> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Path> dest) {
		this.destinations = dest;
	}

	public double getMinimumDistance() {
		return minimumDistance;
	}

	public void setMinimumDistance(double minimumDistance) {
		this.minimumDistance = minimumDistance;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void addDestination(Path dest) {
		this.destinations.add(dest);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Node other = (Node) obj;
		if (name == null) {
            return other.name == null;
		} else return name.equals(other.name);
    }

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Node o) {
		return Double.compare(this.minimumDistance, o.minimumDistance);
	}

}
