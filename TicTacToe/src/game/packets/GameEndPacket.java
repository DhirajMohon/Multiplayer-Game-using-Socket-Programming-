package game.packets;

import java.io.Serializable;

public class GameEndPacket implements Serializable {
	private static final long serialVersionUID = 1L;
	private int winner;
	
	public GameEndPacket(int winner) {
		this.winner=winner;
	}
	
	public int getWinner() {
		return winner;
	}

}
