public class linear{
 static String findmenu(String menu[],String item){

    for(int i =0;i<menu.length; i++){
        if(menu[i]==item){
            return "item found at index " +i;
  }
}
  return "item not found";
}


public static void main(String[] args){
       String menu[]={"burger", "pizza", "pasta", "salad", "soda"}; 
       String item = "pasta";
       String result = findmenu(menu, item);
       System.out.println(result);
    }
}
