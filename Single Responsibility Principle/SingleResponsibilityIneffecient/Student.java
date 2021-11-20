public class Student{
    String name;
    String id ;
    String gender;
    String session;
    public void getInfo (){
        //returns Student Info.
    }
    public void  registerForLibrary(){
        //accounts for adding students in Library.
    }
    public void showResult(){
        //used for showing Students Result.
    }
    public void submittingAssignments(){
        //submits Assignmets. 
    }
    public void markingAssignmets(){
        //marks Assignments which is clearly not the task of a student.
    }
}
/*

Here Student Class is responsible for too many things which clearly terminates Single Responsibility Rule.
Here Student Class doesn't have anyything to do with getInfo method  its not a students job to supply his/her info 
or to showResult or marking Assessments and Registration for libarary. 
So its clearly visible that it accounts for way too much which can be solved by creating other classes and decrease dependency as much
as possible .

*/