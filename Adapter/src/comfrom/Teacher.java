package comfrom;

/**
 * Created by kaorihirata on 2017-09-03.
 */
public class Teacher {
    public static void main(String args[]){
        Chairperson chairperson = new NewTaro();
        chairperson.organizeClass();

        //太郎がどうしてもchairpersonになりたくないと言った場合に花子さんにchairpersonにお願いする。
        Chairperson chairperson1 = new Hanako();
        chairperson1.organizeClass();
    }
}
