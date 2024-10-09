package com.metalgearsolid.enemystatus;

public class EvasionMode implements EnemyStatus
{
	@Override
	public void update()
	{
		System.out.println("Os inimigos buscam ativamente o invasor na área, percorrendo todos os ambientes.");
	}
	
	@Override
	public String toString()
	{
		return "EvasionMode";
	}
}