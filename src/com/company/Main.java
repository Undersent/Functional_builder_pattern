package com.company;

import newWay.PersonBuilderLambda;
import oldWay.Person;
import oldWay.PersonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //old way
        Person person = new PersonBuilder()
                .setSalutation("Mr.")
                .setFirstName("John")
                .setLastName("Doe")
                .setIsFemale(false)
                .setAddress(new AddressBuilder()
                        .withCity("Pune")
                        .withState("MH")
                        .withStreet("MG Road")
                        .withPin("411001")
                        .createAddress())
                .createPerson();
        //better way
        Person person2 = new PersonBuilderLambda()
                .with(personBuilderLambda -> {
                    personBuilderLambda.salutation = "Mr.";
                    personBuilderLambda.firstName = "John";
                    personBuilderLambda.lastName = "Doe";
                    personBuilderLambda.isFemale = false;
                })
                .createPerson();

        //Why not
        Person person3 = new PersonBuilderLambda()
                .with(personBuilderLambda -> {
                    personBuilderLambda.salutation = "Mr.";
                    personBuilderLambda.firstName = "John";
                    personBuilderLambda.lastName = "Doe";
                    personBuilderLambda.isFemale = false;
                })
                .with(personBuilderLambda -> personBuilderLambda.isHomewOwner = true)
                .createPerson();

        ///even more..
        Person person4 = new PersonBuilderLambda()
                .with($ -> {
                    $.salutation = "Mr.";
                    $.firstName = "John";
                    $.lastName = "Doe";
                    $.isFemale = false;
                })
                .with($ -> $.isHomewOwner = true)
                .with($ -> {
                    $.address =
                            new PersonBuilder.AddressBuilderLambda() //not implemented, just how it could look like
                                    .with($_address -> {
                                        $_address.city = "Pune";
                                        $_address.state = "MH";
                                        $_address.pin = "411001";
                                    }).createAddress();
                })
                .createPerson();
    }

}
