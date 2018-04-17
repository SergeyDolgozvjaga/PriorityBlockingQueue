package com.sergeydolzgozvjaga.priorityblockingqueue.Data;

import com.sergeydolzgozvjaga.priorityblockingqueue.Model.Person;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Logger;

/**
 * Class consists data
 * */
public class PersonData {

    private final Logger logger = Logger.getLogger(String.valueOf(PersonData.class));

    public PriorityBlockingQueue<Person> getAllPersons(){
        logger.info(" start getAllPersons()");
        return listPersons();
    }

    /**
     * Method collects data of Persons
     *
     * @return PriorityBlockingQueue of Persons
     * */
    private PriorityBlockingQueue<Person> listPersons(){

        logger.info("start listPersons()");
        PriorityBlockingQueue<Person> persons = new PriorityBlockingQueue<>();

        persons.put(new Person("Paul",    23, 5000));
        persons.put(new Person("John",    35, 7000));
        persons.put(new Person("Michel",  37, 6500));
        persons.put(new Person("Lee",     19, 4000));
        persons.put(new Person("Alberto", 45, 8000));
        persons.put(new Person("Sergio",  29, 9000));
        persons.put(new Person("Raul",    34, 5300));

        logger.info("exit listPersons()");
        return persons;

    }
}
