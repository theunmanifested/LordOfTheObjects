package com.skilldistillery.lordoftheobjects;

public class Orc extends Enemies{
	private String enemName = "Orc";
	private int enemHitPoints = 100;
	
	public Orc() {
		super();
	}

	public Orc(String enemName, int enemHitPoints) {
		super();
		this.enemName = enemName;
		this.enemHitPoints = enemHitPoints;
	}

	public String getEnemName() {
		return enemName;
	}

	public void setEnemName(String enemName) {
		this.enemName = enemName;
	}

	public int getEnemHitPoints() {
		return enemHitPoints;
	}

	public void setEnemHitPoints(int enemHitPoints) {
		this.enemHitPoints = enemHitPoints;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + enemHitPoints;
		result = prime * result + ((enemName == null) ? 0 : enemName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orc other = (Orc) obj;
		if (enemHitPoints != other.enemHitPoints)
			return false;
		if (enemName == null) {
			if (other.enemName != null)
				return false;
		} else if (!enemName.equals(other.enemName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orc [enemName=" + enemName + ", enemHitPoints=" + enemHitPoints + "]";
	}
	
	
	
	
}
