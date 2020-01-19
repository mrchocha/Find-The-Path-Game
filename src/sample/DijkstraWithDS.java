package sample;
import java.util.Arrays;

class Element{
    int data = Integer.MAX_VALUE;
    int distanceOf;
    int via;
    int priority;

    public Element(int data, int distanceOf, int via) {
        this.data = data;
        this.distanceOf = distanceOf;
        this.via = via;
    }

    @Override
    public String toString() {
        return "Element{" +
                "data = " + data +
                ", distanceOf = " + distanceOf +
                ", via = " + via +
                ", priority = " + priority +
                '}';
    }
}

class Stack{
    Element arr[];
    int n;
    int top = -1;

    public void initializeStack(int n){
        this.n = n;
        arr = new Element[n];
    }

    public void push(Element item) {
        if(top >= n){
            System.out.println("Stack is Full.");
        } else {
            top++;
            arr[top] = item;
        }
    }

    public Element pop(){
        Element item = null;
        if(top <= -1){
            item = null;
            System.out.println("Stack is Empty.");
        } else {
            item = arr[top];
            top--;
        }
        return item;
    }

    public void changeItem(int index, Element item){
        if(top - index + 1 <= -1){
            System.out.println("Wrong Index Entered.");
        } else {
            arr[top - index + 1] = item;
            System.out.println("Element Changed Successfully.");
        }
    }

    public void peep(int index){
        if(top - index + 1 <= -1){
            System.out.println("Entered Wrong Index!");
        } else {
            System.out.println("Number peeped at index " + index + " from top is " + arr[top - index + 1].toString());
        }
    }

    public void printStack(){
        System.out.println("Stack from bottom is : ");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i].toString());
        }
    }
}

class PriorityQueue{
    protected int n;
    protected Element arr[];
    protected int front = -1;
    protected int rear = -1;
    protected int priority = 0;

    public void initializeQueue(int size) {
        this.n = size;
        arr = new Element[n];

        return;
    }


    public void enQueue(Element element) {
        //element.priority = priority;
        if(rear == n-1){
            System.out.println("Queue is full.");
//            arr = Arrays.copyOf(arr, arr.length + 1);
        } else {
            if(front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                arr[rear] = element;
            } else {
                int cnt=0;
                for (int i = front; i <= rear; i++) {
                    if(arr[i].distanceOf == element.distanceOf){
                        cnt++;
                        if(element.data < arr[i].data){
                            arr[element.distanceOf] = element;
                            int cnt1 = 0, i1 = rear-1;

                            while(arr[i1].data > element.data && i1>=front){
                                cnt1++;
                                arr[i1+1] = arr[i1];
                                i1--;
                            }

                            arr[rear - cnt1] = element;
                            break;
                        }
                    }
                }

                if(cnt==0){
                    rear++;
                    arr[rear] = element;
                    int cnt1 = 0, i1 = rear-1;

                    while(arr[i1].data > element.data && i1>=front){
                        cnt1++;
                        arr[i1+1] = arr[i1];
                        i1--;
                    }

                    arr[rear - cnt1] = element;
                }
            }
        }

        assignPriority(arr);

    }

    public Element deQueue() {
        Element element = null;
        if(front == -1){
            System.out.println("Queue is empty.");
        } else {
            element = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Dequeue done successfully :) ");

        }
        return element;
    }

    public Element getHighestPriority(){
        Element hp;
        int maxPriority = Integer.MIN_VALUE, maxItem = 0, j=0;
        for (int i = front; i < rear+1; i++) {
            if(arr[i].priority > maxPriority){
                maxPriority = arr[i].priority;
                maxItem = arr[i].data;
                j = i;
            }
        }
        return arr[j];
    }

    public void deleteHighestPriority() {
        int maxIndex = 0;
        int maxPriority = Integer.MIN_VALUE;
        for (int i = front; i < rear+1; i++) {
            if(arr[i].priority > maxPriority){
                maxIndex = i;
                maxPriority = arr[i].priority;
            }
        }

        for (int i = maxIndex; i < rear; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
    }

    public void printQueue() {
        if(front == -1){
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i < rear+1; i++) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public void assignPriority(Element[] arr){
        for (int i = front; i <= rear; i++) {
            arr[i].priority = i;
        }
    }

}

public class DijkstraWithDS {
    int distanceTaken = 0;
    int[] pathArr = new int[1];

    int pathSize = 0;

    public void findShortestPath(int[][] adj, int src, int destination) {
        src--;
        destination--;
        int V = adj.length;
        int visited[] = new int[V];

        Stack visitedNodes = new Stack();
        visitedNodes.initializeStack(V);

        PriorityQueue nodalQueue = new PriorityQueue();
        nodalQueue.initializeQueue(V);

        Element source = new Element(0, src, -1);
        Element ways;

        nodalQueue.enQueue(source);
        ways = nodalQueue.deQueue();
        visited[ways.distanceOf] = 1;
        visitedNodes.push(ways);

        int check = 0, noPath = 0;
        while(ways.distanceOf != destination && check == 0){
            System.out.println("Ways");
            for (int i = 0; i < V; i++) {
                if(adj[ways.distanceOf][i] == 1 && visited[i] == 0){

                    Element testEle = new Element(1+ ways.data, i, ways.distanceOf);
                    nodalQueue.enQueue(testEle);
                    if(testEle.distanceOf == destination){
                        check = 1;
                        ways = testEle;
                        System.out.println("DES = "+destination+" EQ = "+ways.distanceOf);
                        visited[testEle.distanceOf] = 1;
                        visitedNodes.push(testEle);
                    }
                }
            }
            if(check == 0){
                ways = nodalQueue.deQueue();
                if(ways == null){
                    System.out.println("Such A Path Doesn't exist.");
                    noPath++;
                    break;
                }
                visited[ways.distanceOf] = 1;
                visitedNodes.push(ways);
            }
        }

        if(noPath == 0){
            Element path = visitedNodes.pop();
            distanceTaken = path.data;
            while(path.distanceOf != src){
                System.out.println((path.distanceOf+1) + " ");
                pathArr[pathSize] = path.distanceOf+1;
                pathSize++;
                pathArr = Arrays.copyOf(pathArr, pathSize+1);

                Element temp = visitedNodes.pop();

                while(temp.distanceOf != path.via){
                    temp = visitedNodes.pop();
                }
                path = temp;
            }
            System.out.println(src+1);
            pathArr[pathSize] = src+1;
        }

    }
}
