package com.yuwenyun;

import com.yuwenyun.tools.protos.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = Person.newBuilder()
            .setId(1)
            .setName("Owen")
            .setEmail("yuwenyun.owen.lee@gmail.com")
            .addPhones(
                Person.PhoneNumber.newBuilder()
                    .setNumber("17602184612")
                    .setType(Person.PhoneType.MOBILE)
                    .build()
            ).build();

    }
}
