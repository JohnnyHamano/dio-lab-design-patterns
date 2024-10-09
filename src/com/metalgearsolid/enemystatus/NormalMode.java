package com.metalgearsolid.enemystatus;

public class NormalMode implements EnemyStatus
{
	@Override
	public void update()
	{
		System.out.println("Os inimigos seguem um rota de patrulha normal.");
	}

	@Override
	public String toString()
	{
		return "NormalMode";
	}
}