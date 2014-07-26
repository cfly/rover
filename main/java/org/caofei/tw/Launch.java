package org.caofei.tw;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cfly on 14-7-26.
 */
public class Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area area = new Area();
        area.setxMax(scanner.nextInt());
        area.setyMax(scanner.nextInt());

        ActionFactory actionFactory = new ActionFactory();
        while (scanner.hasNext()){
            Rovar rovar = new Rovar();
            rovar.setX(scanner.nextInt());
            rovar.setY(scanner.nextInt());
            rovar.setDirection(Direction.valueOf(scanner.next()));
            String actions = scanner.next();
            List<Action> actionList = new LinkedList<>();
            for (int i = 0; i < actions.length(); i++) {
                actionList.add(actionFactory.create(actions.charAt(i)));
            }
            rovar.doAction(actionList);
            System.out.println(rovar.getX() + " " + rovar.getY() + " " + rovar.getDirection().toString());
        }
    }
}
