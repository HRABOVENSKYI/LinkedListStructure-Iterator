package org.example;

import java.net.Socket;
import java.time.LocalDate;
import java.util.Iterator;

public class App {

    public static void main( String[] args ) {

        PhoneList phones = new PhoneList();

        phones.add(new Phone("Mi Redmi Note 7", LocalDate.of(2017, 11, 4),
                Phone.Color.BLACK));
        phones.add(new Phone("Mi Redmi Note 6", LocalDate.of(2017, 11, 4),
                Phone.Color.BLACK));
        phones.add(new Phone("Mi Redmi Note 7", LocalDate.of(2017, 11, 4),
                Phone.Color.WHITE));
        phones.add(new Phone("Mi Redmi Note 7 PRO", LocalDate.of(2017, 11, 4),
                null));
        phones.add(new Phone("Mi Redmi Note 7", LocalDate.of(2017, 11, 4),
                null));

//        phones.print();

//        printPhonesUsingForEach(phones);

//        printPhonesUsingIterator(phones);

        phones.forEach(System.out::println);
    }

    private static void printPhonesUsingForEach(PhoneList phones) {
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }

    private static void printPhonesUsingIterator(PhoneList phones) {
        Iterator<Phone> phoneIterator = phones.iterator();
        while (phoneIterator.hasNext()) {
            System.out.println(phoneIterator.next());
        }
    }
}
