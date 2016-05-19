public class Solution {
    // Write your code here.
    Queue<Character> q = new LinkedList<Character>();
    Stack<Character> s = new Stack<Character>();
    
    void pushCharacter(char ch){
        s.push(ch);
    }
    
    void enqueueCharacter(char ch){
        q.add(ch);
    }
    
    char popCharacter(){
        return s.pop();
    }
    
    char dequeueCharacter(){
        return q.remove();
    }