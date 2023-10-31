import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.Scanner;

public class Week8 {

    public static void main(String[] args) {
        try {
            example7();
        }
        catch (Exception e){
            System.err.println();
        }
    }

    static void example1(){
        /*
            What is file manipulation
                using files/folders to store data
                    why? keep data
                        default behavor: data is destroyed once program finishes
                persistent data
                    Network-based storage systems
                        databases: mysql, mssql, etc
                    file-based storage system
                        sqlite, files and folders in the FS (file system)

            Java incorporates FM (file manipulation)
            packages
                java.io.*
                java.nio.*

            objects
                Paths
                    static classes
                    determine a location in FS (path location)
                    when to use PATHS: anytime that you want to declare a starting location
                Files
                    static classes
                    shortcut to CRUD
                    FILES.Operation

                Path
                    Object that stores a file or folder location
                File
                    Object that stores a specific file or folder content
                    Use File Object to make all changes
                        CRUD

         */
        Path p1 = Paths.get(".", "src", "data");
//        Path p2 = Paths.get("./src/d1.txt");
        Path p2 = Paths.get("./src/d1/d2/d3");

        File f1 = p1.toFile();
        Path p3 = f1.toPath();


        System.out.println(Files.exists(p1));
        System.out.println(Files.exists(p2));

        try{
           // Files.createFile(p2);
            //Files.createDirectory(p2);
            Files.createDirectories(p2);

        }
        catch (IOException e){
            System.err.println(e);
        }



    }

    static void example2(){
        /*
    Ask use for a username
        INSIDE of profiles directory
            create a directory named username

 */
        Path rootPath = Paths.get("./", "src", "profiles");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a username");
        String username = input.nextLine();

        Path method1 = Paths.get(rootPath + "/" + username);
        System.out.println(method1);
        Path method2 = rootPath.resolve(username);
        System.out.println(method2);

        try{
            Files.createDirectory(method2);
            System.out.println("Finished");
        }
        catch (IOException e){
            System.err.println(e);
        }

    }

    static void example3(){

        /*
        retrieving all files and folders of a specified directory
         */

        Path path = Paths.get("src/profiles");

        for(File current : Objects.requireNonNull(path.toFile().listFiles())){

            System.out.printf("File %s is a directory? %s%n",
                    current.getName(),
                    current.isDirectory()
            );
        }

    }

    static void example4(){
        /*
        CRUD with directories
            Create: already done
            Read: alread done
            Update: already done
         */
        Path path3 = Paths.get("src/data");
        Path path2 = Paths.get("src/profiles");
        Path path1 = Paths.get("src/data/profiles");
        try {
            //Files.move(path1, path2);
            //path1.toFile().renameTo(path2.toFile());

            Files.delete(path1);
            path1.toFile().delete();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }

    static void example5(){
        //working with files
        /*
            C
            R: reading and writing
            U
            D
         */
        Path path = Paths.get("src", "data");
        String filename = "test1.txt";
        try {
            //Files.writeString(path.resolve(filename), "\nHello World",StandardOpenOption.APPEND);
            Files.write(path.resolve(filename), "\nNext Line content".getBytes(), StandardOpenOption.APPEND);
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static void example6(){
        //working with files
        /*
            C
            R: reading and writing
            U
            D
         */
        Path path = Paths.get("src", "data");
        String filename = "test1.txt";
        try {
            String content = Files.readString(path.resolve(filename));
            System.out.println(content);
            //Files.write(path.resolve(filename), "\nNext Line content".getBytes(), StandardOpenOption.APPEND);
        }
        catch (Exception e){
            System.err.println(e);
        }
    }

    static void example7() throws Exception{

        /*
        Create a college semester timetable program

        Ask user for year, term
        Create the neccessary folders

        2023
            fall

        ask user for day of week.
        (no need to validate)
        tuesday
        2023
            fall
                tuesday.txt

        ask user for time and courses for that day
        Enter time of first course
            12pm
        Enter course name at {time} on {day of week}
        Enter course name at 12pm on tuesday
            comp1008
        write to tuesday.txt
            12pm-comp1008\n
         */

        Scanner input = new Scanner(System.in);
        Path root = Paths.get("src", "timetable");
        //if(Files.exists(root) || root.toFile().exists()){
        if(!root.toFile().exists()){
            Files.createDirectory(root);
        }
        //continue
        System.out.println("Enter year");
        String year = input.nextLine();
        System.out.println("Enter semester (winter, spring, fall)");
        String semester = input.nextLine();
        System.out.printf("You are now doing to input your schedule for %s %s semester%n", year, semester);
        System.out.println("Enter day of the week");
        String dayOfWeek = input.nextLine();
        System.out.println("Enter start time of any course");
        String startTime = input.nextLine();
        System.out.printf("Enter the course code for your %s class at %s%n", dayOfWeek, startTime);
        String courseCode = input.nextLine();

        Path path2 = root.resolve(year + "/" + semester);
        if(!Files.exists(path2)){
            Files.createDirectories(path2);
        }
        Path path3 = path2.resolve(dayOfWeek + ".txt");

        Files.createFile(path3);

        Files.writeString(path3,
        String.format("%s:%s%n", startTime, courseCode),
        StandardOpenOption.APPEND);



    }
}
