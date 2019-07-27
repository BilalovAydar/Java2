package lesson3;

import java.util.ArrayList;

public class TelList {
    ArrayList<Record> arrayList;
    public TelList(){
        arrayList = new ArrayList<>();
    }
    public void add(Record record){
        arrayList.add(record);
    }
    public ArrayList<Record> get(String surname){
        if (!arrayList.isEmpty()){
            ArrayList<Record> arrRecs = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getSurname() == surname)
                    arrRecs.add(arrayList.get(i));
            }
            return arrRecs;
        }
        return null;
    }
}
