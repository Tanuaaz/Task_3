public class Record {
    private long id;
    private String phoneNumber;
    private String Name;

    Record(long id, String phoneNumber, String Name) {

        this.id = id;
        this.phoneNumber = phoneNumber;
        this.Name = Name;

    }

    Record(long id) throws CheckedExceptionClass {
        throw new CheckedExceptionClass("Record not valid, needs phone nuber and name");
    }

    Record(long id, String phoneNumber) throws CheckedExceptionClass {
        throw new CheckedExceptionClass("Record not valid, needs name");
    }

    long getId() {
        return id;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    String getName() {

        return Name;
    }
}