




import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author chamath
 */
public class Graph {

    LinkedList<Node> nodes[]=new LinkedList[28];

    public Graph() {

         for(int i=0;i<28;i++){

             nodes[i]=new LinkedList<Node>();
        }
    }

    private void buildGraph(){

        nodes[0].add((new Node('c',1,false)));
        nodes[0].add((new Node('i',2,false)));
        nodes[0].add((new Node('l',3,false)));
        nodes[0].add((new Node('s',4,false)));
        nodes[0].add((new Node('t',5,false)));
        nodes[1].add((new Node('e',6,false)));
        nodes[2].add((new Node('l',7,false)));
        nodes[3].add((new Node('a',8,false)));
        nodes[4].add((new Node('r',9,false)));
        nodes[5].add((new Node('a',10,false)));
        nodes[6].add((new Node('y',11,false)));
        nodes[7].add((new Node('a',12,false)));
        nodes[8].add((new Node('n',13,false)));
        nodes[9].add((new Node('i',14,false)));
        nodes[10].add((new Node('p',15,false)));
        nodes[11].add((new Node('l',16,false)));
        nodes[12].add((new Node('n',17,false)));
        nodes[13].add((new Node('k',18,false)));
        nodes[14].add((new Node('l',3,false)));
        nodes[15].add((new Node('r',19,false)));
        nodes[16].add((new Node('o',20,false)));
        nodes[17].add((new Node('g',21,false)));
        nodes[18].add((new Node('a',22,true)));
        nodes[19].add((new Node('o',23,false)));
        nodes[20].add((new Node('n',22,true)));
        nodes[21].add((new Node('a',24,false)));

        nodes[23].add((new Node('b',25,false)));
        nodes[24].add((new Node('i',22,true)));
        nodes[25].add((new Node('a',26,false)));
        nodes[26].add((new Node('n',27,false)));
        nodes[27].add((new Node('e',22,true)));



    }

    public void checkString(String string){
        buildGraph();
        int currentState=0;
        int nextState=0;
        Node node;
        ListIterator listIterator;
        boolean isAccepted=false;
        boolean matched=false;
         
         System.out.println("INPUT STRING - " + string);
       
        for(int i=0;i<string.length();i++){
           listIterator= nodes[currentState].listIterator();
           matched=false;
           while(listIterator.hasNext()){
               node=(Node)listIterator.next();
              // System.out.println("string char= "+ string.charAt(i) + " node char= "+node.getCharacter());
               if(node.getCharacter()==string.charAt(i)){
                 //  System.out.println("matched!!!!");
                   matched=true;
                   nextState=node.getState();
                    if(i==string.length()-1){
                        isAccepted=node.isAcceptedState();
                    }
                   break;
               }
           }
           if(matched)
           currentState=nextState;
           else
           {
               isAccepted=false;
               break;
           }

        }
       
        if(isAccepted)
        System.out.println("RESULT - ACCEPTED");
        else
          System.out.println("RESULT - REJECTED");
       
    }



}
