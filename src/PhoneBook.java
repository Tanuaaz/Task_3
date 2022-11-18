import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    static ArrayList<Record> recordsList = new ArrayList<>();

    PhoneBook(Record r) {
        recordsList.add(r);
    }
    public List<Record> getAllRecords(){
        return recordsList;
    }

    //Adds new record to the records list
    public void createRecord(Record record) throws CheckedExceptionClass {
        for (Record r: recordsList){
            if(record.getPhoneNumber() == r.getPhoneNumber()){
                throw new CheckedExceptionClass("Phone Number Already Exists : It can`t be two records with the same phone number");
            }
            if(record.getId() == r.getId()){
                throw new CheckedExceptionClass("Id Already Exists : It can`t be two records with the same id");
            }
        }
        recordsList.add(record);
    }

    //Changes values of the existing record in the records list
    public void updateRecord(Record record){
        for (Record r: recordsList){
            if (r.getId() == record.getId()){
                recordsList.set(recordsList.indexOf(r), record);
                return;
            }
        }
        throw new UncheckedExceptionClass("Record not found");
    }

    //Deletes record from the records list
    public void deleteRecord(long id){
        for (Record r: recordsList){
            if (r.getId() == id){
                recordsList.remove(recordsList.indexOf(r));
                return;
            }
        }
        throw new UncheckedExceptionClass("Record not found");
    }

}
