package com.brunoyam.unit_10.services;

import java.util.ArrayList;
import java.util.Collection;


public class FileReader {

    private String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    /**
     * Если файл существует, то метод возвращает коллекцию строк из файла, иначе возвращает пустую коллецию.
     * @return коллекция строк файла.
     */
    public Collection<String> readStrings() {

        Collection<String> result = new ArrayList<>();

        /*
        Используя класс java.io.File проверить существует ли файл с таким именем

        Если существует, то создать новую коллекцию строк и загрузить все строки из фаила в эту коллекцию.
        Для этого лучше использовать java.util.Scanner

        После загрузки файл удалить.

        Если файл не существует - вернуть пустую коллекцию.

         */

        return result;

    }

}
