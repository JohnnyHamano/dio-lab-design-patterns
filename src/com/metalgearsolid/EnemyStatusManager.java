package com.metalgearsolid;

import com.metalgearsolid.enemystatus.EnemyStatus;

public class EnemyStatusManager
{
	private static EnemyStatusManager instance = new EnemyStatusManager();
	private EnemyStatus enemyStatus;
	
	private EnemyStatusManager()
	{
		super();
	}
	
	public static EnemyStatusManager getInstance()
	{
		return instance;
	}

	public void setStatus(EnemyStatus status)
	{
		enemyStatus = status;
		changeBehaviour(status);
	}
	
	public void changeBehaviour(EnemyStatus status)
	{
		System.out.println("Mudando comportamento inimigo para: " + status.toString());

		switch(status.toString())
		{
			case "NormalMode":
				System.out.println("Ativa o modo de comportamento normal de patrulha dos inimigos.");
				break;
			case "CautionMode":
				System.out.println("Ativa o modo de comportamento cauteloso de patrulha dos inimigos.");
				break;
			case "EvasionMode":
				System.out.println("Ativa o modo de comportamento evasivo dos inimigos.");
				break;
			case "AlertMode":
				System.out.println("Ativa o modo de alerta máximo.");
				break;
		}
	}
	
	public void update()
	{
		enemyStatus.update();
	}
}