package org.caofei.tw;

/**
 * Left impl
 * Created by caof on 2014/6/9.
 */
public class Move implements Action {
    @Override
    public void action(Rovar rovar) {
        switch (rovar.getDirection()) {
            case E:
                rovar.setX(rovar.getX() + 1);
                break;
            case N:
                rovar.setY(rovar.getY() + 1);
                break;
            case S:
                rovar.setY(rovar.getY() - 1);
                break;
            case W:
                rovar.setX(rovar.getX() - 1);
                break;
        }

    }
}
