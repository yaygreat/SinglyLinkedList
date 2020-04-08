import java.util.Random;
import java.util.Scanner;

public class SelectionSortLinkedList
{
    public static void main(String[] args)
    {
        //Create a single linked list of at least 10 nodes. The values in the nodes are not in sorted order of any kind
        SinglyLinkedList linkedList = new SinglyLinkedList();
        NodeObject nodeObject = new NodeObject();
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {
            //create random numbers
            String targetKey = "";
            Random random = new Random();
            int randVal = random.nextInt(10);
            String stringObject = Integer.toString(randVal);
            nodeObject = new NodeObject(stringObject);
            linkedList.insert(nodeObject);
        }
        //Now sort the linked list in descending order. Do not swap the values of nodes to sort, but instead unlink the actual nodes and re-link them so that the final list is sorted.
        //Do linked list traversal from head  : first before sort , then a second time after sort.
        System.out.println("Before sort: ");
        linkedList.showAll();
        linkedList.SelectionSort();
        System.out.println("After sort: ");
        linkedList.showAll();
    }
}
