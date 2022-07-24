public class StudenPracaDomowa {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();


        Student Marcin = new Student();
        Marcin.imie = "Marcin";
        Marcin.nazwisko = "Pytong";
        Marcin.nick = "MPytong";
        Marcin.numerIndeksu = 12345;
        Marcin.email = "marcin@gmail.com";
        String uczelniaMarcina = Marcin.nazwaUczelni;
        Marcin.infoUczelnia();

        Student Tomek = new Student();
        Tomek.imie = "Tomek";
        Tomek.nazwisko = "Kindybalowicz";
        Tomek.nick = "TKindybalowicz";
        Tomek.numerIndeksu = 48526;
        Tomek.email = "Tomek@gmail.com";

        Student Ania = new Student();
        Ania.imie = "Ania";
        Ania.nazwisko = "Pitok";
        Ania.nick = "APitok";
        Ania.numerIndeksu = 99999;
        Ania.email = "ania@gmail.com";


        Student[] students = new Student[3];
        students[0] = Marcin;
        students[1] = Tomek;
        students[2] = Ania;

        for (int i = 0; i < students.length; i++) {
            System.out.println("");
            students[i].przedstawSie();
            students[i].zalogujSie();
            students[i].podajNrIndeksu();
            students[i].email();


        }


    }
}












