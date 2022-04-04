package Solution_5;

public class Teacher extends People{
    String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }
    @Override
    public int getAge(){
        return age;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getProfession() {
        return profession;
    }
    public String getSubject(){
        return subject;
    }
    public String giveALesson(){
        return "The lesson was ended";
    }
}
