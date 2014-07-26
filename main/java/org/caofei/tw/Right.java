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
            case EAST:
                result = Direction.SOUTH;
                break;
            case NORTH:
                result = Direction.EAST;
                break;
            case SOUTH:
                result = Direction.WEST;
                break;
            case WEST:
                result = Direction.NORTH;
                break;
        }
        return result;
    }
}
