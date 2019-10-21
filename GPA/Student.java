public class Student {

    // data - properties
    private String name;
    private int gradeLevel;

    private String mathScore; 
    private String englishScore;
    private String csScore;

    // constructor
    public Student(String name, int gradeLevel) {
        this.name = name ;     // "this" refers to the class private name vriable (name = n)
        setGradeLevel(gradeLevel);

        this.mathScore = "F";       // Set defaults when creating a new student
        this.englishScore = "F";
        this.csScore = "F";
    }

    // functions - abilities of this object

    // getters and setters
    public String getName(){
        return this.name;
    }

    public int getGradeLevel(){
        return this.gradeLevel;
        // if(this.gradeLevel == 9) return "Freshman";
    }

    public void setNmae(String name){
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel){
        if (gradeLevel >= 9 && gradeLevel <= 12){
            this.gradeLevel = gradeLevel;
        }
    }   
    // calculate GPA
    public double calculateGPA() {
        System.out.println("Calvulating GPA...");
        return 0.0;
    }


}