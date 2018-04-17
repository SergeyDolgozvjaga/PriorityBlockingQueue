package com.sergeydolzgozvjaga.priorityblockingqueue;

import com.sergeydolzgozvjaga.priorityblockingqueue.Operations.AddPerson;
import com.sergeydolzgozvjaga.priorityblockingqueue.Operations.TakePerson;

import java.util.logging.Logger;

/**
 * Application describes relations between different Persons in multithreading space
 *
 * @Author Sergey Dolgozvjaga
 * */
public class Main {

    private final static Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {

        logger.info("start app");

        AddPerson addPerson = new AddPerson();
        new Thread(addPerson).start();

        TakePerson takePerson = new TakePerson();
        new Thread(takePerson).start();

        TakePerson takePerson1 = new TakePerson();
        new Thread(takePerson1).start();

        logger.info("exiting app");

    }
}
