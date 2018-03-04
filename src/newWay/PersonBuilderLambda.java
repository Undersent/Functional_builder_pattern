package newWay;

import oldWay.Person;

import java.util.function.Consumer;

public class PersonBuilderLambda {
    public String salutation;
    public String firstName;
    public String middleName;
    public String lastName;
    public String suffix;
    public String address;
    public boolean isFemale;
    public boolean isEmployed;
    public boolean isHomewOwner;

    public PersonBuilderLambda with(
            Consumer<PersonBuilderLambda> builderFunction) {
        builderFunction.accept(this);
        return this;
    }
    public Person createPerson() {
        return new Person(salutation, firstName, middleName,
                lastName, suffix, address, isFemale,
                isEmployed, isHomewOwner);
    }
}