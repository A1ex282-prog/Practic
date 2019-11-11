public class LogicalOpTable {
    public static void main (String args[]){
        boolean p, q;
        int x,y;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = false;
        x = 1;
        y = 0;
        System.out.print(x + "\t\t" + x + "\t\t");
        if(!(p&q))System.out.print(x + "\t\t");
        if(p|q)System.out.print(x + "\t\t");
        if(p^q)System.out.print(y + "\t\t");
        if(!(!p))System.out.println(y + "\t\t");

        p = true;
        q = false;
        x = 1;
        y = 0;
        System.out.print(x + "\t\t" + y + "\t\t");
        if(!(p&q))System.out.print(y + "\t\t");
        if(p|q)System.out.print(x + "\t\t");
        if(p^q)System.out.print(x + "\t\t");
        if(!(!p))System.out.println(y + "\t\t");

        p = true;
        q = false;
        x = 1;
        y = 0;
        System.out.print(y + "\t\t" + x + "\t\t");
        if(!(p&q))System.out.print(y + "\t\t");
        if(p|q)System.out.print(x + "\t\t");
        if(p^q)System.out.print(x + "\t\t");
        if(!(!p))System.out.println(x + "\t\t");

        p = true;
        q = false;
        x = 1;
        y = 0;
        System.out.print(y + "\t\t" + y + "\t\t");
        if(!(p&q))System.out.print(y + "\t\t");
        if(p|q)System.out.print(y + "\t\t");
        if(p^q)System.out.print(y + "\t\t");
        if(!(!p))System.out.println(x + "\t\t");
    }
}
