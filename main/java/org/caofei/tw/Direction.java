package org.caofei.tw;

/**
 * Created by cfly on 14-7-26.
 */
public enum Direction {
    N, E, W, S;
    public Direction valueof(String v){
        Direction result = null;
        switch (v){
            case "N":
                result = N;
                break;
            case "E":
                result = E;
                break;
            case "W":
                result = W;
                break;
            case "S":
                result = S;
                break;
        }
        return result;
    }
}
