package debeir.luca;

/**
 * @author lucadebeir
 *
 */
public interface IsPlayer {
	
	/**
	 * @param player
	 * @return
	 */
	public Coordinate missileCoord(IsPlayer player);
	/**
	 * @param coord
	 * @return
	 */
	public String resultTir(Coordinate coord);

}
