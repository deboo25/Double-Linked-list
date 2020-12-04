
package doublelinkedlistt;


public class DoubleLinkedListt {

  
    public static void main(String[] args) {
        DLL d=new DLL();
        d.Insertfirst(0);
           d.Insertfirst(10);
              d.Insertfirst(11);
                 d.Insertfirst(20);
                    d.Insertfirst(22);
                       d.Insertfirst(30);
                          d.Insertfirst(33);
                             d.Insertfirst(45);
                             d.displayf();
                             d.displayb();
                             d.InsertLast(66);
                             d.InsertLast(77);
                             d.InsertLast(88);
                             d.InsertLast(99);
                             d.displayb();
                             d.displayf();
                             d.deletfirst();
                               d.deletfirst();
                               d.displayf();
                               d.deletlast();
                               d.deletlast();
                               d.displayf();
                               d.insertafterkey(0, 555);
                                   d.displayf();
                                   d.deletKey(11);
                                       d.displayf();
                                       
                             
    }
    
}
