package com.brunoyam.unit_10.services;

import com.brunoyam.unit_10.entities.Person;

import java.util.ArrayList;
import java.util.Collection;

public class DataLoader implements Runnable {

    private final String filename;
    private FileReader fileReader;

    public DataLoader(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {

        fileReader = new FileReader(filename);

        /*
        Инициализировать поле fileReader новым объектом com.brunoyam.unit_10.services.FileReader.


        Создать бесконечный цикл, внутри которого будет вызываться метод readPersons и, если он вернет
        не пустую коллекцию, то коллекция будет передана для печати в
        com.brunoyam.unit_10.services.Printer.printPersons()
        если вернет пустую коллекцию, то подождать (заснуть) на пять секунд и повторить попытку.
        */

    }

    /**
     * Возвращает коллекецию объектов com.brunoyam.unit_10.entities.Person - коллекция может быть пустой!
     * @return коллекеция объектов com.brunoyam.unit_10.entities.Person
     */
    private Collection<Person> readPersons() {

        Collection<Person> persons = new ArrayList();
        /*
        Прочитать строки из файла, используя fileReader.readStrings(). Если ничего не прочитал (вернул пустую коллекцию)
        то пернуть пустую коллекцию, иначе преобразовать каждую строку в объект com.brunoyam.unit_10.entities.Person
        и вернуть коллекцию Person.
         */

        return persons;
    }

}
