package com.sergeydolzgozvjaga.priorityblockingqueue.Operations;

import com.sergeydolzgozvjaga.priorityblockingqueue.Data.PersonData;
import com.sergeydolzgozvjaga.priorityblockingqueue.Model.Person;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Logger;

/**
 * Class add Persons to Queue
 * */
public class AddPerson implements Runnable {

    private final Logger logger = Logger.getLogger(String.valueOf(AddPerson.class));

    private PersonData data;

    public AddPerson() {
        Init();
    }

    private void Init(){data = new PersonData();}

    private PriorityBlockingQueue<Person> putQueuePersons(Person person){
        PriorityBlockingQueue<Person> persons = new PriorityBlockingQueue<>();
            persons.put(person);
            return persons;
    }

    private Person newPerson(){
        Person person = new Person("Raul", 55, 5300);
        return person;
    }

    @Override
    public void run() {

        try {
            logger.info("start run()");
            putQueuePersons(newPerson());
            System.out.println(putQueuePersons(newPerson()));
            Thread.sleep(250);
            logger.info("exit run");
        } catch (InterruptedException e) {
            logger.warning(e.toString());
        }

    }
}
