package DAO;

import CollectionObjects.Person;
import Exceptions.GiveParPersonException;

import java.util.HashMap;

public class PersonAskManager {
    private final Float MAX_Y = Float.valueOf(103);
    private final Integer MIN_HEIGHT = Integer.valueOf(0);
    private final double MIN_WEIGHT = 0;
    private HashMap<String, Object> personPar;
    public PersonAskManager(){

    }
    public Person createPerson() throws GiveParPersonException {
        for (String par : personPar.keySet()) {
            if (personPar.get(par) == null){
                throw new GiveParPersonException(par);
            }
            personPar
        }
    }
}
