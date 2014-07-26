package org.caofei.tw;

import java.util.List;

/**
 * rover
 * Created by caof on 2014/6/9.
 */
public class Rovar {
    private int x;
    private int y;
    private Direction direction;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void doAction(List<Action> actions) {
        for (Action action : actions) {
            action.action(this);
        }
    }
}
