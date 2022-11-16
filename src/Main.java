public class Main {

    public static void main(String[] args) throws CheckedExceptionClass  {

        try {
            Record record = new Record(1, "1", "Tanya");
            PhoneBook phonebook = new PhoneBook(record);
            Record record1 = new Record(2, "1", "Tanya");
            phonebook.updateRecord(record1);
        } catch (UncheckedExceptionClass exception) {
            System.out.println(exception);

        }

        try {
            Record record = new Record(1, "1234");
        } catch (CheckedExceptionClass exception) {
            System.out.println(exception);
        }

        try {
            Record record = new Record(1, "1234", "Tanya");
            PhoneBook phonebook = new PhoneBook(record);
            phonebook.deleteRecord(2);
        } catch (UncheckedExceptionClass exception) {
            System.out.println(exception);
        }

        try {
            Record record1 = new Record(1, "1234", "Tanya");
            Record record2 = new Record(2, "1234", "Tanya");
            PhoneBook phonebook = new PhoneBook(record1);
            phonebook.createRecord(record2);
        } catch (CheckedExceptionClass exception){
            System.out.println(exception);
        }

        try {
            Record record1 = new Record(1, "1234", "Tanya");
            Record record2 = new Record(1, "12345", "Tanya");
            PhoneBook phonebook = new PhoneBook(record1);
            phonebook.createRecord(record2);
        } catch (CheckedExceptionClass exception){
            System.out.println(exception);
        }


    }
}