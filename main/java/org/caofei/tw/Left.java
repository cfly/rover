package org.caofei.tw;

/**
 * Left impl
 * Created by caof on 2014/6/9.
 */
public class Left implements Action {
    @Override
    public void action(Rovar rovar) {
        rovar.setDirection(left(rovar.getDirection()));
    }

    private Direction left(Direction direction) {
        Direction result = null;
        switch (direction) {
            case E:
                result = Direction.N;
                break;
            case N:
                result = Direction.W;
                break;
            case S:
                result = Direction.E;
                break;
            case W:
                result = Direction.S;
                break;
        }
        return result;
    }
}
