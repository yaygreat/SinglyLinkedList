public class NodeObject
{
    private String stringObject;

    //Constructors
    public NodeObject()
    {
        stringObject = "stringObject";
    }
    public NodeObject(String stringObject)
    {
        this.stringObject = stringObject;
    }
    
    public NodeObject deepCopy()
    {
        NodeObject clone = new NodeObject(stringObject);
        return clone;
    }

    public String toString()
    {
        return this.stringObject;
    }
}
