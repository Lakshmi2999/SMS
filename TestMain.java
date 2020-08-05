
import java.util.Scanner;
public class TestMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter no of Students:");
        int total=Integer.parseInt(sc.next());
        Student studentDetails[]=new Student[total];
        while(true){
        	int ch=0;
            System.out.println("1.Register Student\n2.Display all Student Details\n3.Search Student with ID\n4.Search Student with Name\n5.Exit");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:Student s=new Student();
                        System.out.println("Enter the Student Id:");
            	        s.setStudId(Integer.parseInt(sc.next()));
                        System.out.println("Enter the Student name:");
                        s.setStudName(sc.next());
                        System.out.println("Enter the course completed:");
                        s.setCourse(sc.next());
                        System.out.println("Enter the number of contact numbers:");
                        int n=Integer.parseInt(sc.next());
                        String phnNum[]= new String[n];
                        int countOf=1;
                        for(int i=0;i<n;i++){
                            System.out.println("Enter contact number "+ countOf++ +": ");
                            phnNum[i]=sc.next();
                        }
                        s.setPhnNo(phnNum);
                        studentDetails[count++]=s;
                        break;
                case 2:if(count==0)
                		    System.out.println("****** No students registered yet ******");
                        for(int i=0;i<count;i++) {
        	                int countOfNo=1;
                            System.out.println("Student ID: "+studentDetails[i].getStudId()+"\nStudent Name: "+studentDetails[i].getStudName()+"\nCourse completed: "+studentDetails[i].getCourse());
                            for(String str:studentDetails[i].getPhnNo())
                                System.out.println("Contact Number "+countOfNo++ +": "+str);
                            System.out.println("****************************");
                        }
                        break;
                case 3:System.out.println("Enter the Student Id");
                        int idToSearch=Integer.parseInt(sc.next());
                        boolean foundId=false;
                        for(int i=0;i<count;i++){
                            if(idToSearch==studentDetails[i].getStudId()){
                                int countOfNo=1;
                                System.out.println("Student Name: "+studentDetails[i].getStudName()+"\nCourse completed: "+studentDetails[i].getCourse());
                                for(String str:studentDetails[i].getPhnNo())
                                    System.out.println("Contact Number "+countOfNo++ +": "+str);
                                System.out.println("****************************");
                                foundId=true;
                            }
                        }
                        if(foundId==false){
                            System.out.println("****** No Student with ID "+idToSearch+" ******");
                        }
                        break;
                    case 4:System.out.println("Enter the Student Name");
                        String nameToSearch=sc.next();
                        boolean foundName=false;
                        for(int i=0;i<count;i++){
                            if(nameToSearch.equals(studentDetails[i].getStudName())){
                                int countOfNo=1;
                                System.out.println("Student Id: "+studentDetails[i].getStudId()+"\nCourse completed: "+studentDetails[i].getCourse());
                                for(String str:studentDetails[i].getPhnNo())
                                    System.out.println("Contact Number "+countOfNo++ +": "+str);
                                System.out.println("****************************");
                                foundName=true;
                            }
                        }
                        if(foundName==false){
                            System.out.println("****** No Student with name "+nameToSearch+ " ******");
                        }
                        break;
                case 5:System.out.println("****** Thank you ******");
                        System.exit(0);
            }
        }
    }
}