package com.sergeydolzgozvjaga.priorityblockingqueue.Operations;

import com.sergeydolzgozvjaga.priorityblockingqueue.Data.PersonData;
import com.sergeydolzgozvjaga.priorityblockingqueue.Model.Person;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Logger;
/**
 * Class take Persons from Queue
 * */
public class TakePerson implements Runnable {

    private final Logger logger = Logger.getLogger(String.valueOf(TakePerson.class));

    private PersonData data;

    public TakePerson() {
        Init();
    }

    private void Init(){data = new PersonData();}

    private PriorityBlockingQueue<Person> takeQueuePersons() throws InterruptedException {
        logger.info(" enter takeQueuePersons()");
        PriorityBlockingQueue<Person> takePerson = data.getAllPersons();
        takePerson.take();
        logger.info("exit takeQueuePersons()");
        return takePerson;
    }

    @Override
    public void run() {

        try {
            logger.info("start run()");
            System.out.println(Thread.currentThread().getName() + " take(): " + takeQueuePersons());
            Thread.sleep(500);
            logger.info("exit run()");
        } catch (InterruptedException e) {
            logger.warning(e.toString());
        }

    }
}
