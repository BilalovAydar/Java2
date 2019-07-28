package lesson3;

public class Record {
    private String surname;
    private String tel;

    public Record(String surname, String tel){
        this.surname = surname;
        this.tel = tel;
    }

    public String getSurname() {
        return surname;
    }

    public String getTel() {
        return tel;
    }
}
