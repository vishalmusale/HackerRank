class Student extends Person{
	private int[] testScores;
    
    Student(String fn, String ln, int id, int[] scores){
        super(fn, ln, id);
        testScores = scores;
    }
    char calculate(){
        float average = (testScores[0] + testScores[1]) / 2;
        if(average >= 90 && average <= 100)
            return 'O';
        else if(average >= 80 && average < 90)
            return 'E';
        else if(average >= 70 && average < 80)
            return 'A';
        else if(average >= 55 && average < 70)
            return 'P';
        else if(average >= 40 && average < 55)
            return 'D';
        else
            return 'T';
    }
}