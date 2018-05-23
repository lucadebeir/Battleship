package debeir.luca;

import java.util.ArrayList;

public class IALevelZero extends IA implements IsPlayer {
	
	/**
	 * @param nomJoueur
	 * @param flotteShip
	 * @param listAttack
	 * @param listTouched
	 * @param listAttack2
	 * @param scoreJoueur
	 * @param listTouch
	 * @param listNextMissile
	 * @param tirPrec
	 */
	public IALevelZero(String nomJoueur, ArrayList<Ship> flotteShip, ArrayList<Coordinate> listAttack,
			ArrayList<String> listTouched, ArrayList<String> listAttack2, int scoreJoueur,
			ArrayList<String> listNextMissile, boolean tirPrec) {
		super(nomJoueur, flotteShip, listAttack, listTouched, listAttack2, scoreJoueur, listNextMissile, tirPrec);

	}

	/* (non-Javadoc)
	 * @see debeir.luca.Player#missileCoord(debeir.luca.IsPlayer)
	 */
	@Override
	public Coordinate missileCoord(IsPlayer player) {
		String x = this.generateCoord();
		Coordinate coord = new Coordinate(x,false);
		return coord;
	}

	/* (non-Javadoc)
	 * @see debeir.luca.Player#resultTir(debeir.luca.Coordinate)
	 */
	@Override
	public String resultTir(Coordinate coord) {
		String resT = "RATÉ";
		for(Ship ship : getFlotteShip()) {
			if (ship.isHit(coord) == true) {
				if (coord.isTouched() == true) {
					resT = "Déjà TOUCHÉ";
				} else {
					ship.setTouchedShip(ship.getTouchedShip() - 1);
					resT = "TOUCHÉ";
					if (ship.isDestroyed() == true) {
						resT = "COULÉ";
					}
				}
			}
		}
		return resT;
	}

}
