package HW;

public class Main {
    public static void main(String[] arg){
        ArrayList list = new ArrayList();
        list.add(8);
        list.add(9);
        list.add(0);
        list.add(-5);
        list.add(23);
        list.add(99);
        list.add(65);
        list.add(7);
        list.add(17);
        list.add(97);
        list.add(5);
        list.print();
        System.out.println(list.getValueByIndex(3));
        list.contains(23);
        list.clear();
        list.print();
        list.add(90);
        list.add(43);
        list.add(2);
        list.print();
        System.out.println("Index of element is "+ list.indexOf(2));
        System.out.println("Size of list is "+ list.getSize());
        System.out.println("Sorted list: ");
        list.sort();
        ArrayList newList = new ArrayList();
        newList.add(9);
        newList.add(26);
        newList.add(0);
        newList.add(81);
        System.out.println("Add All");
        list.addAll(newList);
        for (int i = 0; i < list.getSize() ; i++) {
            System.out.println(list.getValueByIndex(i));
        }



    }

}
