package com.metalgearsolid.enemystatus;

public class CautionMode implements EnemyStatus
{
	@Override
	public void update()
	{
		System.out.println("Os inimigos suspeitam de algum invasor na área.");
	}
	
	@Override
	public String toString()
	{
		return "CautionMode";
	}
}