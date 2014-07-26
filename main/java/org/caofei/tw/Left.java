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
            case EAST:
                result = Direction.NORTH;
                break;
            case NORTH:
                result = Direction.WEST;
                break;
            case SOUTH:
                result = Direction.EAST;
                break;
            case WEST:
                result = Direction.SOUTH;
                break;
        }
        return result;
    }
}
