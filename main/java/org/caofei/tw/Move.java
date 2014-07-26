package org.caofei.tw;

/**
 * Left impl
 * Created by caof on 2014/6/9.
 */
public class Move implements Action {
    @Override
    public void action(Rovar rovar) {
        switch (rovar.getDirection()) {
            case EAST:
                rovar.setX(rovar.getX() + 1);
                break;
            case NORTH:
                rovar.setY(rovar.getY() + 1);
                break;
            case SOUTH:
                rovar.setY(rovar.getY() - 1);
                break;
            case WEST:
                rovar.setX(rovar.getX() - 1);
                break;
        }

    }
}
