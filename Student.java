import java.util.Scanner; 
class Student {
    private String name;
    private String roll_number;
    private float marks;
    private int attendence;
    public Student(String name, String Roll_number, float Marks, int Attendence)
    {
        this.name = name;
        this.roll_number = Roll_number;
        this.marks = Marks;
        if(this.marks<0)
        {
            this.marks = 0.0f;
        }
        this.attendence = Attendence;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public String getName()
    {
        return name;
    }
    public String getRollNo()
    {
        return this.roll_number;
    }
    public void setRollNo(String newRollNo)
    {
        this.roll_number = newRollNo;
    }
    public void setMarks(float newMarks)
    {
        this.marks = newMarks;
        if(this.marks<0)
        {
            this.marks = 0.0f;
        }
    }
    public float getMarks()
    {
        return this.marks;
    }
    public void setAttendence(int newAttendence)
    {
        this.attendence = newAttendence;
    }
    public int getAttendence()
    {
        return this.attendence;
    }
    public void StudentTest()
    {
        if(attendence>75)
        {
            marks*=1.1;
            if(marks>100)
            {
                marks = 100;
            }
        }
        Display();
    }
    public void Display()
    {
        System.out.println(name + " " + roll_number + " " + marks + " " + attendence);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name rollno marks and attendence of student 1");
        String name = sc.next();
        String roll_number = sc.next();
        float marks = sc.nextFloat();
        int attendence = sc.nextInt();
        Student s1 = new Student(name,roll_number,marks,attendence);
        System.out.println("Enter name rollno marks and attendence of student 2");
        name = sc.next();
        roll_number = sc.next();
        marks = sc.nextFloat();
        attendence = sc.nextInt();
        Student s2 = new Student(name,roll_number,marks,attendence);
        s1.StudentTest();
        s2.StudentTest();
    }
}
