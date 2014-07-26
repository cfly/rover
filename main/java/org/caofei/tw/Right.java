package org.caofei.tw;

/**
 * Created by caof on 2014/6/9.
 */
public class Right implements Action {
    @Override
    public void action(Rovar rovar) {
        rovar.setDirection(right(rovar.getDirection()));
    }

    private Direction right(Direction direction) {
        Direction result = null;
        switch (direction) {
            case E:
                result = Direction.S;
                break;
            case N:
                result = Direction.E;
                break;
            case S:
                result = Direction.W;
                break;
            case W:
                result = Direction.N;
                break;
        }
        return result;
    }
}
