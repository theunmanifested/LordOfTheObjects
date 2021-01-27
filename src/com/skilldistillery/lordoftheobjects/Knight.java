package com.skilldistillery.lordoftheobjects;

public class Knight extends PlayerRoles{
	private String name;
	private boolean hasWeapon;
//	private int hitPoints = 100;
//	private int experience = 0;
	
	public Knight() {
		super();
	}
	public Knight(String name, boolean hasWeapon) {
		super();
		this.name = name;
		this.hasWeapon = hasWeapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHasWeapon() {
		return hasWeapon;
	}
	public void setHasWeapon(boolean hasWeapon) {
		this.hasWeapon = hasWeapon;
	}
//	public int getHitPoints() {
//		return hitPoints;
//	}
//	public void setHitPoints(int hitPoints) {
//		this.hitPoints = hitPoints;
//	}
//	public int getExperience() {
//		return experience;
//	}
//	public void setExperience(int experience) {
//		this.experience = experience;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + experience;
		result = prime * result + (hasWeapon ? 1231 : 1237);
//		result = prime * result + hitPoints;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Knight other = (Knight) obj;
//		if (experience != other.experience)
//			return false;
		if (hasWeapon != other.hasWeapon)
			return false;
//		if (hitPoints != other.hitPoints)
//			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Knight [name=" + name + ", hasWeapon=" + hasWeapon + ", hitPoints=" + super.getHitPoints() + ", experience="
				+ super.getExperience() + "]";
	}
	
	

}
