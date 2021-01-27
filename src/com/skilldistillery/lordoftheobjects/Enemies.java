package com.skilldistillery.lordoftheobjects;

public abstract class Enemies {
	private int enemHitPoints = 100;
	
	public void eAttack(PlayerRoles chosenPlayer) {
		// enemy attacks
	}

	public int getEnemHitPoints() {
		return enemHitPoints;
	}

	public void setEnemHitPoints(int enemHitPoints) {
		this.enemHitPoints = enemHitPoints;
	}
	
	
}
