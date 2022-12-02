import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<Character> password = new ArrayList<>();
    
    System.out.println("length of pass? (14 reccomended)");
    int length = scan.nextInt(); scan.nextLine();
    System.out.println("Add a number? (y/n)");
    String ans = scan.nextLine();
    System.out.println();

    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < length-1; j++) {
        password.add(randChar());
      }
      ArrayList<String> temp = new ArrayList<>();
      password.stream().forEach(s -> {
        temp.add(String.valueOf(s));
      });
    
      if(ans.equalsIgnoreCase("y")) {
        int rnum = (int)(Math.random()*length-1);
        temp.add(rnum, Integer.toString(rnum));
      }
      temp.stream().forEach(s -> System.out.print(s));
      System.out.println();
      temp.clear(); password.clear();
    }
    
  }

  public static char[] list = {
    'a', 'b', 'c',
    'd', 'e', 'f', 
    'g', 'h', 'i', 
    'j', 'k', 'l',
    'm', 'n', 'o',
    'p', 'q', 'r',
    's', 't', 'u',
    'v', 'w', 'x',
    'y', 'z', '!',
    '@', '$', '#',
    '&', '*', '.'
  };

  public static char randChar() {
    int rn = (int)(Math.random()*list.length);
    char rand = list[rn];
    if(rn % 2 == 0 && rn < 25) {
      rand = Character.toUpperCase(rand);
    }
    return rand;
  }


  
}