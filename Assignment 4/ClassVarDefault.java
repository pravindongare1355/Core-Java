class Myclass{
    private int age = 18;
    private String name;
    Myclass(int age,String name)
    {
        this.age = age;
        this.name = name;

    }
    void show()
    {
        System.out.println(age+" "+name);
    }
}
class ClassVarDefault{
    public static void main(String[] args) {
        Myclass e = new Myclass(19,"Bhai");
        e.show();
    }
}