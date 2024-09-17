import java.io.*;

public class FileInputStreamEx4 
{
    public static void main(String [] args) 
    {
        try (FileInputStream fin=new FileInputStream(("4_september/MyFile123.txt"));)
        {
            int b;
            while((b=fin.read())!=-1) 
            {
                System.out.print((char)b);
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found exception");
        } 
        catch(IOException e){
            System.out.println("IO Error");
        }
    }
}