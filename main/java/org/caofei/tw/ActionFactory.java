package org.caofei.tw;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cfly on 14-7-26.
 */
public class ActionFactory {
    public ActionFactory(){
        registAction('L',Left.class);
        registAction('R',Right.class);
        registAction('M',Move.class);
    }
    private Map<Character, Class<? extends Action>> map = new HashMap<>();

    protected void registAction(char a, Class<? extends Action> clazz) {
        map.put(a, clazz);
    }
    public Action create(char a)  {
        try {
            return map.get(a).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
