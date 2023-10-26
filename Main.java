import java.util.ArrayList;
import java.util.Scanner;

// ADD LIST CLASS

class Main {
  
  public static void main(String[] args) {
    
    ArrayList<String> list = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    String input;

    //testing purposes
    list.add("hello");
    list.add("bye");
    list.add("yellow");
    list.add("blue");
    list.add("bird");

    // Opening Messages
    System.out.println("Welcome!\n" 
                       + "Today we will be making a to-do list!\n"); // (press enter to continue thoughout this program)");

    help();
    
    
  }

  public static void help() {
    
    System.out.println("INSTRUCTIONS\n" 
                       + "Type the following to manipulate the to-do list\n\n" 
                       + "\"Add\" - Add an item to your to-do list\n" 
                       + "\"Edit\" - Edit an item in your to-do list\n" 
                       + "\"Delete\" - Delete an item from your to-do list\n" 
                       + "\"Contains\" - Check if an item is contained in your to-do list\n" 
                       + "\"Print\" - Prints out the contents of your to-do list\n" 
                       + "\"Help\" - Shows these instuctions again!\n\n" 
                       + "Good Luck!\n");
    
  }

  public static void add(ArrayList<String> TodoList, String item) {
    
    TodoList.add(item);
    
  }

  public static void edit(ArrayList<String> TodoList, String item, String newItem) {

    int index = TodoList.indexOf(item);

    if(index == -1)
      System.out.println("item \"" + item + "\" is not in your to-do list!");
    else
      TodoList.set(index, newItem);

    System.out.println("Item has been changed to " + item + " in the to-do list!");
    
  }

  public static void delete(ArrayList<String> TodoList, String item) {

    int index = TodoList.indexOf(item);

    if(index == -1)
      System.out.println("item \"" + item + "\" is not in your to-do list!");
    else
      TodoList.remove(index);

    System.out.println(item + " has been deleted from the to-do list!");
    
  }

  public static void contains(ArrayList<String> TodoList, String item) {
  
    if(TodoList.contains(item))
      System.out.println("item \"" + item + "\" is in your to-do list!");
    else
      System.out.println("item \"" + item + "\" is NOT in your to-do list!");
    
  }

  public static void print(ArrayList<String> TodoList) {
    
    for(String item : TodoList) {
      System.out.println(item);
    }
    
  }
  
}