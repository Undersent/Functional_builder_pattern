package oldWay;

public class PersonBuilder {
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String address;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomewOwner;

    public PersonBuilder setSalutation(String salutation) {
        this.salutation = salutation;
        return this;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
        return this;
    }

    public PersonBuilder setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
        return this;
    }

    public PersonBuilder setIsHomewOwner(boolean isHomewOwner) {
        this.isHomewOwner = isHomewOwner;
        return this;
    }

    public Person createPerson() {
        return new Person(salutation, firstName, middleName, lastName, suffix, address, isFemale, isEmployed, isHomewOwner);
    }
}