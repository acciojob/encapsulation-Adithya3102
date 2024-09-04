public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        obj.setName("Alice"); 
        String retrievedName = obj.getName(); 
        System.out.println("Name (using getter): " + retrievedName);
    }
}