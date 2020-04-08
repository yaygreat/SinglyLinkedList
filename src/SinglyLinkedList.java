public class SinglyLinkedList
{
	private Node h;

	public SinglyLinkedList()
	{
		h = new Node();
		h.l = null;
		h.next = null;
	}

	public boolean isEmpty()
	{
		if(h.next == null)
			return true;
		else
			return false;
	}

	public boolean insert(NodeObject newListing)
	{
		Node n = new Node();
		if(n == null)
			return false;
		else
		{
			n.next = h.next;
			h.next = n;
			n.l = newListing.deepCopy();
			return true;
		}
	}

	public void showAll()
	{
		Node p = h.next;
		while(p != null)
		{
			System.out.println(p.l.toString());
			p = p.next;
		}
	}

	//selection sort to order linked list from descending order
	public void SelectionSort(/*FA2017PROJECT_Student_Dominguez student, String className*/)//go through each student looking for that class
	{
	    Node current = h;
        Node q = null;
        Node p = null;
        //System.out.println("Outside loop- current: " + current.l + " current.next.l: " + current.next.l + ", q: " + q.l + ", p: " + p.l);
        //System.out.println((Integer.valueOf((String) p.l.toString())) > (Integer.valueOf((String) current.next.l.toString())));
        while(current.next.next != null)
        {
            q = current.next;
            p = q.next;
            while (p.next != null)
            {
                //System.out.println((Integer.valueOf((String) p.l.toString())) > (Integer.valueOf((String) current.next.l.toString())));
                if ((Integer.valueOf((String) p.l.toString())) > (Integer.valueOf((String) current.next.l.toString())))
                {
                    //swap by unlinking and relinking nodes
                    Node temp = current.next;
                    current.next = q.next;
                    q.next = p.next;
                    p.next = temp;
                    p = q.next;
                }
               else
                {
                            p = p.next;
                            q = q.next;
                }
                //System.out.println("Within inside loop- current: " + current.l + " current.next.l: " + current.next.l + ", q: " + q.l + ", p: " + p.l);
            }
            if ((Integer.valueOf((String) p.l.toString())) > (Integer.valueOf((String) current.next.l.toString())))
            {
                Node temp = current.next;
                current.next = q.next;
                q.next = p.next;
                p.next = temp;
            }
            current = current.next;
            //System.out.println("Within outside loop- current: " + current.l + " current.next.l: " + current.next.l + ", q: " + q.l + ", p: " + p.l);
        }
	}

	public class Node
	{
		private NodeObject l;
		private Node next;
		public Node()
		{
		}
	}
}
