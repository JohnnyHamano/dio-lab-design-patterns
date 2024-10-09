import com.metalgearsolid.EnemyStatusManager;
import com.metalgearsolid.enemystatus.AlertMode;
import com.metalgearsolid.enemystatus.CautionMode;
import com.metalgearsolid.enemystatus.EnemyStatus;
import com.metalgearsolid.enemystatus.EvasionMode;
import com.metalgearsolid.enemystatus.NormalMode;

public class App
{
	public static void main(String[] args) throws Exception
	{
		EnemyStatusManager enemyStatusManager = EnemyStatusManager.getInstance();
		EnemyStatus enemyStatus;

		// Testes
		enemyStatus = new NormalMode();
		enemyStatusManager.setStatus(enemyStatus);
		enemyStatusManager.update();
		enemyStatus = new CautionMode();
		enemyStatusManager.setStatus(enemyStatus);
		enemyStatusManager.update();
		enemyStatus = new AlertMode();
		enemyStatusManager.setStatus(enemyStatus);
		enemyStatusManager.update();
		enemyStatus = new EvasionMode();
		enemyStatusManager.setStatus(enemyStatus);
		enemyStatusManager.update();
	}
}