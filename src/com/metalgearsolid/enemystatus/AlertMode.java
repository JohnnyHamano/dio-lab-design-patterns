package com.metalgearsolid.enemystatus;

public class AlertMode implements EnemyStatus
{
	@Override
	public void update()
	{
		System.out.println("O inimigo descobriu o invasor, entrando em modo de combate.");
	}
	
	@Override
	public String toString()
	{
		return "AlertMode";
	}
}