package component;

import constrain.Commodity;
import game.Setting;

/**
 * <p>Main component of the game.</p>
 */
public class Field implements Commodity {

    private final int coordinateX;
    private final int coordinateY;
    private boolean isActionUnderExecution;
    private Installation installation;

    public Field(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public int getCost() {
        return Setting.COST_FIELD;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public boolean getIsActionUnderExecution() {
        return isActionUnderExecution;
    }

    public void setIsActionUnderExecution(boolean isActionUnderExecution) {
        this.isActionUnderExecution = isActionUnderExecution;
    }

    public Installation getInstallation() {
        return installation;
    }

    public void setInstallation(Installation installation) {
        this.installation = installation;
    }
}
